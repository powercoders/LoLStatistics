package lolstats;

public class Stats {
    public String location;
    public int level;
    public int wins;
    public int loses;
    public int quits;
    public double wlr;
    public int kills;
    public int deaths;
    public int assists;
    public double kdr;
    public int minonKills;
    public double avgMinonKills;
    public int turretKills;
    public double avgTurretKills;

    public Stats(String str) {
        System.out.println("Stripping chunk data.");
        str = stripFormatting(str);
        System.out.println("Removing spaces from data.");
        str = removeWhiteSpace(str);
        /*
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
        System.out.print(str);
    }

     private String stripFormatting(final String str) {
        if (str != null && !str.isEmpty()) {
            return str.replaceAll("(^[^<]+>|<[^>]+>|<[^>]+$)", "");
        }
        return "";
    }
    private String removeWhiteSpace(String str) {
        if (str != null && !str.isEmpty()) {
            return str.replaceAll("\t", "");
        }
        return "";
    }

    public String getLocation() {
        return location;
    }

    public int getLevel() {
        return level;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return loses;
    }

    public int getQuits() {
        return quits;
    }

    public double getWinLossRatio() {
        return wlr;
    }

    public int getKills() {
        return kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getAssists() {
        return assists;
    }

    public double getKillDeathRatio() {
        return kdr;
    }

    public int getMinonKills() {
        return minonKills;
    }

    public double getAvgMinonKills() {
            return avgMinonKills;
    }

    public int getTurretKills() {
        return turretKills;
    }

    public double getAvgTurretKills() {
        return avgTurretKills;
    }

}
