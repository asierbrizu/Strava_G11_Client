package client.gui;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import server.dto.SesionDTO;
import server.dto.RetoDTO;
import server.dto.UsuarioDTO;

public class VentanaObtenerRetosActivos extends JFrame {

	private ArrayList<RetoDTO> listaActual = new ArrayList<>();
	private JComboBox comboBox;

	public VentanaObtenerRetosActivos(UsuarioDTO usuario, List<RetoDTO> retos, List<RetoDTO> retos2) {

		getContentPane().setBackground(new Color(224, 255, 255));
		setBounds(100, 100, 694, 352);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new VentanaPrincipal(usuario);
			
			}
		});
		btnVolver.setBounds(20, 280, 89, 23);
		getContentPane().add(btnVolver);
		
		JLabel lblTituloVentana = new JLabel("Retos activos");
		lblTituloVentana.setBounds(190, 0, 254, 89);
		getContentPane().add(lblTituloVentana);
		lblTituloVentana.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloVentana.setFont(new Font("Colonna MT", Font.PLAIN, 23));
		
		JPanel panelInfo = new JPanel();
		panelInfo.setBorder(new TitledBorder(null, "Sobre el reto: ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelInfo.setBackground(Color.WHITE);
		panelInfo.setBounds(283, 176, 246, 89);
		getContentPane().add(panelInfo);
		panelInfo.setLayout(new GridLayout(3, 1));
		
		JCheckBox checkboxNatacion = new JCheckBox("Natacion");
		checkboxNatacion.setBackground(new Color(250, 235, 215));
		checkboxNatacion.setSelected(true);
		checkboxNatacion.setBounds(10, 85, 99, 23);
		getContentPane().add(checkboxNatacion);
		
		JCheckBox checkboxTriatlon = new JCheckBox("Triatlon");
		checkboxTriatlon.setSelected(true);
		checkboxTriatlon.setBackground(new Color(250, 235, 215));
		checkboxTriatlon.setBounds(10, 112, 99, 23);
		getContentPane().add(checkboxTriatlon);
		
		JButton btnAniadir = new JButton("A\u00F1adir reto");
		btnAniadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new VentanaPrincipal(usuario);
			
			}
		});
		btnAniadir.setBounds(140, 280, 89, 23);
		getContentPane().add(btnAniadir);
		
		JCheckBox chexkboxBaloncesto = new JCheckBox("Baloncesto");
		chexkboxBaloncesto.setSelected(true);
		chexkboxBaloncesto.setBackground(new Color(250, 235, 215));
		chexkboxBaloncesto.setBounds(145, 85, 99, 23);
		getContentPane().add(chexkboxBaloncesto);
		
		JCheckBox checkboxEscalada = new JCheckBox("Escalada");
		checkboxEscalada.setSelected(true);
		checkboxEscalada.setBackground(new Color(250, 235, 215));
		checkboxEscalada.setBounds(283, 85, 99, 23);
		getContentPane().add(checkboxEscalada);
		
		JCheckBox checkboxAtletismo = new JCheckBox("Atletismo");
		checkboxAtletismo.setSelected(true);
		checkboxAtletismo.setBackground(new Color(250, 235, 215));
		checkboxAtletismo.setBounds(420, 85, 99, 23);
		getContentPane().add(checkboxAtletismo);
		
		JCheckBox checkboxCiclismo = new JCheckBox("Ciclismo");
		checkboxCiclismo.setSelected(true);
		checkboxCiclismo.setBackground(new Color(250, 235, 215));
		checkboxCiclismo.setBounds(145, 112, 99, 23);
		getContentPane().add(checkboxCiclismo);
		
		JCheckBox checkboxCarreras = new JCheckBox("Carreras");
		checkboxCarreras.setSelected(true);
		checkboxCarreras.setBackground(new Color(250, 235, 215));
		checkboxCarreras.setBounds(283, 112, 99, 23);
		getContentPane().add(checkboxCarreras);
		
		JCheckBox checkboxFutbol = new JCheckBox("Futbol");
		checkboxFutbol.setSelected(true);
		checkboxFutbol.setBackground(new Color(250, 235, 215));
		checkboxFutbol.setBounds(420, 112, 99, 23);
		getContentPane().add(checkboxFutbol);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(20, 167, 234, 32);
		getContentPane().add(comboBox_1);
		comboBox_1.setSelectedIndex(-1);
		comboBox_1.setBackground(Color.WHITE);
		
		comboBox = new JComboBox<>();

		for (RetoDTO retoDTO : retos) {
			listaActual.add(retoDTO);
			comboBox.addItem(retoDTO.getNombre() + " - " + retoDTO.getDeporte());
		}
		for (RetoDTO retoDTO : retos2) {
			listaActual.add(retoDTO);
			comboBox.addItem(retoDTO.getNombre() + " - " + retoDTO.getDeporte());
			repaint();
			validate();
			revalidate();
		}
				
		comboBox_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int index = comboBox_1.getSelectedIndex();
				RetoDTO reto = listaActual.get(index);

				panelInfo.removeAll();
				panelInfo.revalidate();
				repaint();
				validate();
				revalidate();

				panelInfo.add(new JLabel("Titulo: " + reto.getNombre()));
				panelInfo.add(new JLabel("Deporte: " + reto.getDeporte()));
				panelInfo.add(new JLabel("Duracion: " + reto.getTiempo_objetivo()));

				repaint();
				validate();
			}
		});



		checkboxNatacion.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				listaActual = new ArrayList<>();
				JComboBox combo = new JComboBox<String>();
			
				repaint();
				validate();
				revalidate();

			
				
				combo.setSelectedIndex(-1);

				combo.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						int index = combo.getSelectedIndex();
						RetoDTO reto = listaActual.get(index);

						panelInfo.removeAll();
						panelInfo.revalidate();
						repaint();
						validate();
						revalidate();

						panelInfo.add(new JLabel("Titulo: " + reto.getNombre()));
						panelInfo.add(new JLabel("Deporte: " + reto.getDeporte()));
						panelInfo.add(new JLabel("Duracion: " + reto.getTiempo_objetivo()));

						repaint();
						validate();
					}
				});

				repaint();
				validate();
				revalidate();

			}
		});

		checkboxTriatlon.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				listaActual = new ArrayList<>();
				JComboBox combo = new JComboBox<String>();
				repaint();
				validate();
				revalidate();

			
				combo.setSelectedIndex(-1);

				combo.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						int index = combo.getSelectedIndex();
						RetoDTO reto = listaActual.get(index);

						panelInfo.removeAll();
						panelInfo.revalidate();
						repaint();
						validate();
						revalidate();

						panelInfo.add(new JLabel("Titulo: " + reto.getNombre()));
						panelInfo.add(new JLabel("Deporte: " + reto.getDeporte()));
						panelInfo.add(new JLabel("Duracion: " + reto.getTiempo_objetivo()));

						repaint();
						validate();
					}
				});

				repaint();
				validate();
				revalidate();

			}
		});

		setVisible(true);
	}
}
