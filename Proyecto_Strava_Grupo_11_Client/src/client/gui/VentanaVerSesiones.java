package client.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.table.DefaultTableModel;

import server.dto.SesionDTO;
import server.dto.UsuarioDTO;



public class VentanaVerSesiones extends JFrame {
	
	private DefaultTableModel dtm;

	public VentanaVerSesiones(UsuarioDTO usuario, List<SesionDTO> sesiones, List<SesionDTO> sesiones2) {
				
		new JFrame();
		getContentPane().setBackground(new Color(224, 255, 255));
		setBounds(100, 100, 610, 408);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VentanaPrincipal(usuario);
				dispose();
			}
		});
		btnVolver.setBounds(40, 339, 89, 23);
		getContentPane().add(btnVolver);
		
		JLabel lblVentanaTitulo = new JLabel("Sesiones");
		lblVentanaTitulo.setBounds(140, 13, 306, 89);
		getContentPane().add(lblVentanaTitulo);
		lblVentanaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblVentanaTitulo.setFont(new Font("Colonna MT", Font.PLAIN, 20));
		
		JTable tablaSesiones = new JTable();
		tablaSesiones.setBackground(new Color(255, 255, 255));
		tablaSesiones.setBorder(new CompoundBorder());
		tablaSesiones.setBounds(85, 113, 426, 203);
		getContentPane().add(tablaSesiones);

	
		dtm = new DefaultTableModel();
		dtm.addColumn("Título");
		dtm.addColumn("Duración");
		dtm.addColumn("Distancia");
		tablaSesiones.setModel(dtm);
		dtm.setNumRows(sesiones.size());

		String[] arrayTitulos = new String[3];
		arrayTitulos[0] = "Título";
		arrayTitulos[1] = "Distancia";
		arrayTitulos[2] = "Duración";
		dtm.addRow(arrayTitulos);					
		
		for (SesionDTO sesion : sesiones) {
			String[] arrayInfo = new String[3];
			arrayInfo[0] = sesion.getTitulo();
			arrayInfo[1] = sesion.getDistancia()+"";
			arrayInfo[2] = sesion.getDuracion()+"";
			dtm.addRow(arrayInfo);					
		}
		
		dtm.removeRow(0);
		
		
	
		
		JComboBox comboBoxDeportes = new JComboBox();
		comboBoxDeportes.setModel(new DefaultComboBoxModel(new String[] {"Natacion", "Triatlon", "Baloncesto", "Ciclismo", "Atletismo", "Futbol"}));
		comboBoxDeportes.setSelectedIndex(0);
		comboBoxDeportes.setBounds(40, 82, 108, 22);
		getContentPane().add(comboBoxDeportes);
		comboBoxDeportes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				tablaSesiones.setModel(new DefaultTableModel());
				dtm = new DefaultTableModel();
				dtm.addColumn("Título");
				dtm.addColumn("Duración");
				dtm.addColumn("Distancia");
				tablaSesiones.setModel(dtm);
				dtm.setNumRows(sesiones.size());
				String[] arrayTitulos = new String[3];
				arrayTitulos[0] = "Título";
				arrayTitulos[1] = "Distancia";
				arrayTitulos[2] = "Duración";
				dtm.addRow(arrayTitulos);	
				dtm.removeRow(0);
				
				if(((String) comboBoxDeportes.getSelectedItem()).matches("Atletismo")) {
					
					for (SesionDTO sesion: sesiones) {
						String[] arrayInfo = new String[3];
						arrayInfo[0] = sesion.getTitulo();
						arrayInfo[1] = sesion.getDistancia()+"";
						arrayInfo[2] = sesion.getDuracion()+"";
						dtm.addRow(arrayInfo);					
					}
					
				} else if(((String) comboBoxDeportes.getSelectedItem()).matches("Futbol")) {
	
					for (SesionDTO sesion: sesiones2) {
						String[] arrayInfo = new String[3];
						arrayInfo[0] = sesion.getTitulo();
						arrayInfo[1] = sesion.getDistancia()+"";
						arrayInfo[2] = sesion.getDuracion()+"";
						dtm.addRow(arrayInfo);					
					}
					
				}
				
				repaint();
				validate();
				
			}
		});
		
		
		setVisible(true);
	}
}
