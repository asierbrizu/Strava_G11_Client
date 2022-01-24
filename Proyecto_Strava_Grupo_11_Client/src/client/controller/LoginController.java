package client.controller;

import java.rmi.RemoteException;
import client.remote.ServiceLocator;
import server.domain.TipoUsuario;
import server.dto.UsuarioDTO;

//This class implements Controller pattern.
public class LoginController {	
	
	//Reference to the Service Locator
	private ServiceLocator serviceLocator;
	//This attibute stores the token when login success
	private long token = -1; //-1 = login has not been done or fails

	public LoginController(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}
	
	public boolean login(String email, String password, TipoUsuario tipo) {
		try {
			this.token = this.serviceLocator.getService().login(email, password, tipo);			
			return true;
		} catch (RemoteException e) {
			System.out.println("# Error al iniciar sesión: " + e);
			this.token = -1;
			return false;
		}
	}
	
	public void logout() {
		try {
			this.serviceLocator.getService().logout(this.token);
			this.token = -1;
		} catch (RemoteException e) {
			System.out.println("# Error al cerrar sesión: " + e);
		}
	}

	public long getToken() {
		return token;
	}
	
	public UsuarioDTO getUsuario(String email, String contrasenya) {
		try {
			return this.serviceLocator.getService().getUsuario(email, contrasenya);
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}


}