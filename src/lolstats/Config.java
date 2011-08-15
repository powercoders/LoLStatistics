package lolstats;

/**
 * Configurations for the project.
 * @author Devin
 */
 
public class Config {
	public String projectName = "LoL Statistics Search";
	public static String idSearchURL = "http://lolstatistics.com/search/ajax/?q=";
    public static String statSearchURL = "http://lolstatistics.com/player/na/";
	
	public String getName() {
		return projectName;
	}
}

 