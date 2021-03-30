package loggerLog4j;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Practice03TryCatch {
	
	private static Logger log = Logger.getLogger(Practice03TryCatch.class);
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Appender append = new ConsoleAppender(new SimpleLayout(), "sample.text");
			log.addAppender(append);
			
					}
		catch(Exception e) {
			log.info(e);
		}
		
	}

}
