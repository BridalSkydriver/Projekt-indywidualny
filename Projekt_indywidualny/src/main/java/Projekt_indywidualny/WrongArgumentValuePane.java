package Projekt_indywidualny;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WrongArgumentValuePane {
	JFrame f;  
	WrongArgumentValuePane(){  
	    f=new JFrame();  
	    JOptionPane.showMessageDialog(f,"Given argument value is inconsistent with given numeric system","Alert",JOptionPane.WARNING_MESSAGE);     
	} 
}
