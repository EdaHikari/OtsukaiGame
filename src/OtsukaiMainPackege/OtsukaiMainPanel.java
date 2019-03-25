package OtsukaiMainPackege;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class OtsukaiMainPanel extends OtsukaiPanel{

	int scene,count;
	OtsukaiTextLabel textlabel;
	OtsukaiButton nextbutton;
	OtsukaiPlayerPanel player;
	OtsukaiClerkButton clerk;
	OtsukaiItemButton item[];
	OtsukaiItemButton container[];
	
	public OtsukaiMainPanel() {
		super("OtsukaiStartPanel.png");
		scene = 0;
		setLayer(this,0);
		changePanel();
	}
	
	public void changePanel(){   
		removeAll();
		switch(scene){        
				case 0:      
					OtsukaiButton changebutton = new OtsukaiButton("START");
					add(changebutton);
					break;
						      
				case 1:   
					setImage("OtsukaiIntroductionPanel.png");
					nextbutton = new OtsukaiButton();
					setLayer(nextbutton,2);
					add(nextbutton);
					textlabel = new OtsukaiTextLabel("OtsukaiText_introduction.txt");
					setLayer(textlabel,1);
					add(textlabel);
					break;
					
				case 2:   
					setImage("OtsukaiStoregatePanel.png");
					nextbutton = new OtsukaiButton();
					nextbutton.type = true;
					setLayer(nextbutton,2);
					add(nextbutton);
					textlabel = new OtsukaiTextLabel("OtsukaiText_storegate.txt");
					setLayer(textlabel,1);
					add(textlabel);
					break;
		                      
				case 3:		
					setImage("OtsukaiInStorePanel.png");
					addMouseMotionListener(this);
					player = new OtsukaiPlayerPanel();
					add(player);
					
					clerk = new OtsukaiClerkButton(new ImageIcon("resource\\picture\\OtaukaiClerk.png"),new Dimension(900,650),this);
					add(clerk);
					
					item = new OtsukaiItemButton[12];
					item[0] = new OtsukaiItemButton("コーラ",new ImageIcon("resource\\picture\\OtaukaiItem_cola.png"),new Dimension(200,60),this);
					item[1] = new OtsukaiItemButton("お茶",new ImageIcon("resource\\picture\\OtaukaiItem_tea.png"),new Dimension(200,210),this);
					item[2] = new OtsukaiItemButton("ポカリスエット",new ImageIcon("resource\\picture\\OtaukaiItem_pocari.png"),new Dimension(200,360),this);
					item[3] = new OtsukaiItemButton("カレー",new ImageIcon("resource\\picture\\OtaukaiItem_cury.png"),new Dimension(450,60),this);
					item[4] = new OtsukaiItemButton("親子丼",new ImageIcon("resource\\picture\\OtaukaiItem_oyakodon.png"),new Dimension(450,210),this);
					item[5] = new OtsukaiItemButton("おかゆ",new ImageIcon("resource\\picture\\OtaukaiItem_okayu.png"),new Dimension(450,360),this);
					item[6] = new OtsukaiItemButton("ビオフェルミン",new ImageIcon("resource\\picture\\OtaukaiItem_bioferumin.png"),new Dimension(700,60),this);
					item[7] = new OtsukaiItemButton("かぜ薬",new ImageIcon("resource\\picture\\OtaukaiItem_kaze.png"),new Dimension(700,210),this);
					item[8] = new OtsukaiItemButton("正露丸",new ImageIcon("resource\\picture\\OtaukaiItem_seirogan.png"),new Dimension(700,360),this);
					item[9] = new OtsukaiItemButton("しっぷ",new ImageIcon("resource\\picture\\OtaukaiItem_sipp.png"),new Dimension(1000,60),this);
					item[10] = new OtsukaiItemButton("冷却シート",new ImageIcon("resource\\picture\\OtaukaiItem_netusamaseat.png"),new Dimension(1000,210),this);
					for(int i = 0;i<11;i++){
						add(item[i]);	
					}		
					
					textlabel = new OtsukaiTextLabel("OtsukaiText_instore.txt");
					setLayer(textlabel,1);
					add(textlabel);
					
					break;
					
				case 4:
					setImage("OtsukaiIntroductionPanel.png");
					nextbutton = new OtsukaiButton();
					add(nextbutton);
					
					nextbutton.type = true;
					textlabel = new OtsukaiTextLabel();
					String text="マチ子ちゃんは";
					for(int i = 0;i<count;i++){
						text = text.concat(container[i].itemname);
						text = text.concat(",");
					}
					text = text.concat("を買いました");
					textlabel.setText("<html>"+text+"</html>");
					add(textlabel);	
					break;
					
				case 5:
					int match =0;
					for(int i = 0;i<count;i++){
						if(container[i].itemname == item[2].itemname
								|| container[i].itemname == item[5].itemname
									|| container[i].itemname == item[7].itemname
										|| container[i].itemname == item[10].itemname) match++;						
					}
					if(count == 11) match = 5;
					
					switch(match){
					case 0:
						setImage("OtsukaiEndPanel_0.png");
						nextbutton = new OtsukaiButton();
						setLayer(nextbutton,2);
						add(nextbutton);
						textlabel = new OtsukaiTextLabel("OtsukaiText_end0.txt");
						setLayer(textlabel,1);
						add(textlabel);	
						break;
					case 1:

					case 2:
						setImage("OtsukaiEndPanel_2.png");
						nextbutton = new OtsukaiButton();
						setLayer(nextbutton,2);
						add(nextbutton);
						textlabel = new OtsukaiTextLabel("OtsukaiText_end2.txt");
						setLayer(textlabel,1);
						add(textlabel);	
						break;
					case 3:
						setImage("OtsukaiEndPanel_3.png");
						nextbutton = new OtsukaiButton();
						setLayer(nextbutton,2);
						add(nextbutton);
						textlabel = new OtsukaiTextLabel("OtsukaiText_end3.txt");
						setLayer(textlabel,1);
						add(textlabel);	
						break;
					case 4:
						setImage("OtsukaiEndPanel_4.png");
						nextbutton = new OtsukaiButton();
						setLayer(nextbutton,2);
						add(nextbutton);
						textlabel = new OtsukaiTextLabel("OtsukaiText_end4.txt");
						setLayer(textlabel,1);
						add(textlabel);	
						break;					
					case 5:
						setImage("OtsukaiEndPanel_5.png");
						nextbutton = new OtsukaiButton();
						setLayer(nextbutton,2);
						add(nextbutton);
						textlabel = new OtsukaiTextLabel("OtsukaiText_end5.txt");
						setLayer(textlabel,1);
						add(textlabel);	
						break;					
					
					}
					break;
				case 6:
					setImage("OtsukaiFinalPanel.png");
					break;
				}             
		repaint();
		scene++;
	}
		public void contain(){
		count = 0;
		container = new OtsukaiItemButton[12];
		for(int i = 0;i<11;i++){
			if (item[i].contain == true ){
				container[count] = item[i];
				count++;
			}
		}
		for(int i = 0;i<count;i++){
			container[i].setBounds(300+100*i,700,container[i].width,container[i].height);
		}
	}
	
	@Override
	public void changeText(){
		System.out.println("change text");
		textlabel.nextText();
		repaint();
	}
	
	@Override
	public void mouseMoved(MouseEvent event) {	
		player.setBounds(event.getXOnScreen()-200,event.getYOnScreen()-200,player.imgSize.width,player.imgSize.height);
		repaint();
	}
}
