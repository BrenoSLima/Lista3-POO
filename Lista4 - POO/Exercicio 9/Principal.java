
import javax.swing.*;    

public class Principal {

	public static void main(String[] args) {
		
		JFrame f;    
		
		f=new JFrame();     
		
		JRadioButton r1=new JRadioButton("Opção 1");    
		JRadioButton r2=new JRadioButton("Opção 2");    
		
		r1.setBounds(50,50,100,30);    
		r2.setBounds(50,100,100,30);    
		
		ButtonGroup bg=new ButtonGroup(); 
		
		bg.add(r1);bg.add(r2);    
		f.add(r1);f.add(r2);      
		
		f.setSize(200,200);    
		f.setLayout(null);    
		f.setVisible(true);    
	}

}
