package ch.fhnw.mvcexercise;

import java.util.logging.Logger;

import javafx.event.ActionEvent;

public class Controller {
	final private Model model;
	final private View view;
	 
	 protected Controller(Model model, View view) {
		 this.model = model;
		 this.view = view;
		 
		 Logger loggerController = Logger.getLogger(this.getClass().getName());
		 
		 view.btnGo.setOnAction((event) -> {
			 model.incrementValue();
			 String newText = Integer.toString(model.getValue());
			 view.lblNumber.setText(newText);
		 });	

	 }
	
}
