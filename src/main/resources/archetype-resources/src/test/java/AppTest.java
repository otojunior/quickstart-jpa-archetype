package ${package};

import org.apache.commons.lang3.ArrayUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.powermock.reflect.Whitebox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application test class.
 * @author [Author name]
 */
public class AppTest {
	/**
	 * SLF4J Logger.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	/**
	 * Tests setup.
	 * @throws Exception Generic exception.
	 */
	@Before
	public void setUp() throws Exception {
		LOG.debug("Test Setup");
	}

	/**
	 * Tests tear down.
	 * @throws Exception Generic Exception
	 */
	@After
	public void tearDown() throws Exception {
		LOG.debug("Test Tear Down");
	}
	
	/**
	 * Constructor test.
	 * @throws Exception 
	 */
	@Test
	public void testConstructor() throws Exception {
		Whitebox.invokeConstructor(App.class, ArrayUtils.EMPTY_OBJECT_ARRAY);
	}

	/**
	 * Main method tests.
	 */
	@Test
	public void testMain() {
		App.main(ArrayUtils.EMPTY_STRING_ARRAY);
	}
}
