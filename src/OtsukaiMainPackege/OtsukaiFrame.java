package OtsukaiMainPackege;


import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OtsukaiFrame extends JFrame {
	
	
	OtsukaiFrame(String title){
		setTitle(title);
		setBounds(0,0,800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container content = getContentPane();
		
		OtsukaiMainPanel startpanel = new OtsukaiMainPanel(); 
		OtsukaiButton changebutton = new OtsukaiButton("‚Í‚¶‚ß");
		startpanel.add(changebutton);
		content.add(startpanel);
		
		pack();
		
		ImageIcon icon = new ImageIcon("PuzzleIcon.png");
	    setIconImage(icon.getImage());
	}
	
}
