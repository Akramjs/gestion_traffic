package generateurtraffic;

import java.io.IOException;
import java.util.Random;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import jade.lang.acl.ACLMessage;

public class GenerateurtrafficAgent  extends Agent{


	private static final long serialVersionUID = 1L;
	
	int mean_A,mean_B,mean_C,mean_D;


	@Override
	protected void setup() {
		
		super.setup();
		
		  addBehaviour(new TickerBehaviour(this, 60000) //60000 Miliseconde une minute
		  {     
			 
			       private static final long serialVersionUID = 1L;

					@Override
					protected void onTick() 
					{
						Object[] object=new Object[4];
	
						mean_A=40;
					    mean_B=200;
					    mean_C=60;
					    mean_D=5;
					    
					    System.out.println("La valeur N1 :"+poisson(mean_A));
					    System.out.println("La valeur N2 :"+poisson(mean_B));
					    System.out.println("La valeur N3 :"+poisson(mean_C));
					    System.out.println("La valeur N4 :"+poisson(mean_D));
					    
					    
					    object[0]=poisson(mean_A);
					    object[1]=poisson(mean_B);
					    object[2]=poisson(mean_C);
					    object[3]=poisson(mean_D);
					    
						try {
					    ACLMessage aclMessage= new ACLMessage(ACLMessage.INFORM);
						aclMessage.addReceiver(new AID("Carrefour2",AID.ISLOCALNAME));
			
							aclMessage.setContentObject(object);
							send(aclMessage);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					
	                    
					   
						
					}

					private int poisson(int mean) {
						
					    int r=0;
						double a=new Random().nextDouble();
						double p=Math.exp(-mean);
						
						while(a>p)
						{
							r++;
							a=a-p;
							p=p * mean /r;
							
						}
						
						return r;
					}
				
			});
		
		
	}
	
	

}
