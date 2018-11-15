package OtsukaiMainPackege;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.JLabel;

public class OtsukaiTextLabel extends JLabel {
	
	static String text[] = new String[20];
	int textnumber = 0;
	
	public OtsukaiTextLabel() {
		for(int j = 0;j<20;j++){
			text[j] = new String();
		}
		
		setPreferredSize(new Dimension(1200,400));
		setBounds(0,500,1200,800);
		setOpaque(true);
		setForeground(Color.WHITE);
		setBackground(Color.BLUE);
		
		setVerticalAlignment(JLabel.TOP);
		file_read();
		setText(text[0]);
		setFont(new Font("MS ƒSƒVƒbƒN",Font.BOLD,48));
		setLayout(null);
	}
	
	public void nextText(){
		if(text[textnumber] != null)	{
			setText(text[textnumber]);
			textnumber ++; 
		}else{
			textnumber = 0;
			OtsukaiMainPanel mpanel = (OtsukaiMainPanel)OtsukaiTextLabel.this.getParent();
			mpanel.changePanel();
		}
	} 
	
	public void file_read(){
		  String ch;
		    try{
		        File file = new File("text.txt");
		        BufferedReader fr = new BufferedReader(new FileReader(file));

		       
		    	   for(int i = 0;i<20;i++){
		    		   ch = fr.readLine();		
			        	text[i] = ch;
			        	System.out.println(text[i]+i);
			        	if(ch == null){
			        		System.out.println("text end");
			        		break;
			        	}
			        }
		        fr.close();
		        
		      }catch(FileNotFoundException e){
		        System.out.println(e);	        
		        
		      }catch(IOException e){
		        System.out.println(e);
		      }
	  }	  

}
