package OtsukaiMainPackege;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class OtsukaiButton extends JButton implements MouseListener{
	int type = 0;
	BufferedImage buffImg = null;

	public OtsukaiButton(String texit){
		setBounds(100,600,200,100);
		setText(texit);
		setBackground(Color.WHITE);
		setFont(new Font("MS ÉSÉVÉbÉN",Font.BOLD,48));
		setFocusPainted(false);
		addMouseListener(this);
		}
	
	public OtsukaiButton(){
		type = 1;
		setBounds(1100,700,100,100);
		ImageIcon icon = new ImageIcon("nextbutton.png");
		setIcon(icon);
		setFocusPainted(false);
		addMouseListener(this);
		setVisible(true);
		setBorderPainted(false);
		}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		OtsukaiMainPanel mpanel = (OtsukaiMainPanel)OtsukaiButton.this.getParent();
		if(type == 0){
			mpanel.changePanel();
		}else{
			mpanel.changeText();
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
