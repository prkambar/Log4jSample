package loggerLog4j;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class TestAppConsoleAppender {
	//3. create logger object
	private static Logger log = Logger.getLogger(TestAppConsoleAppender.class);
		
	public static void main(String[] args) {
		//1. create layout		
		Layout layout =  new SimpleLayout();
//		/Layout layout =  new XMLLayout();
		// Layout layout =  new HTMLLayout();
		//Layout layout =  new PatternLayout("%p %d %C %M %m %n");
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
