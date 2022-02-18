package Spring3Tasca2Observer;

public class Main {

	public static void main(String[] args) {
		
		Agent agent = new Agent();
		
		AgenciaParticulars germansFernandez   = new AgenciaParticulars("Germans Fernandez");
		AgenciaEmpreses agenciaBussinesClass  = new AgenciaEmpreses("Bussines Class");
		AgenciaInternet eVaca                 = new AgenciaInternet("eVaca", "www.eVaca.com");
				
		agent.notificador.suscriure("puja", agenciaBussinesClass);
		agent.notificador.suscriure("baixa", germansFernandez);
		agent.notificador.suscriure("baixa", eVaca);
		agent.notificador.suscriure("puja", eVaca);
		
		agent.laBorsaPuja();
		System.out.println("*******************");
		agent.laBorsaPuja();
		System.out.println("*******************");
		agent.laBorsaBaixa();
		System.out.println("*******************");
		agent.laBorsaPuja();
		System.out.println("*******************");
		
		agent.notificador.esborrar("baixa", eVaca);
		agent.notificador.esborrar("puja", agenciaBussinesClass);
		
		agent.laBorsaBaixa();
		System.out.println("*******************");
		agent.laBorsaPuja();
		System.out.println("*******************");
		agent.laBorsaBaixa();
		System.out.println("*******************");
		agent.laBorsaPuja();
		System.out.println("*******************");
		agent.laBorsaPuja();
		
		
		
	}

}
