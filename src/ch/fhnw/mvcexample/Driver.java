package ch.fhnw.mvcexample;

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
