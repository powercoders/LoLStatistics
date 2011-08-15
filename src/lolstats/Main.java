package lolstats;

import lolstats.data.PlayerInfo;
import lolstats.data.PlayerStats;
import lolstats.io.DataOperations;
import lolstats.io.WebReader;
import lolstats.util.Formatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static WebReader webReader;
    public static Formatting format;
    public static PlayerInfo pi;
    public static DataOperations dops;

    public static String summoners = "";
    

    public static void main(String[] args) {
        System.out.print("Search Summoner's Stats: ");
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        try {
            summoners = reader.readLine();
        } catch(Exception e) {}
        webReader = new WebReader(idSearchURL + summoners);
        if(webReader.rawData != null) {
            pi.pID = format.getID(webReader.rawData);
        }
        if(pi.pID != null) {
            webReader = new WebReader(statSearchURL + pi.pID);
        }

        dops = new DataOperations(webReader.rawData);
    }
}
