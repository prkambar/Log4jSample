package loggerLog4j;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class TestApp {
	//3. create logger object
	private static Logger log = Logger.getLogger(TestApp.class);
		
	public static void main(String[] args) {
		//1. create layout		
		Layout layout =  new SimpleLayout();
		//2. Crate appender + link layot 
		Appender app = new ConsoleAppender(layout);
		//4. link appender with log
		log.addAppender(app);
		
		//Print Message---
		log.info("From Info");
		log.debug("From Debug");
		log.fatal("From fata");
		log.error("From error");
		log.warn("From warning");
		
	}

}
