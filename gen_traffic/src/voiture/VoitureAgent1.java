package voiture;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class VoitureAgent1 extends Agent {

	private static final long serialVersionUID = 1L;

	@Override
	protected void setup() {
		
		 addBehaviour(new CyclicBehaviour() {
	     
			 static final long serialVersionUID = 1L;
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
}
