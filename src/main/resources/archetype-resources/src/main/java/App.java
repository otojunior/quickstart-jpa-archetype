package ${package};

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author 
 *
 */
public class App {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("App:main");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		emf.close();
	}
}
