package lolstats.gui;

/**
 * Graphical User Interface for player searching and data.
 * @ author Devin
**/
import lolstats.Config;

public class UI extends JFrame {
	public Config c;

	public UI() {
		init();
		pack();
		setTitle(c.getTitle());
		setResizable(false);
	}
	
	public void init() {}
	
	public void pack() {}
	
	public void setTitle(final String title) {
		super.setTitle(t);	
	}
		
}

