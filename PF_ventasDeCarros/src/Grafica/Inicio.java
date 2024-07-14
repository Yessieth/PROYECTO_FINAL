package Grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUniversidad = new JLabel("UNIVERSIDAD TECNOLÓGICA DE PANAMÁ\r\n");
		lblUniversidad.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblUniversidad.setBounds(249, 33, 397, 34);
		contentPane.add(lblUniversidad);
		
		JButton btnMostrarPagina = new JButton("Mostrar Página de Ventas");
		btnMostrarPagina.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		btnMostrarPagina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMostrarPagina.setBounds(639, 520, 183, 27);
		contentPane.add(btnMostrarPagina);
		
		JLabel lblFacultad = new JLabel("FACULTAD DE INGENIERÍA DE SISTEMAS COMPUTACIONALES\r\n");
		lblFacultad.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblFacultad.setBounds(166, 58, 567, 34);
		contentPane.add(lblFacultad);
		
		JLabel lblCarrera = new JLabel("LICENCIATURA EN INGENIERÍA DE SOFTWARE\r\n");
		lblCarrera.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblCarrera.setBounds(232, 84, 430, 34);
		contentPane.add(lblCarrera);
		
		JLabel lblGrupo = new JLabel("Grupo: 1SF121");
		lblGrupo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblGrupo.setBounds(375, 144, 148, 42);
		contentPane.add(lblGrupo);
		
		JLabel lblIntegrantes = new JLabel("Integrantes:");
		lblIntegrantes.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblIntegrantes.setBounds(385, 202, 123, 21);
		contentPane.add(lblIntegrantes);
		
		JLabel lblNombre1 = new JLabel("Cuevas, Yessica 8-1002-794  ");
		lblNombre1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNombre1.setBounds(307, 233, 278, 27);
		contentPane.add(lblNombre1);
		
		JLabel lblNombre2 = new JLabel("Ortega, Abilio 8-999-1670");
		lblNombre2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNombre2.setBounds(317, 258, 265, 27);
		contentPane.add(lblNombre2);
		
		JLabel lblProfesor = new JLabel("Profesor: ");
		lblProfesor.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblProfesor.setBounds(399, 321, 93, 21);
		contentPane.add(lblProfesor);
		
		JLabel lblNombreProfesor = new JLabel("Rodrigo Yángüez");
		lblNombreProfesor.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNombreProfesor.setBounds(358, 352, 168, 21);
		contentPane.add(lblNombreProfesor);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblFecha.setBounds(409, 401, 72, 15);
		contentPane.add(lblFecha);
		
		JLabel lblFecha1 = new JLabel("17/08/2024");
		lblFecha1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblFecha1.setBounds(375, 432, 133, 21);
		contentPane.add(lblFecha1);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		btnSalir.setBounds(37, 523, 93, 24);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(55, 173, 133, 87);
		contentPane.add(lblNewLabel);
	}
}
