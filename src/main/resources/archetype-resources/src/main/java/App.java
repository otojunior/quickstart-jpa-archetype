package ${package};

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Classe principal da aplicação.
 * @author <Author name>
 */
public class App {
	/**
	 * Logger do SLF4J.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	/**
	 * Método principal da aplicação
	 * @param args Argumentos da linha de comando.
	 */
	public static void main(String[] args) {
		App app = new App();
		app.createFactory();
	}
	
	/**
	 * Cria fábrica de persistência
	 */
	public void createFactory() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		LOG.info(String.valueOf(emf.isOpen()));
		emf.close();
	}
}
