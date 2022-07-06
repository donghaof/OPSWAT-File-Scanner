import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class UploadFile {

    public final static String API_KEY = "92cf023f694db7134408f4892e8ef75b";

    public static void main(String[] args) {
        //check input file name
        if (args.length == 0) {
            System.out.println("The filename is missing in the passed parameters.");
            System.exit(-1);
        }
        String fileName = args[0];
        //check if file doesn't exist
        if (!new File(fileName).exists()) {
            System.out.println("File " + fileName + " doesn't exist.");
        }
        //calculate sha256 hash from file
        String sha256Hash = calculateSHA256Hash(fileName);
        //Perform a hash lookup against metadefender.opswat.com and see if there are
        //previously cached results for the file
        String json = retrievingScanReportsUsingDataHash(sha256Hash);

        Msg msg = jsonToMsg(json);
        if (msg == null) {
            //If results are found
            Root root = jsonToRoot(json);
            if (root != null) {
                //Display results
                printReport(root, fileName);
            }


        } else {
            //If results are not found, upload the file and receive a "data_id"
            json = analyzeFile(fileName);

            String sha256 = findValueFromJSONString(json, "sha256");
            String data_id = findValueFromJSONString(json, "data_id");

            String response = retrievingScanResults(data_id, sha256);

            Root toRoot = jsonToRoot(response);
            //Repeatedly pull on the "data_id" to retrieve results
            while (toRoot!=null && !checkDataPercentage(toRoot)){

                response = retrievingScanResults(data_id, sha256);
                toRoot = jsonToRoot(response);
                try {
                    Thread.sleep(5000); //waiting 5 sec for the file to be processed
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }



            if (toRoot != null) {
                //Display results
                printReport(toRoot, fileName);
            }
        }


    }

    /**
     * Print report
     * @param root Root
     * @param fileName String
     */
    private static void printReport(Root root, String fileName) {
        System.out.println("File name: " + fileName);
        System.out.println();
        System.out.println("Overal status: " + root.scan_results.scan_all_result_a);
        System.out.println();
        System.out.println(root);

    }

    /**
     * Retrieves scan reports by looking up a hash using MD5, SHA1 or SHA256
     *
     * @param hash MD5, SHA1 or SHA256
     * @return String
     */
    private static String retrievingScanReportsUsingDataHash(String hash) {
        if (hash == null || hash.isEmpty()) {
            return null;
        }
        CloseableHttpClient client = null;
        try {
            client = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet("https://api.metadefender.com/v4/hash/" + hash);
            httpGet.setHeader("apikey", API_KEY);
            CloseableHttpResponse response = client.execute(httpGet);
            return EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (client != null) {
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }


    /**
     * Generates an almost unique, fixed-size 256-bit (32-byte) hash
     *
     * @param fileName File name
     * @return String
     */
    private static String calculateSHA256Hash(String fileName) {
        FileInputStream fis = null;
        try {
            //Get file input stream for reading the file content
            fis = new FileInputStream(fileName);
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            //Create byte array to read data in chunks
            byte[] byteArray = new byte[1024];
            int bytesCount = 0;

            //Read file data and update in message digest
            while ((bytesCount = fis.read(byteArray)) != -1) {
                digest.update(byteArray, 0, bytesCount);
            }
            //Get the hash's bytes
            byte[] bytes = digest.digest();

            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                //close the stream;
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

    /**
     * @param fileName
     * @return
     */
    private static String analyzeFile(String fileName) {
        CloseableHttpClient client = null;
        try {
            client = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost("https://api.metadefender.com/v4/file");

            httpPost.setHeader("apikey", API_KEY);

            //application/octet-stream (when doing binary upload)
            httpPost.setHeader("Content-Type", "application/octet-stream");
            httpPost.setHeader("filename", fileName);

            File file = new File(fileName);
            if (!file.exists()) {
                throw new FileNotFoundException("File: " + fileName + " not exist.");
            }
            FileBody fileBody = new FileBody(file, ContentType.DEFAULT_BINARY);

            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
            builder.addPart("upfile", fileBody);

            HttpEntity entity = builder.build();
            httpPost.setEntity(entity);

            CloseableHttpResponse response = client.execute(httpPost);

            return EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (client != null) {
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }


    /**
     * Converts json String to Root object
     *
     * @param json String
     * @return Root
     */
    private static Root jsonToRoot(String json) {
        Root root = null;
        try {
            ObjectMapper om = new ObjectMapper();
            root = om.readValue(json, Root.class);
        } catch (Exception e) {

        }
        return root;
    }

    /**
     * Converts json String to Msg object
     *
     * @param json String
     * @return Msg
     */
    private static Msg jsonToMsg(String json) {
        Msg msg = null;
        try {
            ObjectMapper om = new ObjectMapper();
            msg = om.readValue(json, Msg.class);
        } catch (Exception e) {

        }
        return msg;
    }

    /**
     * Returns propertyName value from json String
     *
     * @param json         String
     * @param propertyName String
     * @return String
     * @throws IOException
     */
    private static String findValueFromJSONString(String json, String propertyName) {
        if (json == null || json.isEmpty() || propertyName == null || propertyName.isEmpty()) {
            return null;
        }
        try {
            JsonNode parent = new ObjectMapper().readTree(json);
            return parent.path(propertyName).asText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * Retrieve scan results. Scan is done asynchronously and each scan request is tracked by a dataID.
     * Initiating file scans and retrieving the results need to be done using two separate API calls.
     * This request needs to be made multiple times until the scan is complete.
     * Scan completion can be traced using scan_results.progress_percentage value from the response.
     * @param dataId String
     * @return String
     */
    public static String retrievingScanResults(String dataId, String hash) {
        if (dataId == null || dataId.isEmpty()) {
            return null;
        }
        CloseableHttpClient client = null;
        try {
            client = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet("https://api.metadefender.com/v4/file/" + dataId);

            httpGet.setHeader("apikey", API_KEY);
            httpGet.setHeader("x-file-metadata", hash);


            CloseableHttpResponse response = client.execute(httpGet);

            String json = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);

            return json;


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (client != null) {
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /**
     * Checks the percentage of the check report.
     * Returns true if percentage is 100 otherwise returns false
     *
     * @param root Root
     * @return boolean
     */
    private static boolean checkDataPercentage(Root root) {
        if (root != null && root.process_info!=null ) {
            return root.process_info.progress_percentage == 100;
        }
        return false;
    }

}
