package ch.fhnw.loginchecker;

import javafx.application.Application;
import javafx.stage.Stage;

public class Driver extends Application {

	//initialising the 3 main objects
	private View view;
	private Model benutzer;
	private Controller controller;

	//main-method
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		String username = "Sven";
		String password = "1234";
		benutzer = new Model(username, password);
		//System.out.println(benutzer.toString());
		view = new View(primaryStage, benutzer);
		controller = new Controller(benutzer, view);
		view.start();
	}
	
	public void stop() {
		if (view != null)
			view.stop();
	}

}
