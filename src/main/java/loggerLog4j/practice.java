package loggerLog4j;
import org.apache.log4j.Logger;
public class practice {
	
	private static Logger log = Logger.getLogger(practice.class);
	
	public static void main(String[] args) {
		
		//PropertyConfigurator.configure("log4j.properties");
		// TODO Auto-generated method stub
		//Layout layout = new SimpleLayout();
		//Appender app = new ConsoleAppender(layout);
		
		//log.addAppender(app);
		
		log.info("Login SucessFul");
		log.info("Ticket Book");
		log.info("Payment");
		log.info("SMS sent/Email Sent");
		log.info("Booking confirmed");
	
	}

}
