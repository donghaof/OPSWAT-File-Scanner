import java.util.ArrayList;
/**
 * This class to convert from Json string
 */

public class Msg {
    public Error error;
}
class Error{
    public int code;
    public ArrayList<String> messages;
}