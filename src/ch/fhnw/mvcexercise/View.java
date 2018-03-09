package ch.fhnw.mvcexercise;

import java.util.logging.Logger;

import javax.swing.JTextField;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class View {
	
	protected Model model;
	private Stage stage;
	protected Label lblNumber;
	protected Button btnGo;
	protected TextField tf = new TextField();
	

	public View(Stage stage, Model model) {
		
		try {
		this.stage = stage;
		this.model = model;
		stage.setTitle("Adress Checker");
		
		BorderPane pane = new BorderPane();
		lblNumber = new Label();
		lblNumber.setText(Integer.toString(model.getValue()));
		pane.setTop(lblNumber);


		//textfeld für IP eingabe
		pane.setCenter(tf);
		
		btnGo = new Button();
		btnGo.setText("Click me!");
		pane.setBottom(btnGo);
		
		Scene scene = new Scene(pane);
		//scene.getStylesheets().add(
		//getClass().getResource("ButtonClickMVC.css").toExternalForm());
		stage.setScene(scene);
		
		
		Logger loggerView = Logger.getLogger(this.getClass().getName());
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
