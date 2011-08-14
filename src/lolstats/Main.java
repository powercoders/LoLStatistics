package lolstats;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static WebReader webReader;
    public static StringFormat stringFormat;
    public static Stats st;
    public static String summoners = "";
    public static String idSearchURL = "http://lolstatistics.com/search/ajax/?q=";
    public static String statSearchURL = "http://lolstatistics.com/player/na/";

    public static void main(String[] args) {
        System.out.print("Search Summoner's Stats: ");
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        try {
            summoners = reader.readLine();
        } catch(Exception e) {}
        webReader = new WebReader(idSearchURL + summoners);
        if(webReader.webData != null) {
            stringFormat = new StringFormat(webReader.webData);
        }
        if(stringFormat.fmt1 != null) {
            webReader = new WebReader(statSearchURL + stringFormat.fmt1);
        }

        st = new Stats(webReader.webData);
    }
}
