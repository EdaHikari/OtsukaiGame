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
import javax.swing.JTextArea;

public class OtsukaiTextLabel extends JLabel {
	
	String text[];
	String text2;
	int textnumber = 1;
	
	public OtsukaiTextLabel(String filename) {		
		setPreferredSize(new Dimension(1200,400));
		setBounds(0,600,1200,400);
		setOpaque(true);
		setForeground(Color.WHITE);
		setBackground(Color.BLUE);
		
		setVerticalAlignment(JLabel.TOP);
		//setLineWrap(true);
		file_read(filename);
		setText("<html>"+text[0]+"</html>");
		setFont(new Font("MS ゴシック",Font.BOLD,36));
		setLayout(null);
	}
	public OtsukaiTextLabel() {
		setPreferredSize(new Dimension(1200,400));
		setBounds(0,600,1200,700);
		setOpaque(true);
		setForeground(Color.WHITE);
		setBackground(Color.BLUE);
		
		setVerticalAlignment(JLabel.TOP);
		setFont(new Font("MS ゴシック",Font.BOLD,48));
		setLayout(null);
	}
	
	
	public void nextText(){
		if(text[textnumber] != null)	{
			setText("<html>"+text[textnumber]+"</html>");
			textnumber ++; 
		}else{
			textnumber = 0;
			OtsukaiMainPanel mpanel = (OtsukaiMainPanel)OtsukaiTextLabel.this.getParent();
			mpanel.changePanel();
		}
	} 
	
	public void file_read(String filename){
		  String ch;
		  System.out.println(filename);	
		    try{
		        File file = new File("resource\\scenario\\"+filename);
		        BufferedReader fr = new BufferedReader(new FileReader(file));

		        outside: {
		        	text = new String[10];
		        	int count =0;
		    	   while(true){
		    		   text[count] = new String();
		    		   for(int j = 0;j<4;j++){
			    		   ch = fr.readLine();		
			    		   if(ch == null){
				        		System.out.println("text end");
				        		break outside;
					        	}
			    		   text[count] = text[count].concat(ch+"\n");
				        	System.out.println(text[count]+count);	
		    		  }
		    		   count++;
			        }}
		        fr.close();
		        
		      }catch(FileNotFoundException e){
		        System.out.println(e);	        
		        
		      }catch(IOException e){
		        System.out.println(e);
		      }
	  }	  

}
