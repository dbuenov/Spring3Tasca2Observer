package Spring3Tasca2Observer;

public class AgenciaEmpreses implements AgenciaBorsa{

	private String nom;
	 		
	public AgenciaEmpreses(String nom) {
		this.nom = nom;
			
	}

	@Override
	public void actualitzar(String tipoEvent) {
		System.out.println("La agencia de borsa "+nom+" envia mails als seus clients amb l'assumpte: La borsa "+tipoEvent);
		
	}
	
	

}
