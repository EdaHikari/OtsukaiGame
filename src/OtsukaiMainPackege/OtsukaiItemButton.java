package OtsukaiMainPackege;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class OtsukaiItemButton extends JButton implements MouseListener,ActionListener {

	OtsukaiMainPanel mpanel;
	int option;
	int x,y;
	int width,height;
	boolean contain;
	public String itemname; 
	
	public OtsukaiItemButton(String itemname,Icon icon,Dimension locat,OtsukaiMainPanel mpanel) {
		super(icon);
		this.mpanel = mpanel;
		this.itemname = itemname; 
		width = 100;
		height = 150;
		x= locat.width;
		y = locat.height;
		contain = false;
		setBackground(Color.WHITE);
		setBounds(locat.width,locat.height,width,height);
		setFocusPainted(false);
		addMouseListener(this);
		setVisible(true);
		setOpaque(false);
		setBorderPainted(false);
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		option = JOptionPane.showConfirmDialog(mpanel, "Ç±ÇÃè§ïiÇîÉÇ¢ï®Ç©Ç≤Ç…ì¸ÇÍÇ‹Ç∑Ç©ÅH");
		if(option == 0){
			removeMouseListener(this);
			contain = true;
			mpanel.contain();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
