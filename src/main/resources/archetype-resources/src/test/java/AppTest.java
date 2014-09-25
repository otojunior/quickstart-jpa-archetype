package ${package};

import static org.junit.Assert.*;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application test class.
 * @author <Author name>
 */
public class AppTest {
	/**
	 * SLF4J Logger.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	/**
	 * Class to be tested.
	 */
	private App app;

	/**
	 * Tests setup.
	 * @throws Exception Generic exception.
	 */
	@Before
	public void setUp() throws Exception {
		LOG.debug("Setup do teste");
		app = new App();
	}

	/**
	 * Tests tear down.
	 * @throws Exception Generic Exception
	 */
	@After
	public void tearDown() throws Exception {
		LOG.debug("Tear down do teste");
		app = null;
	}

	/**
	 * Main method tests.
	 */
	@Test
	public void testMain() {
		App.main(ArrayUtils.EMPTY_STRING_ARRAY);
	}

	/**
	 * createFactory method tests.
	 */
	@Test
	public void testCreateFactory() {
		assertNotNull(app);
		app.createFactory();
	}
}
