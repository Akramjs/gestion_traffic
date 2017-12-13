package carrefours2;

import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;

public class CarrefoursContenair2 {

	public static void main(String[] args) {
		  
		try {
			Runtime runtime=Runtime.instance();
			ProfileImpl profileImpl=new ProfileImpl(false);
			profileImpl.setParameter(ProfileImpl.MAIN_HOST, "localhost");
			AgentContainer agentContainer=runtime.createAgentContainer(profileImpl);
			
			//
			AgentController agentController=agentContainer.createNewAgent("Carrefour2", 
			CarrefourAgent2.class.getName(), new Object[]{});
			agentController.start();
		} catch (ControllerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
