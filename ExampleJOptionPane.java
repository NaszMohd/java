// java program to display message dialog

import javax.swing.*;

class ExampleJOptionPane{
	
	JFrame f;
	
	ExampleJOptionPane(){
	f= new JFrame(); 
	
	JOptionPane.showMessageDialog(f,"Successful","Alert",JOptionPane.WARNING_MESSAGE);
	
	}
	public static void main(String [] args){
	
	new ExampleJOptionPane();
	
	}
}