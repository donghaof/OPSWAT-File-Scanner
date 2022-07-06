#####To run the project, you need to have **maven** and **java** installed

You will need to register for a free account at https://metadefender.opswat.com/
This will create an account and generate a trial apikey.
Copy and paste your apikey to API_KEY variable. 

```java
public class UploadFile {

    public final static String API_KEY = "YOUR API KEY";

    public static void main(String[] args) {

```

Open a terminal and follow the path .../API/

#How to compile:

Execute command:

mvn clean package

#How to run:

Place the file for analysis next to the uploadfile-jar-with-dependencies.jar

Execute command:

java -jar uploadfile-jar-with-dependencies.jar <YourFileName.*>
