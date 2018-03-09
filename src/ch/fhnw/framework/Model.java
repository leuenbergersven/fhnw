package ch.fhnw.framework;

import java.util.logging.Logger;

public class Model {

	private int value;
	Logger log = Logger.getLogger(Driver.LOGGER_NAME);
	
	public Model() {
		value = 0;
		log.info("Model-Objekt erfolgreich generiert");
	}
	
	public int getValue() {
		log.info("Wert zurückgegeben");
		return value;
	}
	
	public int incrementValue() {
		value++;
		log.info("Wert erhöht");
		return value;
	}
}