package ch.fhnw.framework;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServiceLocator {
	private static ServiceLocator sl;
	
	public static final String LOGGER_NAME = Driver.class.getSimpleName();
	private String LOGGER_DESTINATION = new String("/Users/sven/Desktop/log/");
	private static Logger log = null;
	
	public ServiceLocator() {
		
	}
	
	public void setLogger() {
		try {
		FileHandler logHandler = new FileHandler(LOGGER_DESTINATION + LOGGER_NAME +".log");
		log = Logger.getLogger(LOGGER_NAME);
		log.setLevel(Level.INFO);
		log.addHandler(logHandler);
		} catch (Exception e) {
		throw new RuntimeException("Unable to initialize log files: "
		+ e.toString());
		}
	}
	
	public ServiceLocator getServiceLocator() {
		return sl;
	}
	

}
