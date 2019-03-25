package OtsukaiMainPackege;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class OtukaiMainClass extends JFrame{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {	
		OtukaiMainClass mframe = new OtukaiMainClass("OtsukaiGame");
	}
	
	OtukaiMainClass(String title){
		setTitle(title);
		setBounds(0,0,1200,900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon icon = new ImageIcon("resource\\picture\\OtsukaiIcon.png");
	    setIconImage(icon.getImage());
	    
	    OtsukaiMainPanel mpanel = new OtsukaiMainPanel();
		add(mpanel);
		setVisible(true);
	}
}
