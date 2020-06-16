package Projekt_indywidualny;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WrongArgumentPane {
	JFrame f;  
	WrongArgumentPane(){  
	    f=new JFrame();  
	    JOptionPane.showMessageDialog(f,"Given value is inconsistent with given numeric system","Alert",JOptionPane.WARNING_MESSAGE);     
	} 
}
