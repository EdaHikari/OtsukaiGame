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
	
	static String text = "";

	public OtsukaiTextLabel() {
		setPreferredSize(new Dimension(1200,400));
		setBounds(0,500,1200,800);
		setOpaque(true);
		setForeground(Color.WHITE);
		setBackground(Color.BLUE);
		
		setVerticalAlignment(JLabel.TOP);
		setText(file_read());
		setFont(new Font("MS ゴシック",Font.BOLD,48));
		setLayout(null);
	}
	
	public  String file_read(){
		
		  String ch;
		    try{
		        File file = new File("text.txt");
		        BufferedReader fr = new BufferedReader(new FileReader(file));

		        while((ch = fr.readLine()) != null){	
		        	text += ch;
		        }
		        fr.close();
		        
		        return text;
		        
		      }catch(FileNotFoundException e){
		        System.out.println(e);
		        return "エラーが起こりました";
		        
		      }catch(IOException e){
		        System.out.println(e);
		        return "エラーが起こりました";
		      }
	  }	  

}
