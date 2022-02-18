package Spring3Tasca2Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notificador {
	
	Map<String, List<AgenciaBorsa>> agencies = new HashMap<>();
	
	public Notificador(String... operacions) {
		for (String operacio : operacions) {
			this.agencies.put(operacio, new ArrayList<>());
		}
	}
	
	public void suscriure(String tipoMoviment, AgenciaBorsa agencia) {
		List<AgenciaBorsa> clients = agencies.get(tipoMoviment);
		clients.add(agencia);
	}
	
	public void esborrar(String tipoMoviment, AgenciaBorsa agencia) {
		List<AgenciaBorsa> clients = agencies.get(tipoMoviment);
		clients.remove(agencia);
	}
	
	public void notificar (String tipoMoviment) {
		List<AgenciaBorsa> clients = agencies.get(tipoMoviment);
		for (AgenciaBorsa agencia: clients) {
			agencia.actualitzar(tipoMoviment);
		}
	}
	
	
}
