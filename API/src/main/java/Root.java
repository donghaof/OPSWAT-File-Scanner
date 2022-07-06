import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Date;

/**
 * This class to convert from Json string
 */
public class Root {
    public boolean appinfo;
    public int scan_result_history_length;
    public boolean sandbox;
    public String file_id;
    public String data_id;
    public ProcessInfo process_info;
    public ScanResults scan_results;
    public FileInfo file_info;
    public int share_file;
    public int private_processing;
    public String rest_version;
    public String scan_with;
    public ArrayList<Object> additional_info;
    public Votes votes;
    public boolean stored;

    @Override
    public String toString() {
        return scan_results + "\n";

    }
}

class AegisLab {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class AhnLab {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class Antiy {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class Avira {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class Bitdefender {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class ClamAV {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class CrowdStrikeFalconML {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }


}


class Cyren {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class Emsisoft {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class ESET {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class FileInfo {
    public int file_size;
    public Date upload_timestamp;
    public String md5;
    public String sha1;
    public String sha256;
    public String file_type_category;
    public String file_type_description;
    public String file_type_extension;
    public String display_name;
}

class Filseclab {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class HAURI {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class Huorong {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class IKARUS {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class Jiangmin {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class K7 {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class Kaspersky {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class McAfee {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class NANOAV {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class OnAV {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class ProcessInfo {
    public int progress_percentage;
    public String result;
    public String blocked_reason;
    public String profile;

}

class QuickHeal {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class RocketCyber {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class ScanDetails {
    @JsonProperty("AegisLab")
    public AegisLab aegisLab;
    @JsonProperty("AhnLab")
    public AhnLab ahnLab;
    @JsonProperty("Antiy")
    public Antiy antiy;
    @JsonProperty("Avira")
    public Avira avira;
    @JsonProperty("Bitdefender")
    public Bitdefender bitdefender;
    @JsonProperty("ClamAV")
    public ClamAV clamAV;
    @JsonProperty("CrowdStrike Falcon ML")
    public CrowdStrikeFalconML crowdStrikeFalconML;
    @JsonProperty("Cyren")
    public Cyren cyren;
    @JsonProperty("ESET")
    public ESET eSET;
    @JsonProperty("Emsisoft")
    public Emsisoft emsisoft;
    @JsonProperty("Filseclab")
    public Filseclab filseclab;
    @JsonProperty("HAURI")
    public HAURI hAURI;
    @JsonProperty("Huorong")
    public Huorong huorong;
    @JsonProperty("IKARUS")
    public IKARUS iKARUS;
    @JsonProperty("Jiangmin")
    public Jiangmin jiangmin;
    @JsonProperty("K7")
    public K7 k7;
    @JsonProperty("Kaspersky")
    public Kaspersky kaspersky;
    @JsonProperty("McAfee")
    public McAfee mcAfee;
    @JsonProperty("NANOAV")
    public NANOAV nANOAV;
    @JsonProperty("Quick Heal")
    public QuickHeal quickHeal;
    @JsonProperty("RocketCyber")
    public RocketCyber rocketCyber;
    @JsonProperty("Scrutiny")
    public Scrutiny scrutiny;
    @JsonProperty("Sophos")
    public Sophos sophos;
    @JsonProperty("SUPERAntiSpyware")
    public SUPERAntiSpyware sUPERAntiSpyware;
    @JsonProperty("TACHYON")
    public TACHYON tACHYON;
    @JsonProperty("Trend Micro")
    public TrendMicro trendMicro;
    @JsonProperty("Trend Micro HouseCall")
    public TrendMicroHouseCall trendMicroHouseCall;
    @JsonProperty("OnAV")
    public OnAV onAV;
    @JsonProperty("VirusBlokAda")
    public VirusBlokAda virusBlokAda;
    @JsonProperty("Webroot SMD")
    public WebrootSMD webrootSMD;
    @JsonProperty("Xvirus Anti-Malware")
    public XvirusAntiMalware xvirusAntiMalware;
    @JsonProperty("Zillya!")
    public Zillya zillya;
    @JsonProperty("Vir.IT eXplorer")
    public VirITEXplorer virITEXplorer;
    @JsonProperty("Vir.IT ML")
    public VirITML virITML;


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        if (aegisLab != null) {
            sb.append("Engine: aegislab\n" + aegisLab + "\n");
        }
        if (ahnLab != null) {
            sb.append("Engine: ahnLab\n" + ahnLab + "\n");
        }
        if (antiy != null) {
            sb.append("Engine: antiy\n" + antiy + "\n");
        }
        if (avira != null) {
            sb.append("Engine: avira\n" + avira + "\n");
        }
        if (bitdefender != null) {
            sb.append("Engine: bitdefender\n" + bitdefender + "\n");
        }
        if (clamAV != null) {
            sb.append("Engine: clamAV\n" + clamAV + "\n");
        }
        if (crowdStrikeFalconML != null) {
            sb.append("Engine: crowdStrikeFalconML\n" + crowdStrikeFalconML + "\n");
        }
        if (cyren != null) {
            sb.append("Engine: cyren\n" + cyren + "\n");
        }
        if (eSET != null) {
            sb.append("Engine: eSET\n" + eSET + "\n");
        }
        if (emsisoft != null) {
            sb.append("Engine: emsisoft\n" + emsisoft + "\n");
        }
        if (filseclab != null) {
            sb.append("Engine: filseclab\n" + filseclab + "\n");
        }
        if (hAURI != null) {
            sb.append("Engine: hAURI\n" + hAURI + "\n");
        }
        if (iKARUS != null) {
            sb.append("Engine: iKARUS\n" + iKARUS + "\n");
        }
        if (jiangmin != null) {
            sb.append("Engine: jiangmin\n" + jiangmin + "\n");
        }
        if (k7 != null) {
            sb.append("Engine: k7\n" + k7 + "\n");
        }
        if (kaspersky != null) {
            sb.append("Engine: kaspersky\n" + kaspersky + "\n");
        }
        if (mcAfee != null) {
            sb.append("Engine: mcAfee\n" + mcAfee + "\n");
        }
        if (nANOAV != null) {
            sb.append("Engine: nANOAV\n" + nANOAV + "\n");
        }
        if (quickHeal != null) {
            sb.append("Engine: quickHeal\n" + quickHeal + "\n");
        }
        if (rocketCyber != null) {
            sb.append("Engine: rocketCyber\n" + rocketCyber + "\n");
        }
        if (scrutiny != null) {
            sb.append("Engine: scrutiny\n" + scrutiny + "\n");
        }
        if (sophos != null) {
            sb.append("Engine: sophos\n" + sophos + "\n");
        }
        if (sUPERAntiSpyware != null) {
            sb.append("Engine: sUPERAntiSpyware\n" + sUPERAntiSpyware + "\n");
        }
        if (tACHYON != null) {
            sb.append("Engine: tACHYON\n" + tACHYON + "\n");
        }
        if (trendMicro != null) {
            sb.append("Engine: trendMicro\n" + trendMicro + "\n");
        }
        if (trendMicroHouseCall != null) {
            sb.append("Engine: trendMicroHouseCall\n" + trendMicroHouseCall + "\n");
        }
        if (onAV != null) {
            sb.append("Engine: onAV\n" + onAV + "\n");
        }
        if (virusBlokAda != null) {
            sb.append("Engine: virusBlokAda\n" + virusBlokAda + "\n");
        }
        if (webrootSMD != null) {
            sb.append("Engine: webrootSMD\n" + webrootSMD + "\n");
        }
        if (xvirusAntiMalware != null) {
            sb.append("Engine: xvirusAntiMalware\n" + xvirusAntiMalware + "\n");
        }
        if (zillya != null) {
            sb.append("Engine: zillya\n" + zillya + "\n");
        }
        if (virITEXplorer != null) {
            sb.append("Engine: virITEXplorer\n" + virITEXplorer + "\n");
        }
        if (virITML != null) {
            sb.append("Engine: virITML\n" + virITML + "\n");
        }
        return sb.toString();

    }
}

class ScanResults {
    public ScanDetails scan_details;
    public int scan_all_result_i;
    public Date start_time;
    public int total_time;
    public int total_avs;
    public int total_detected_avs;
    public int progress_percentage;
    public String scan_all_result_a;

