package client.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;

import client.MainProgram;
import client.controller.LoginController;
import server.dto.UsuarioDTO;




public class VentanaIniciarSesion extends JFrame {

	private JPanel panelUsuario;
	private JTextField usuario;
	private JLabel labelUsuario = new JLabel("        Usuario: ");

	private JPanel panelcontrasenya;
	private JPasswordField contrasenya;
	private JLabel labelcontrasenya = new JLabel("  Contraseña: ");

	private JButton aceptar;
	private JButton crearUsuario;
	private JPanel panelBotonera;

	private JPanel panelDatos;

	private JPanel panelDecorativo;
	private JLabel labelDecorativo;

	public static VentanaPrincipal principal ;

	public VentanaIniciarSesion() {
		setTitle("Inicio");
		setSize(310,260);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		setResizable(false);
		setLocationRelativeTo(null);
		setBackground(Color.WHITE);


		panelDecorativo = new JPanel();
		panelDecorativo.setLayout(new GridLayout(1,1));
		panelDecorativo.setBorder(BorderFactory.createEmptyBorder(10, 0, 20, 0)); //TOC
		labelDecorativo = new JLabel(new ImageIcon("iconos/login.png"));
		panelDecorativo.setBackground(Color.WHITE);
		panelDecorativo.add(labelDecorativo);
		add(panelDecorativo);


		panelDatos = new JPanel();
		panelDatos.setLayout(new GridLayout(3,1));
		panelDatos.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panelDatos.setSize(new Dimension(100,100));
		panelDatos.setBackground(new Color(111, 195, 179));
		panelDatos.setPreferredSize(new Dimension(280,100));
		add(panelDatos);

		panelUsuario = new JPanel();
		usuario = new JTextField();
		usuario.setPreferredSize(new Dimension(100,25));
		panelUsuario.add(labelUsuario);
		panelUsuario.add(usuario);
		panelUsuario.setBackground(new Color(111, 195, 179));
		panelDatos.add(panelUsuario);

		panelcontrasenya = new JPanel();
		contrasenya = new JPasswordField();
		contrasenya.setPreferredSize(new Dimension(100,25));
		panelcontrasenya.add(labelcontrasenya);
		panelcontrasenya.add(contrasenya);
		panelcontrasenya.setBackground(new Color(111, 195, 179));
		panelDatos.add(panelcontrasenya);

		panelBotonera = new JPanel();
		aceptar = new JButton("Iniciar Sesión");
		crearUsuario = new JButton("Crear Nuevo Usuario");
		aceptar.setEnabled(true);
		crearUsuario.setEnabled(true);
		panelBotonera.add(aceptar);
		panelBotonera.add(crearUsuario);
		panelBotonera.setBackground(new Color(111, 195, 179));
		panelDatos.add(panelBotonera);

		setVisible(true);		

	
	aceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(MainProgram.loginDialog.login()) {
					principal = new VentanaPrincipal(new UsuarioDTO("prueba@opendeusto.es", "Asier Brizuela"));
					
				}
			}
		});
	
	crearUsuario.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new VentanaRegistro();
			
		}
	});
	
	
	}



	@Override
	public void dispose() {
		MainProgram.loginDialog.logout();
		super.dispose();
	}
	
	

	



}

