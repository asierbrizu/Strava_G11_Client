package client.controller;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import client.remote.ServiceLocator;
import server.dto.SesionDTO;
import server.dto.RetoDTO;

//This class implements Controller pattern.
public class StravaController {
	
	//Reference to the Service Locator
	private ServiceLocator serviceLocator;
	
	public StravaController(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator; 
	}

	public ArrayList<RetoDTO> getRetos(String deporte) {
		try {
			return this.serviceLocator.getService().getRetos(deporte);
		} catch (RemoteException e) {
			System.out.println("# Error getting retos: " + e);
			return null;
		}
	}

	public ArrayList<SesionDTO> getSesiones(String deporte) {
		try {
			return this.serviceLocator.getService().getSesiones(deporte);
		} catch (RemoteException e) {
			System.out.println("# Error getting articles of a category: " + e);
			return null;
		}
	}

}