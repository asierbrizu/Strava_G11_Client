package client.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import client.controller.StravaController;
import server.dto.UsuarioDTO;





public class VentanaCrearSesion extends JFrame {
	
	private JTextField textTitulo;
	private JTextField textFechaInicio;
	private JTextField textFechaFin;
	private JTextField textDistancia;
	
	
	

	
	
	public VentanaCrearSesion(UsuarioDTO usuario, StravaController controlador) {
		
		getContentPane().setForeground(new Color(0, 0, 0));
		getContentPane().setBackground(new Color(224, 255, 255));
		setBounds(100, 100, 649, 339);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblTituloVentana = new JLabel("Nueva sesión");
		lblTituloVentana.setBackground(new Color(224, 255, 255));
		lblTituloVentana.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloVentana.setFont(new Font("Colonna MT", Font.PLAIN, 20));
		lblTituloVentana.setBounds(218, 11, 238, 40);
		getContentPane().add(lblTituloVentana);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(26, 268, 89, 23);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new VentanaPrincipal(usuario, controlador);
			}
		});
		getContentPane().add(btnVolver);
		
		JButton btnAniadir = new JButton("Añadir");
		btnAniadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAniadir.setBounds(248, 268, 89, 23);
		getContentPane().add(btnAniadir);
		
		JLabel lblTitulo = new JLabel("Título: ");
		lblTitulo.setBounds(10, 100, 48, 14);
		getContentPane().add(lblTitulo);
		
		JLabel lblDeporte = new JLabel("Deporte:");
		lblDeporte.setBounds(280, 100, 57, 14);
		getContentPane().add(lblDeporte);
		
		JComboBox comboBoxDeporte = new JComboBox();
		comboBoxDeporte.setModel(new DefaultComboBoxModel(new String[] {"Natacion", "Triatlon", "Baloncesto", "Ciclismo", "Escalada", "Carreras"}));
		comboBoxDeporte.setSelectedIndex(1);
		comboBoxDeporte.setBounds(338, 97, 148, 20);
		getContentPane().add(comboBoxDeporte);
		
		textTitulo = new JTextField();
		textTitulo.setBounds(100, 97, 148, 20);
		getContentPane().add(textTitulo);
		textTitulo.setColumns(10);
		
		textFechaInicio = new JTextField();
		textFechaInicio.setColumns(10);
		textFechaInicio.setBounds(338, 138, 148, 20);
		getContentPane().add(textFechaInicio);
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio: ");
		lblFechaInicio.setBounds(280, 141, 80, 14);
		getContentPane().add(lblFechaInicio);
		
		JLabel lblFechaFin = new JLabel("Fecha fin: ");
		lblFechaFin.setBounds(10, 190, 80, 14);
		getContentPane().add(lblFechaFin);
		
		textFechaFin = new JTextField();
		textFechaFin.setColumns(10);
		textFechaFin.setBounds(100, 187, 148, 20);
		getContentPane().add(textFechaFin);
		
		JSpinner spinnerDuracion = new JSpinner();
		spinnerDuracion.setBounds(336, 187, 58, 20);
		getContentPane().add(spinnerDuracion);
		
		JLabel lblDuracion = new JLabel("Duración: ");
		lblDuracion.setBounds(277, 190, 74, 14);
		getContentPane().add(lblDuracion);
		
		JLabel lblDistancia = new JLabel("Distancia: ");
		lblDistancia.setBounds(10, 141, 80, 14);
		getContentPane().add(lblDistancia);
		
		textDistancia = new JTextField();
		textDistancia.setColumns(10);
		textDistancia.setBounds(100, 138, 148, 20);
		getContentPane().add(textDistancia);

		setVisible(true);


	}
}
