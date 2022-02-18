package Spring3Tasca2Observer;

public class AgenciaInternet implements AgenciaBorsa{

	private String nom;
	private String web;
	
	public AgenciaInternet(String nom,String web) {
		this.nom = nom;
		this.web = web;
	}
	
	
	@Override
	public void actualitzar(String tipoEvent) {
		System.out.println("La agencia de borsa "+nom+" actualitza la web: "+web+" amb la info: La borsa "+tipoEvent);
	
	}
	
	

}
