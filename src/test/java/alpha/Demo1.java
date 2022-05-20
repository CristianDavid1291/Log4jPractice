package alpha;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Demo1 {

	private static Logger log = LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {

		log.debug("I am debbuging");
		log.debug("Object is present");
		log.info("Object is not present");
		log.fatal("Fatal");

	}

}
