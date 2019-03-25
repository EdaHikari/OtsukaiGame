package OtsukaiMainPackege;

import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class OtsukaiGamePanel extends OtsukaiPanel {

	public OtsukaiGamePanel() {
		super("OtsukaiInStorePanel.png");
		OtsukaiPlayerPanel player = new OtsukaiPlayerPanel();
		add(player);
	}		
}
