package Projekt_indywidualny;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WrongArgumentSysPane {
	JFrame f;  
	WrongArgumentSysPane(){  
	    f=new JFrame();  
	    JOptionPane.showMessageDialog(f,"Given argument numeric system is incorrect. Pick a number from 2 to 62","Alert",JOptionPane.WARNING_MESSAGE);     
	} 
}
