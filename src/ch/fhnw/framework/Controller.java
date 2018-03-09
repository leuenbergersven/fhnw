package ch.fhnw.framework;

import javafx.event.ActionEvent;

public class Controller {
	final private Model model;
	final private View view;
	 
	 protected Controller(Model model, View view) {
		 this.model = model;
		 this.view = view;
		 
		 view.btnClick.setOnAction((event) -> {
			 model.incrementValue();
			 String newText = Integer.toString(model.getValue());
			 view.lblNumber.setText(newText);
		 });	

	 }
	
}
