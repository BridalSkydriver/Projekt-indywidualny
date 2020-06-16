package Projekt_indywidualny;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WrongResultSysPane {
	JFrame f;  
	WrongResultSysPane(){  
	    f=new JFrame();  
	    JOptionPane.showMessageDialog(f,"Given result numeric system is incorrect","Alert",JOptionPane.WARNING_MESSAGE);     
	} 
}