    @Override
    public String toString() {
        return scan_details + "\n";
    }
}

class Scrutiny {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class Sophos {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class SUPERAntiSpyware {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class TACHYON {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class TrendMicro {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class TrendMicroHouseCall {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class VirITEXplorer {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class VirITML {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class VirusBlokAda {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class Votes {
    public int up;
    public int down;
}

class WebrootSMD {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class XvirusAntiMalware {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }
}

class Zillya {
    public int scan_result_i;
    public int scan_time;
    public String threat_found;
    public String def_time;

    @Override
    public String toString() {
        return "scan_result_i: " + scan_result_i + "\n" +
                "scan_time: " + scan_time + "\n" +
                "hreat_found: " + threat_found + "\n" +
                "def_time: " + def_time + "\n";
    }


    class AegisLab {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class AhnLab {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class Antiy {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class Avira {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class Bitdefender {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class ClamAV {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class CrowdStrikeFalconML {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }


    }


    class Cyren {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class Emsisoft {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class ESET {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class FileInfo {
        public int file_size;
        public Date upload_timestamp;
        public String md5;
        public String sha1;
        public String sha256;
        public String file_type_category;
        public String file_type_description;
        public String file_type_extension;
        public String display_name;
    }

    class Filseclab {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class HAURI {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class Huorong {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class IKARUS {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class Jiangmin {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class K7 {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class Kaspersky {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class McAfee {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class NANOAV {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class OnAV {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class ProcessInfo {
        public int progress_percentage;
        public String result;
        public String blocked_reason;
        public String profile;

    }

    class QuickHeal {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

    class RocketCyber {
        public int scan_result_i;
        public int scan_time;
        public String threat_found;
        public String def_time;

        @Override
        public String toString() {
            return "scan_result_i: " + scan_result_i + "\n" +
                    "scan_time: " + scan_time + "\n" +
                    "hreat_found: " + threat_found + "\n" +
                    "def_time: " + def_time + "\n";
        }
    }

}
