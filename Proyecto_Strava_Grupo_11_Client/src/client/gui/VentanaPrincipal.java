package client.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import client.controller.StravaController;
import client.remote.ServiceLocator;
import client.MainProgram;
import client.controller.LoginController;
import server.dto.SesionDTO;
import server.dto.UsuarioDTO;

public class VentanaPrincipal extends JFrame {	
	
	private static StravaController controlador = MainProgram.stravaController;
	
	public VentanaPrincipal(UsuarioDTO usuario) {
		
		getContentPane().setBackground(new Color(224, 255, 255));
		setBounds(100, 100, 779, 231);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1.setBounds(10, 214, 65, 14);
		getContentPane().add(lblNewLabel_1_2_1);
		
		JButton btnPerfil = new JButton("Mi perfil");
		btnPerfil.setBackground(new Color(248, 248, 255));
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnPerfil.setBackground(new Color(250, 235, 215));
		btnPerfil.setBounds(351, 142, 99, 39);
		getContentPane().add(btnPerfil);
		
		JLabel lblTituloVentana = new JLabel("Bienvenido a Strava " + usuario.getNombre());
		lblTituloVentana.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloVentana.setFont(new Font("Haettenschweiler", Font.PLAIN, 27));
		lblTituloVentana.setBounds(230, 11, 360, 37);
		getContentPane().add(lblTituloVentana);
		
		JButton btnCrearSesion = new JButton("Crear sesión");
		btnCrearSesion.setBounds(10, 97, 175, 34);
		btnCrearSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaCrearSesion(usuario);
				dispose();
			}
		});
		getContentPane().add(btnCrearSesion);
		
		JButton btnVerSesion = new JButton("Ver sesión");
		btnVerSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaVerSesiones(usuario, controlador.getSesiones("Atletismo"), controlador.getSesiones("Futbol"));
				dispose();
			}
		});
		btnVerSesion.setBounds(195, 97, 175, 34);
		getContentPane().add(btnVerSesion);
		
		JButton btnCrearReto = new JButton("Crear reto");
		btnCrearReto.setBounds(378, 97, 175, 34);
		btnCrearReto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaCrearReto(usuario);
				dispose();
			}
		});
		getContentPane().add(btnCrearReto);
		
		JButton btnVerRetos = new JButton("Ver retos");
		btnVerRetos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaObtenerRetosActivos(usuario, controlador.getRetos("Atletismo"), controlador.getRetos("Futbol"));
				dispose();
			}
		});
		btnVerRetos.setBounds(563, 97, 175, 34);
		getContentPane().add(btnVerRetos);
		
		
		
		setVisible(true);
	}
	
}
