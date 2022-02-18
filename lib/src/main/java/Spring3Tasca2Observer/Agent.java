package Spring3Tasca2Observer;

public class Agent {
	
	public Notificador notificador;
		
	public Agent() {
		this.notificador = new Notificador("puja","baixa");
	}
	
	public void laBorsaPuja() {
		notificador.notificar("puja");
	}
	
	public void laBorsaBaixa() {
		notificador.notificar("baixa");
	}	
}
