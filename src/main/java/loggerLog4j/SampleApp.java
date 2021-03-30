package loggerLog4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SampleApp {

	private static Logger log = Logger.getLogger(SampleApp.class);

	public static void main(String[] args) {

		//PropertyConfigurator.configure("E:\\PR\\loggerLog4j\\src\\main\\resources\\log4j.properties");
		log.info("From Info");
		log.debug("From Debug");
		log.fatal("From fata");
		log.error("From error");
		log.warn("From warning");

	}

}
