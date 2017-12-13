
package carrefours2;


import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;


public class CarrefourAgent2 extends Agent {

	private static final long serialVersionUID = 1L;
	float nbtotal_voiture;
    float p1,p2,p3,p4,zcycle;
	float zv1,zv2,zv3,zv4;
	float N1,N2,N3,N4;
	
       
		@Override
		protected void setup() {
		
		
		   /*
			ParallelBehaviour parallelBehaviour=new ParallelBehaviour();
			addBehaviour(parallelBehaviour);
			parallelBehaviour.addSubBehaviour(new CyclicBehaviour() {

				private static final long serialVersionUID = 1L;

				@Override
				public void action() {
					
					
					ACLMessage aclMessage=receive();
					if(aclMessage!=null){
					String Trafic=aclMessage.getContent();
					System.out.println("Demande de TRAFIC ROUTIER"+Trafic);
						
						
						
						ACLMessage aclMessage2=aclMessage.createReply(); // la méthode create Reply() automatiquement crée un msg de réponse 
						aclMessage2.setPerformative(ACLMessage.INFORM);
						aclMessage2.setContent("Demande recue, Traitemant en cours");
						send(aclMessage2);
					
				}
					else block();
				}
			});
			
		   */
			
			addBehaviour(new CyclicBehaviour() {

				
				private static final long serialVersionUID = 1L;

				@Override
				public void action() {
					
					
					    Object[] table=null;
					    ACLMessage aclMessage=receive();
					    
					    
					if(aclMessage!=null){
						
					try {
						
								table=(Object[]) aclMessage.getContentObject();
								
								
								N1=(int)table[0];
								N2=(int)table[1];
								N3=(int)table[2];
								N4=(int)table[3];
								
								nbtotal_voiture=N1+N2+N3+N4;
								
								System.out.println("valeur  = "+nbtotal_voiture);
								
								
								zcycle=nbtotal_voiture*5;
								
								p1= (float)(N1   /  nbtotal_voiture);
								p2= (float)(N2   /  nbtotal_voiture);
								p3= (float)(N3  /  nbtotal_voiture);
								p4=(float)(N4   /  nbtotal_voiture);
								
								System.out.println("valeur "+p1);
								
								zv1=p1*zcycle;						
								zv2=p2*zcycle;
								zv3=p3*zcycle;
								zv4=p4*zcycle;
								
								System.out.println("Le temps du ZV1 est  ="+Math.round(zv1));
								System.out.println("Le temps du ZV1 est  ="+Math.round(zv2));
								System.out.println("Le temps du ZV1 est  ="+Math.round(zv3));
								System.out.println("Le temps du ZV1 est  ="+Math.round(zv4));
								
		
					} catch (UnreadableException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					}
					
					
					
					
					
					
				}
				
				
			});
			}
			
		
}

