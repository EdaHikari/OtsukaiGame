package OtsukaiMainPackege;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class OtsukaiPanel extends JLayeredPane implements MouseMotionListener {
	
	BufferedImage buffImg =   null;
	int mouseX,mouseY; 

	public OtsukaiPanel(String filename) {
		setImage(filename);
		//setPreferredSize(new Dimension(1200,800));
		setBackground(Color.BLUE);
	    Border border = new BevelBorder(BevelBorder.RAISED, Color.white, Color.black);
		setBorder(border);
		setLayout(null);
		setBounds(0,0,0,0);		
	}
	
	public void changeText(){
	}
	
	public void setImage(String filename){		
		try{
			buffImg = ImageIO.read(new File("resource\\picture\\"+filename));
		}catch(IOException ex){
			ex.getMessage();
		}
	}
	
	@Override
	public void paintComponent(Graphics graphics){
		graphics.drawImage(buffImg, 0,0,1200,900, null);
	}
	@Override
	public void mouseDragged(MouseEvent event) {
		mouseX = event.getX();
		mouseY = event.getY();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
