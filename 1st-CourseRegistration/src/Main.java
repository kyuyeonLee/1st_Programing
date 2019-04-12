public class Main {
	private VLogin login;
	
	//constructor
	public Main() {
		this.login = new VLogin();
	}
	
	public void run() {
		this.login.authenticate();
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
}
