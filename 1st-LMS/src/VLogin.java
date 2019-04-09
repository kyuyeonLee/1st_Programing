import java.util.Scanner;

public class VLogin {

	public void authenticate() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("UserId : ");
		String userId = scanner.next();
		System.out.print("Password : ");
		String password = scanner.next();
		System.out.println(password);
		
		scanner.close();
		
		CLogin cLogin = new CLogin();
		boolean result = cLogin.authenticate(userId, password);
	}
}
