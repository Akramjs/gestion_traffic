package generateurtraffic;

import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;


public class GenerateurtrafficContenair {

	public static void main(String[] args) {
		
		 
		try {
			
				Runtime runtime=Runtime.instance();
				ProfileImpl profileImpl=new ProfileImpl(false);
				profileImpl.setParameter(ProfileImpl.MAIN_HOST, "localhost");
			    AgentContainer agentContainer=runtime.createAgentContainer(profileImpl);
						
				//
				AgentController agentController=agentContainer.createNewAgent("GenerateurtrafficContenair", 
				GenerateurtrafficAgent.class.getName(), new Object[]{});
			    agentController.start();
		    
			} catch (ControllerException e) {
				
		         e.printStackTrace();
			}
				

	}

}
