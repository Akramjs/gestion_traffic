package carrefours;

import jade.core.AID;

import jade.core.behaviours.CyclicBehaviour;

import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class CarrefourAgent1 extends GuiAgent{

	private static final long serialVersionUID = 1L;


	@Override
	protected void setup() {
	
        
        
        
   
        addBehaviour(new CyclicBehaviour() {
        
			private static final long serialVersionUID = 1L;
			private int counter;
        	
			@Override
			public void action() {
				++counter;
			System.out.println("Cyclic Behaviour" +counter);
			// pour filtrer les msg est deviter if else par exemple je filtre les msg suaf que les msg type informe
			MessageTemplate messageTemplate=MessageTemplate.and
					(MessageTemplate.MatchPerformative(ACLMessage.INFORM),
					MessageTemplate.MatchOntology("régulation des feux"));
			ACLMessage aclMessage=receive(messageTemplate); // je l'utilise dans la méthode receive
			if(aclMessage!=null){
				
			System.out.println("Sender:"+aclMessage.getSender());
			System.out.println("Acte de communication :"+ACLMessage.getPerformative(aclMessage.getPerformative()));
			System.out.println("Content: "+aclMessage.getContent()); // afficher le contenue de msg
			System.out.println("Langue: "+aclMessage.getLanguage()); //afficher la langue 
			System.out.println("Ontology: "+aclMessage.getOntology()); //ajouter L'ontologie utiliser
			System.out.println("X: "+aclMessage.getUserDefinedParameter("x")); // les proportie
			System.out.println("Y: "+aclMessage.getUserDefinedParameter("y"));
				
			}
			else block();
				
			}
			
		});
		
      
	}

	@Override
	protected void onGuiEvent(GuiEvent ev) {
		switch (ev.getType()) {
		case 1:
			ACLMessage aclMessage= new ACLMessage(ACLMessage.REQUEST);
			aclMessage.addReceiver(new AID("CarrefourAgent2",AID.ISLOCALNAME));
			aclMessage.setContent("trafic a La Manouba est moyen");
			aclMessage.setOntology("régulation des feux");
			send(aclMessage);
			break;

		default:
			break;
		}
		
	}

	
}
