package lolstats.io;

/**
 * DataOperations will format rawData to actual information.
 * @author Devin
 */
import lolstats.util.Formatting;

public class DataOperations {
    public Formatting f;

    public DataOperations(String str) {
        str = f.stripHTML(str);
        str = f.stripTabs(str);
        System.out.print(str);
    }

        /*    Some of this data is no longer valid.
        int aIndex = str.indexOf("<title>League of Legends - ");
        int bIndex = str.indexOf(" Player details");
        String name = str.substring(aIndex, bIndex);
        System.out.println("name: " + name);
        if(str.contains("\">Player is from North America")) {
            location = "North American";
        } else {
            location = "European";
        }
        System.out.println("location: " +  location);
        int cIndex = str.lastIndexOf("<td>Wins</td>\n" + "\t\t\t\t\t\t\t<td>");
        String tempA = str.substring(cIndex, cIndex+10);
        int dIndex = tempA.indexOf(" <");
        wins = Integer.parseInt(tempA.substring(1, dIndex));
        System.out.println("Wins: " +  wins);
        */
}
