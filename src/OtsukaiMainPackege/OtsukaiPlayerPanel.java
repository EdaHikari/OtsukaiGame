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
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class OtsukaiPlayerPanel extends JPanel implements MouseMotionListener {

	Dimension imgSize;
	BufferedImage buffImg = null;
	
	public OtsukaiPlayerPanel() {		
		
		try{
			buffImg = ImageIO.read(new File("resource\\picture\\OtaukaiPlayer.png"));
		}catch(IOException ex){
			ex.getMessage();
		}		

		imgSize = new Dimension();
		getPreferedSize(buffImg);
		setPreferredSize(new Dimension(100,200));		
		setBounds(0,300,imgSize.width,imgSize.height);
	}
	
	@Override
	public void paintComponent(Graphics graphics){
		graphics.drawImage(buffImg, 0,0,imgSize.width,imgSize.height, null);
	}
	public Dimension getPreferedSize(BufferedImage buffImg){
		
		if(buffImg != null){
			imgSize.width = buffImg.getWidth();
			imgSize.height = buffImg.getHeight();
		}else{

			imgSize.width = 100;
			imgSize.height = 200;
		}
		
		return imgSize; 
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {	}

	@Override
	public void mouseMoved(MouseEvent event) {		
		setBounds(event.getXOnScreen()-200,event.getYOnScreen()-200,imgSize.width,imgSize.height);
		repaint();			
	}

}
