package ch.fhnw.mvcexercise;

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

	//main-method
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Logger loggerDriver = Logger.getLogger(this.getClass().getName());
		Handler[] defaultHandler = Logger.getLogger("").getHandlers();
		//System.out.println(defaultHandler.length);
		try {
			Handler logHandler = new FileHandler("%t/" + loggerDriver +
					"_%u" + "_%g" + ".log", 1000000, 9);
			
			logHandler.setLevel(Level.WARNING);
			loggerDriver.addHandler(logHandler);
		}
		catch(Exception e) {
			throw new RuntimeException("Unable to initialize log files!" + e.toString());
		}
		
		//Beispiele, wie die Logger gefüllt werden können
		//loggerDriver.warning("Warnung!");
		//loggerDriver.severe("Fehler!");
	
		
		model = new Model();
		view = new View(primaryStage, model);
		controller = new Controller(model, view);
		view.start();
	}
	
	public void stop() {
		if (view != null)
			view.stop();
	}

}
