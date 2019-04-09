public class CLogin {

	public boolean authenticate(String userId, String password) {
		ELogin eLogin = new ELogin();
		return eLogin.authenticate(userId, password);
	}

}
