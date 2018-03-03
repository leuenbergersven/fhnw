package ch.fhnw.mvcexample;

public class Model {

	private int value;
	
	public Model() {
		value = 0;
	}
	
	public int getValue() {
		return value;
	}
	
	public int incrementValue() {
		value++;
		return value;
	}
}