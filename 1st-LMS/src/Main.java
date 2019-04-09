import java.io.File;
import java.util.Scanner;

public class Main {
	
	private VLogin login;
	private CLogin logindata;
	
	//constructor
	public Main() {
		this.login = new VLogin();
		this.logindata = new CLogin();
	}
	
	private void run() {
		this.login.authenticate();
		this.logindata.authenticate(userId, password);
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	
	
	
	
}
