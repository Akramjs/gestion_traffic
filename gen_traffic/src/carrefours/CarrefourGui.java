package carrefours;




import javax.swing.JFrame;


public class CarrefourGui extends JFrame {  

	private static final long serialVersionUID = 1L;

	public CarrefourGui(Panel carre1)
	{
	setTitle ("Simulation"); 
	setSize (1500,820); 

	getContentPane().add(carre1);

	this.setVisible(true);

    


	}   
	
  
}

