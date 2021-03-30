package loggerLog4j;

import java.lang.invoke.MethodHandleInfo;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Practice02 {
	
	private static Logger log = Logger.getLogger(Practice02.class);
	
	public static void main(String[] args) {
		
		Layout ly = new SimpleLayout();

		Appender  append = new ConsoleAppender(ly);
		
		log.addAppender(append);
		
		log.info("hi");
	}
		
}


