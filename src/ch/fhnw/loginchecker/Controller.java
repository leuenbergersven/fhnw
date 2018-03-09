package ch.fhnw.loginchecker;

import javafx.event.ActionEvent;

public class Controller {
	final private Model model;
	final private View view;
	 
	 protected Controller(Model model, View view) {
		 this.model = model;
		 this.view = view;

		 
		 view.btnCheck.setOnAction((event) -> {
			 boolean u = false;
			 boolean p = false;
			 
			 String tryU = new String (view.username.getText());
			 String tryP = new String (view.password.getText());
			 

			 
			 //check username
			 u = model.checkUsername(tryU);
			 if (u == true) {
				 System.out.println("Benutzername korrekt!"); 
				 
				 //password überprüfen
				 p = model.checkPassword(tryP);
				 if(p == true) {
					 System.out.println("Passwort ebenfalls korrekt!");
				 }
				 else {
					 System.out.println("Passwort stimmt nicht");
				 }
			 }
			 else {
				 System.out.println("Benutzername nicht korrekt!");
			 }


		 });	

	 }
	
}
