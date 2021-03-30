package loggerLog4j;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;

public class Practice01 {
		
	//Create global logger 
	private static Logger log = Logger.getLogger(Practice01.class);
	
	public static void main(String[] args) throws Exception {
		// First Create Layout 
		Layout layout = new HTMLLayout();
		
		// Second Create Appender and Link 
		Appender append = new FileAppender(layout, "D:/mylogs/processLogs.html");
		
		// Fourth Add Appender 
		log.addAppender(append);
	
		log.info("Application Started.");
		log.info("Login successful by user.");
		log.info("Ticket is booked");
		log.info("Payment Recevied sucessfully.");
		log.info("Ticket sent over email and SMS");
		log.info("Ticket Booking process is completed");
		log.info("Application Logout.");
		
	}

}
