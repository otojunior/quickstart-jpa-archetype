package ${package};

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application Main Class.
 * @author <Author name>
 */
public class App {
	/**
	 * SLF4J Logger.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	/**
	 * Main method.
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		App app = new App();
		app.createFactory();
	}
	
	/**
	 * Creates Persistence Factory (just a sample method).
	 */
	public void createFactory() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		LOG.info(String.valueOf(emf.isOpen()));
		emf.close();
	}
}
