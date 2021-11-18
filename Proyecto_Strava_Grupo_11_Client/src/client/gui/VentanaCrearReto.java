package client.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import server.dto.UsuarioDTO;


public class VentanaCrearReto extends JFrame {

	private JTextField textTitulo;
	private JTextField textDescripcion;
	private JTextField textFechaInicio;
	private JTextField textFechaFin;
	
	

	public VentanaCrearReto(UsuarioDTO usuario) {
		getContentPane().setForeground(new Color(0, 0, 0));
		getContentPane().setBackground(new Color(224, 255, 255));
		setBounds(100, 100, 597, 339);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblTituloVentana = new JLabel("Nuevo reto");
		lblTituloVentana.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloVentana.setFont(new Font("Colonna MT", Font.PLAIN, 20));
		lblTituloVentana.setBounds(176, 0, 248, 58);
		getContentPane().add(lblTituloVentana);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(26, 268, 89, 23);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new VentanaPrincipal(usuario);
			}
		});
		getContentPane().add(btnVolver);
		
		JButton btnAniadir = new JButton("Añadir");
		btnAniadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new VentanaPrincipal(usuario);
			
			}
		});
		btnAniadir.setBounds(230, 268, 89, 23);
		getContentPane().add(btnAniadir);
		
		JLabel lblTitulo = new JLabel("Título: ");
		lblTitulo.setBounds(10, 69, 48, 14);
		getContentPane().add(lblTitulo);
		
		JLabel lblDescripcion = new JLabel("Descripción: ");
		lblDescripcion.setBounds(272, 69, 80, 14);
		getContentPane().add(lblDescripcion);
		
		JLabel lblDeporte = new JLabel("Deporte:");
		lblDeporte.setBounds(10, 106, 57, 14);
		getContentPane().add(lblDeporte);
		
		JComboBox comboBoxDeporte = new JComboBox();
		comboBoxDeporte.setModel(new DefaultComboBoxModel(new String[] {"Natacion", "Triatlon", "Baloncesto", "Ciclismo", "Escalada", "Carreras"}));
		comboBoxDeporte.setSelectedIndex(1);
		comboBoxDeporte.setBounds(100, 103, 148, 20);
		getContentPane().add(comboBoxDeporte);
		
		textTitulo = new JTextField();
		textTitulo.setBounds(100, 66, 148, 20);
		getContentPane().add(textTitulo);
		textTitulo.setColumns(10);
		
		textDescripcion = new JTextField();
		textDescripcion.setColumns(10);
		textDescripcion.setBounds(355, 66, 148, 20);
		getContentPane().add(textDescripcion);
		
		textFechaInicio = new JTextField();
		textFechaInicio.setColumns(10);
		textFechaInicio.setBounds(355, 103, 148, 20);
		getContentPane().add(textFechaInicio);
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio: ");
		lblFechaInicio.setBounds(272, 106, 80, 14);
		getContentPane().add(lblFechaInicio);
		
		JLabel lblFechaFin = new JLabel("Fecha fin: ");
		lblFechaFin.setBounds(10, 148, 80, 14);
		getContentPane().add(lblFechaFin);
		
		textFechaFin = new JTextField();
		textFechaFin.setColumns(10);
		textFechaFin.setBounds(100, 145, 148, 20);
		getContentPane().add(textFechaFin);
		
		JSpinner spinnerObjetivo = new JSpinner();
		spinnerObjetivo.setBounds(356, 145, 58, 20);
		getContentPane().add(spinnerObjetivo);
		
		JLabel lblObjetivo = new JLabel("Objetivo: ");
		lblObjetivo.setBounds(272, 148, 74, 14);
		getContentPane().add(lblObjetivo);

		setVisible(true);

	}



}
