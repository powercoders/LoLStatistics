package lolstats;

public class StringFormat {
    public String fmt1 = "";
    public int a;

    public StringFormat(String str) {
        fmt1 = str.replace("[{\"id\":\"", "");
        a = fmt1.indexOf("\"");
        fmt1 = fmt1.substring(0, a);
    }
}
