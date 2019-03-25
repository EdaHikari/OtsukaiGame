package OtsukaiMainPackege;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class OtsukaiClerkButton extends JButton implements MouseListener {
	
	OtsukaiMainPanel mpanel;
	int option;
	int x,y;
	int width,height;
	boolean contain;

	public OtsukaiClerkButton(Icon arg0,Dimension locat,OtsukaiMainPanel mpanel) {
		super(arg0);
		this.mpanel = mpanel;
		width = 100;
		height = 250;
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
		option = JOptionPane.showConfirmDialog(mpanel, "選択した商品を購入しますか？\n＊購入するとおつかいは終わります");
		if(option == 0){
			removeMouseListener(this);
			mpanel.changePanel();
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
