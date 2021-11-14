package client;

import java.util.List;
import client.gui.VentanaIniciarSesion;



import client.controller.LoginController;
import client.controller.StravaController;
import client.gui.LoginDialog;
import client.gui.VentanaIniciarSesion;
import client.remote.ServiceLocator;

public class MainProgram {

	public static LoginDialog loginDialog;


		public static void main(String[] args) {	
			ServiceLocator serviceLocator = new ServiceLocator();
			
			//args[0] = RMIRegistry IP
			//args[1] = RMIRegistry Port
			//args[2] = Service Name
			serviceLocator.setService(args[0], args[1], args[2]);
			
			LoginController loginController = new LoginController(serviceLocator);
			StravaController stravaController = new StravaController(serviceLocator);			
			VentanaIniciarSesion ventana = new VentanaIniciarSesion();
			
			
			
			
			
		}
	}

