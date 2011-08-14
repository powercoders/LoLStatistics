package lolstats.data;

/**
 * Player general information class.
 * Contains location, level, wins, loses, leaves, and win-lose-ratio.
 */
public class PlayerInfo {
    public String pID;
    public String location;
    public int level;
    public int wins;
    public int loses;
    public int quits;
    public double wlr;

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


}
