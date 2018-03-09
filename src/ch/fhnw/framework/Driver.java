package ch.fhnw.framework;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.stage.Stage;

public class Driver extends Application {
	

	//initialising the 3 main objects
	private View view;
	private Model model;
	private Controller controller;
	
	//initialisiert den logger
	public static final String LOGGER_NAME = Driver.class.getSimpleName();
	private String LOGGER_DESTINATION = new String("/Users/sven/Desktop/log/");
	private Logger log = null;
	
	
	//main-method
	public static void main(String[] args) {	
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Add a file handler: put rotating files in the tmp directory
		try {
		FileHandler logHandler = new FileHandler(LOGGER_DESTINATION+LOGGER_NAME +".log");
		log = Logger.getLogger(LOGGER_NAME);
		log.setLevel(Level.INFO);
		log.addHandler(logHandler);
		} catch (Exception e) {
		throw new RuntimeException("Unable to initialize log files: "
		+ e.toString());
		}
		
		model = new Model();
		view = new View(primaryStage, model);
		controller = new Controller(model, view);
		view.start();
		log.info("Startmethode erfolgreich aufgerufen!");
	}
	
	public void stop() {
		if (view != null)
			view.stop();
		log.info("Fenster geschlossen");
	}

}
