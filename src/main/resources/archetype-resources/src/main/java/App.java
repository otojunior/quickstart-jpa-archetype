package ${package};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application Main Class.
 * @author <Author name>
 */
public final class App {
	/**
	 * SLF4J Logger.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	/**
	 * Private Constructor
	 */
	private App() {
		LOG.trace("App instance created");
	}
	
	/**
	 * Main method.
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		LOG.info("${artifactId} JPA Application");
	}
}
