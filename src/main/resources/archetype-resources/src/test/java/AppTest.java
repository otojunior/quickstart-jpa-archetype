package ${package};

import static org.junit.Assert.*;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppTest {
	/**
	 * Logger do SLF4J.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	/**
	 * Classe a ser testada.
	 */
	private App app;

	@Before
	public void setUp() throws Exception {
		LOG.debug("Setup do teste");
		app = new App();
	}

	@After
	public void tearDown() throws Exception {
		LOG.debug("Tear down do teste");
		app = null;
	}

	@Test
	public void testMain() {
		App.main(ArrayUtils.EMPTY_STRING_ARRAY);
	}

	@Test
	public void testCreateFactory() {
		assertNotNull(app);
		app.createFactory();
	}
}
