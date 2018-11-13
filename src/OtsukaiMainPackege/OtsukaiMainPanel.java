package OtsukaiMainPackege;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class OtsukaiMainPanel extends JPanel {

	BufferedImage buffImg = null;
	OtsukaiTextLabel textlabel;
	
	public OtsukaiMainPanel() {
		setPreferredSize(new Dimension(1200,800));
		setBackground(Color.BLUE);
	    Border border = new BevelBorder(BevelBorder.RAISED, Color.white, Color.black);
		setBorder(border);
		setLayout(null);
		setBounds(0,0,0,0);
	
		setImage("OtsukaiStartPanel.png");
	}
	
	@Override
	public void paintComponent(Graphics graphics){
		graphics.drawImage(buffImg, 0,0,1200,800, null);
	}
	
	public void setImage(String filename){
		
		try{
			buffImg = ImageIO.read(new File(filename));
		}catch(IOException ex){
			ex.getMessage();
		}
	}
	
	public void changePanel(){
		System.out.println("change panel");
		removeAll();
		setImage("OtsukaiIntroductionPanel.png");		
		OtsukaiButton nextbutton = new OtsukaiButton();
		add(nextbutton);
		textlabel = new OtsukaiTextLabel();
		add(textlabel);
		repaint();
	}
	
	public void changeText(){
		System.out.println("change text");
		remove(textlabel);
		OtsukaiTextLabel textlabel= new OtsukaiTextLabel();
		add(textlabel);
		repaint();
	}
}
