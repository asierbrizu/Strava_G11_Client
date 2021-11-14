package client.gui;


import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;



import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import com.toedter.calendar.JDateChooser;

import client.controller.StravaController;
import server.dto.UsuarioDTO;



public class VentanaRegistro extends JFrame {
	
	   
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblTituloVentana;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblFrecuenciaMax;
    private javax.swing.JPanel panelCreacionUsuario;
    private com.toedter.calendar.JDateChooser txtFecha1;
    private javax.swing.JTextField txtNombre;
    private ImageIcon imagenGuardar;
    private JTextField textEmail;
    private JPasswordField txtcontrasenia;
    private JDateChooser dateChooser;
    
    public VentanaRegistro() {}
    public VentanaRegistro(UsuarioDTO usuario, StravaController controlador) {
    	
   
    	
    	
    	imagenGuardar = new ImageIcon("img/guardar.png"); 

        panelCreacionUsuario = new javax.swing.JPanel();
        lblTituloVentana = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblFrecuenciaMax = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnGuardar.setIcon(imagenGuardar);
        btnGuardar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnCancelar = new javax.swing.JButton();

        panelCreacionUsuario.setBackground(new java.awt.Color(51, 51, 255));

        lblTituloVentana.setFont(new Font("Tahoma", Font.BOLD, 13)); 
        lblTituloVentana.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloVentana.setText("Usuario");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");

        lblContrasenia.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        lblContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasenia.setText("Contrase\u00F1a");

        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha ncto.");

        lblPeso.setForeground(new java.awt.Color(255, 255, 255));
        lblPeso.setText("Peso");

        lblAltura.setForeground(new java.awt.Color(255, 255, 255));
        lblAltura.setText("Altura");

        lblFrecuenciaMax.setForeground(new java.awt.Color(255, 255, 255));
        lblFrecuenciaMax.setText("Frecuencia cardiaca max");

        btnGuardar.setText("Guardar");
      

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	dispose();
            	
               
            }
        });
        
        JLabel lblFrecuenciaReposo = new JLabel();
        lblFrecuenciaReposo.setText("Frecuencia cardiaca en reposo");
        lblFrecuenciaReposo.setForeground(Color.WHITE);
        lblFrecuenciaReposo.setFont(new Font("Tahoma", Font.PLAIN, 11));
        
        textEmail = new JTextField();
        
        txtcontrasenia = new JPasswordField();
        
        JSpinner spinnerPeso = new JSpinner();
        
        JSpinner spinnerAltura = new JSpinner();
        
        JSpinner spinnerFrecMax = new JSpinner();
        
        JSpinner spinnerFrecReposo = new JSpinner();
        
        JDateChooser dateChooser = new JDateChooser();
        
        javax.swing.GroupLayout gl_panelCreacionUsuario = new javax.swing.GroupLayout(panelCreacionUsuario);
        gl_panelCreacionUsuario.setHorizontalGroup(
        	gl_panelCreacionUsuario.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, gl_panelCreacionUsuario.createSequentialGroup()
        			.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.TRAILING)
        				.addGroup(gl_panelCreacionUsuario.createSequentialGroup()
        					.addGap(34)
        					.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(gl_panelCreacionUsuario.createSequentialGroup()
        							.addComponent(lblContrasenia)
        							.addGap(18)
        							.addComponent(txtcontrasenia))
        						.addGroup(gl_panelCreacionUsuario.createSequentialGroup()
        							.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblTituloVentana)
        								.addComponent(lblNombre)
        								.addComponent(lblEmail))
        							.addGap(28)
        							.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.LEADING)
        								.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))))
        					.addGap(103)
        					.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panelCreacionUsuario.createSequentialGroup()
        							.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblFecha)
        								.addComponent(lblPeso)
        								.addComponent(lblAltura))
        							.addGap(62)
        							.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.LEADING)
        								.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
        								.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.TRAILING, false)
        									.addComponent(spinnerAltura, Alignment.LEADING)
        									.addComponent(spinnerPeso, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))))
        						.addGroup(gl_panelCreacionUsuario.createSequentialGroup()
        							.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblFrecuenciaMax)
        								.addComponent(lblFrecuenciaReposo, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.LEADING)
        								.addComponent(spinnerFrecReposo, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        								.addComponent(spinnerFrecMax, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))))
        				.addGroup(gl_panelCreacionUsuario.createSequentialGroup()
        					.addContainerGap(506, Short.MAX_VALUE)
        					.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
        			.addGap(29)
        			.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        			.addGap(39))
        );
        gl_panelCreacionUsuario.setVerticalGroup(
        	gl_panelCreacionUsuario.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panelCreacionUsuario.createSequentialGroup()
        			.addGap(40)
        			.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.BASELINE)
        					.addComponent(lblTituloVentana)
        					.addComponent(lblFecha))
        				.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(14)
        			.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNombre)
        				.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblPeso)
        				.addComponent(spinnerPeso, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
        			.addGap(28)
        			.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblEmail)
        				.addComponent(lblAltura)
        				.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(spinnerAltura, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
        			.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panelCreacionUsuario.createSequentialGroup()
        					.addGap(24)
        					.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblContrasenia)
        						.addComponent(txtcontrasenia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(gl_panelCreacionUsuario.createSequentialGroup()
        					.addGap(34)
        					.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblFrecuenciaMax)
        						.addComponent(spinnerFrecMax, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))))
        			.addGap(18)
        			.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblFrecuenciaReposo)
        				.addComponent(spinnerFrecReposo, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
        			.addGroup(gl_panelCreacionUsuario.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
        			.addGap(43))
        );
        panelCreacionUsuario.setLayout(gl_panelCreacionUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(panelCreacionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCreacionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();setVisible(true);
    }
}
