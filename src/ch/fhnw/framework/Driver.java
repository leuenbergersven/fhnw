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
		
		//filehandler erstellen, wecher die logs in eine datei speichert
		/*try {
		FileHandler logHandler = new FileHandler(LOGGER_DESTINATION + LOGGER_NAME +".log");
		log = Logger.getLogger(LOGGER_NAME);
		log.setLevel(Level.INFO);
		log.addHandler(logHandler);
		} catch (Exception e) {
		throw new RuntimeException("Unable to initialize log files: "
		+ e.toString());
		}*/
		
		//objekte generieren mvc
		/*model = new Model();
		view = new View(primaryStage, model);
		controller = new Controller(model, view);
		view.start();
		log.info("Startmethode erfolgreich aufgerufen!");*/
		
		
		Splash_Model splashModel = new Splash_Model();
		Splash_View splashView = new Splash_View(primaryStage, splashModel);
		Splash_Controller splashController = new Splash_Controller(this, splashModel, splashView);
		splashView.start();
		
		splashModel.initialize();
	}
	
	public void startApp() {
		Stage appStage = new Stage();
		
		App_Model model = new App_Model();
		App_View view = new App_View(appStage, model);
		new App_Controller(model, view);
		
		serviceLocator = ServiceLocator.getServiceLocator();
		
		splashView.stop();
		splashView = null;
		
		view.start();
	}
	
	//fenster wird geschlossen
	public void stop() {
		if (view != null)
			view.stop();
		log.info("Fenster geschlossen");
	}

}
