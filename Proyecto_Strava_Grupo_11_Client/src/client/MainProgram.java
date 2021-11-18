package client;

import java.util.List;
import client.gui.VentanaIniciarSesion;
import client.gui.VentanaPrincipal;
import client.controller.LoginController;
import client.controller.VentanaPrincipalController;
import client.gui.LoginDialog;
import client.gui.VentanaIniciarSesion;
import client.remote.ServiceLocator;
import server.dto.UsuarioDTO;

public class MainProgram {

	public static LoginDialog loginDialog;
	public static VentanaPrincipalController ventanaPrincipalController;			
	

		public static void main(String[] args) {	
			ServiceLocator serviceLocator = new ServiceLocator();
			
			//args[0] = RMIRegistry IP
			//args[1] = RMIRegistry Port
			//args[2] = Service Name
			serviceLocator.setService(args[0], args[1], args[2]);
			
			LoginController loginController = new LoginController(serviceLocator);
			loginDialog=new LoginDialog(loginController);
			ventanaPrincipalController = new VentanaPrincipalController(serviceLocator);
			VentanaIniciarSesion ventana = new VentanaIniciarSesion();
			
			
			
		}
	}

