package Grafica;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SpringLayout;

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
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout springLayout = new SpringLayout();
		contentPane.setLayout(springLayout);
		
		JLabel lblUniversidad = new JLabel("UNIVERSIDAD TECNOLÓGICA DE PANAMÁ\r\n");
		springLayout.putConstraint(SpringLayout.NORTH, lblUniversidad, 33, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, lblUniversidad, 249, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.SOUTH, lblUniversidad, 67, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.EAST, lblUniversidad, 646, SpringLayout.WEST, contentPane);
		lblUniversidad.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		contentPane.add(lblUniversidad);
		
		JButton btnMostrarPagina = new JButton("Mostrar Página de Ventas");
		springLayout.putConstraint(SpringLayout.NORTH, btnMostrarPagina, 520, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, btnMostrarPagina, 633, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.EAST, btnMostrarPagina, 822, SpringLayout.WEST, contentPane);
		btnMostrarPagina.setBackground(new Color(255, 153, 204));
		btnMostrarPagina.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		btnMostrarPagina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      // Cierra la ventana actual
		 			    dispose(); 
		     PrincipalVentas PrincipalVentas = new PrincipalVentas();
		     PrincipalVentas.setVisible(true);
		}});
		contentPane.add(btnMostrarPagina);
		
		JLabel lblFacultad = new JLabel("FACULTAD DE INGENIERÍA DE SISTEMAS COMPUTACIONALES\r\n");
		springLayout.putConstraint(SpringLayout.NORTH, lblFacultad, 58, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, lblFacultad, 166, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.SOUTH, lblFacultad, 92, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.EAST, lblFacultad, 733, SpringLayout.WEST, contentPane);
		lblFacultad.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		contentPane.add(lblFacultad);
		
		JLabel lblCarrera = new JLabel("LICENCIATURA EN INGENIERÍA DE SOFTWARE\r\n");
		springLayout.putConstraint(SpringLayout.NORTH, lblCarrera, 84, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, lblCarrera, 232, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.SOUTH, lblCarrera, 118, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.EAST, lblCarrera, 662, SpringLayout.WEST, contentPane);
		lblCarrera.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		contentPane.add(lblCarrera);
		
		JLabel lblGrupo = new JLabel("Grupo: 1SF121");
		springLayout.putConstraint(SpringLayout.NORTH, lblGrupo, 144, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, lblGrupo, 375, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.SOUTH, lblGrupo, 186, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.EAST, lblGrupo, 523, SpringLayout.WEST, contentPane);
		lblGrupo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		contentPane.add(lblGrupo);
		
		JLabel lblIntegrantes = new JLabel("Integrantes:");
		springLayout.putConstraint(SpringLayout.NORTH, lblIntegrantes, 196, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, lblIntegrantes, 385, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.SOUTH, lblIntegrantes, 223, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.EAST, lblIntegrantes, 508, SpringLayout.WEST, contentPane);
		lblIntegrantes.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		contentPane.add(lblIntegrantes);
		
		JLabel lblNombre1 = new JLabel("Cuevas, Yessica 8-1002-794  ");
		springLayout.putConstraint(SpringLayout.NORTH, lblNombre1, 233, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, lblNombre1, 307, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNombre1, 260, SpringLayout.NORTH, contentPane);
		lblNombre1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		contentPane.add(lblNombre1);
		
		JLabel lblNombre2 = new JLabel("Ortega, Abilio 8-999-1670");
		springLayout.putConstraint(SpringLayout.NORTH, lblNombre2, 258, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, lblNombre2, 317, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNombre2, 285, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.EAST, lblNombre2, 582, SpringLayout.WEST, contentPane);
		lblNombre2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		contentPane.add(lblNombre2);
		
		JLabel lblProfesor = new JLabel("Profesor: ");
		springLayout.putConstraint(SpringLayout.NORTH, lblProfesor, 321, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, lblProfesor, 399, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.SOUTH, lblProfesor, 342, SpringLayout.NORTH, contentPane);
		lblProfesor.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		contentPane.add(lblProfesor);
		
		JLabel lblNombreProfesor = new JLabel("Rodrigo Yángüez");
		springLayout.putConstraint(SpringLayout.NORTH, lblNombreProfesor, 352, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, lblNombreProfesor, 358, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNombreProfesor, 379, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.EAST, lblNombreProfesor, 526, SpringLayout.WEST, contentPane);
		lblNombreProfesor.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		contentPane.add(lblNombreProfesor);
		
		JLabel lblFecha = new JLabel("Fecha:");
		springLayout.putConstraint(SpringLayout.NORTH, lblFecha, 401, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, lblFecha, 409, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.SOUTH, lblFecha, 416, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.EAST, lblFecha, 481, SpringLayout.WEST, contentPane);
		lblFecha.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		contentPane.add(lblFecha);
		
		JLabel lblFecha1 = new JLabel("17/08/2024");
		springLayout.putConstraint(SpringLayout.NORTH, lblFecha1, 432, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, lblFecha1, 375, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.SOUTH, lblFecha1, 453, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.EAST, lblFecha1, 508, SpringLayout.WEST, contentPane);
		lblFecha1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		contentPane.add(lblFecha1);
		
		JButton btnSalir = new JButton("Salir");
		springLayout.putConstraint(SpringLayout.NORTH, btnSalir, 523, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, btnSalir, 37, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.SOUTH, btnSalir, 547, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.EAST, btnSalir, 130, SpringLayout.WEST, contentPane);
		btnSalir.setBackground(new Color(153, 204, 153));
		btnSalir.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		btnSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(contentPane, "Hasta pronto!!", "Salir", JOptionPane.INFORMATION_MESSAGE);
						dispose();
					}
					});
							contentPane.add(btnSalir);
		
		JLabel lblUTP = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblUTP, 0, SpringLayout.NORTH, lblUniversidad);
		springLayout.putConstraint(SpringLayout.WEST, lblUTP, 67, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.SOUTH, lblUTP, 126, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.EAST, lblUTP, -12, SpringLayout.WEST, lblFacultad);
		lblUTP.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen7.png"));
		contentPane.add(lblUTP);
		
		JLabel lblFISC = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblFISC, 21, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, lblFISC, 740, SpringLayout.WEST, contentPane);
		springLayout.putConstraint(SpringLayout.SOUTH, lblFISC, 130, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.EAST, lblFISC, 834, SpringLayout.WEST, contentPane);
		lblFISC.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen9.png"));
		contentPane.add(lblFISC);
	}
}
