package carrefours2;

import javax.swing.JFrame;

public class CarrefourGui2 extends JFrame {  
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CarrefourGui2(Panel2 carre2)
	{
	setTitle ("Simulation"); 
	setSize (1500,820); 

	getContentPane().add(carre2);

	this.setVisible(true);

    


	}   
	
  
}

