package client.gui;

import client.controller.LoginController;
import client.controller.StravaController;
import server.domain.TipoUsuario;

public class LoginDialog {	
	private LoginController controller;	
	
	public LoginDialog(LoginController loginController, StravaController stravaController) {
		this.controller = controller;
	}
	
	public boolean login(String email, String password, TipoUsuario tipo) {		
		System.out.println(" - Login into the server: '" + email + "' - '" + password + "' ...");
		String sha1 = org.apache.commons.codec.digest.DigestUtils.sha1Hex(password);
		System.out.println("\t* Password hash: " + sha1);		
		boolean result = this.controller.login(email, sha1, tipo);
		System.out.println("\t* Login result: " + result);
		System.out.println("\t* Token: " + this.controller.getToken());
		
		return result;
	}
	
	public void logout() {
		System.out.println(" - Logout from the server...");		
		this.controller.logout();
		System.out.println("\t* Logout success!");		

	}
}