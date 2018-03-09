package ch.fhnw.loginchecker;

public class Model {

	private String username;
	private String password;
	
	//kontruktor setzt ein neues benutzerobjekt
	public Model(String u, String p) {
		this.username = u;
		this.password = p;
	}
	
	//getter für username und password
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	//setter für username und passwort
	public void setUsername(String u) {
		this.username = u;
	}
	
	public void setPassword(String p) {
		this.password = p;
	}
	
	//methode um username zu überprüfen
	public boolean checkUsername(String u) {
		if(this.username.equals(u)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//methode um password zu überprüfen
	public boolean checkPassword(String p) {
		if(this.password.equals(p)) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	//toString Methode für Model-Objekt
	public String toString() {
		String result = new String("Username: " +this.username+"     Passwort: "+this.password);
		return result;
	}

}