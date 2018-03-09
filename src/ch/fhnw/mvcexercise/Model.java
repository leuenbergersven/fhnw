package ch.fhnw.mvcexercise;

import java.util.logging.Logger;

public class Model {
	

	private int value;
	
	public Model() {
		value = 0;
	Logger loggerModel =	Logger.getLogger(this.getClass().getName());
	}
	
	public int getValue() {
		return value;
	}
	
	public int incrementValue() {
		value++;
		return value;
	}
}