package lolstats.data;

/**
 * Player statistics data
 * Contains minon kills, turret kills, kills, deaths, assists, and kill-death ratio
 */
public class PlayerStats {
    public int kills;
    public int deaths;
    public int assists;
    public double kdr;
    public int minonKills;
    public double avgMinonKills;
    public int turretKills;
    public double avgTurretKills;

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
