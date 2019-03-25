package OtsukaiMainPackege;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class OtsukaiTexitPanel extends JPanel {

	public OtsukaiTexitPanel() {

		setPreferredSize(new Dimension(1200,200));
		setBackground(Color.BLUE);
		setOpaque(true);
		 
	    Border border = new BevelBorder(BevelBorder.RAISED, Color.white, Color.black);
		setBorder(border);
		setBounds(0,500,1200,800);
		OtsukaiTextLabel text = new OtsukaiTextLabel("OtsukaiText_introduction.txt");
		add(text);
	}
	
	

}
