package Spring3Tasca2Observer;

public class AgenciaParticulars implements AgenciaBorsa {
	
	private String nom;
		
	public AgenciaParticulars(String nom) {
		this.nom = nom;
	}

	@Override
	public void actualitzar(String tipoEvent) {
		System.out.println("La agencia de borsa "+nom+" truca als seus clients per avisar que la borsa "+tipoEvent);
		
	}
}
