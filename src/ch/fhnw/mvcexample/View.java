package ch.fhnw.mvcexample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class View {
	
	private Model model;
	private Stage stage;
	protected Label lblNumber;
	protected Button btnClick;
	

	public View(Stage stage, Model model) {
		this.stage = stage;
		this.model = model;
		stage.setTitle("Button Click!");
		
		GridPane pane = new GridPane();
		lblNumber = new Label();
		lblNumber.setText(Integer.toString(model.getValue()));
		pane.add(btnClick, 0, 0);
		
		btnClick = new Button();
		btnClick.setText("Click me!");
		pane.add(btnClick, 0, 1);
		
		Scene scene = new Scene(pane);
		scene.getStylesheets().add(
		getClass().getResource("ButtonClickMVC.css").toExternalForm());
		stage.setScene(scene);;		
	}
	
	public void start() {
		stage.show();
	}
	
	public void stop() {
		stage.hide();
	}
	
	public Stage getStage() {
		return stage;
	}
}
