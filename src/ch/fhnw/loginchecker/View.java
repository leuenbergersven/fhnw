package ch.fhnw.loginchecker;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class View {
	
	protected Model model;
	private Stage stage;
	protected Label label = new Label("Bitte geben Sie Ihre Logindaten ein!");
	protected Button btnCheck;
	protected TextField username = new TextField();
	protected TextField password = new TextField();
	
	

	public View(Stage stage, Model model) {
		try {
		this.stage = stage;
		this.model = model;
		stage.setTitle("Login Checker!");
		
		GridPane pane = new GridPane();
		pane.add(label, 0, 0);
		
		btnCheck = new Button();
		btnCheck.setText("Check");
		pane.add(btnCheck, 10, 10);
		
		//add textfields
		pane.add(username, 5, 5);
		pane.add(password, 10, 20);
		
		Scene scene = new Scene(pane);
		//scene.getStylesheets().add(
		//getClass().getResource("ButtonClickMVC.css").toExternalForm());
		stage.setScene(scene);
		}
		
		catch (Exception e) {
			System.out.println("Fehler bei der Erstellung des View-Objektes!");
		}
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
