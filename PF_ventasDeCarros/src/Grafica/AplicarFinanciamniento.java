package Grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;

public class AplicarFinanciamniento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldCorreo;
	private JTextField textFieldCedula;
	private JTextField textFieldTelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplicarFinanciamniento frame = new AplicarFinanciamniento();
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
	public AplicarFinanciamniento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 821, 655);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 807, 141);
		contentPane.add(panel);
		
		JLabel lblPty = new JLabel("PTY");
		lblPty.setForeground(Color.RED);
		lblPty.setFont(new Font("Showcard Gothic", Font.PLAIN, 50));
		lblPty.setBounds(115, 39, 150, 53);
		panel.add(lblPty);
		
		JLabel lblCarCenter = new JLabel("car center");
		lblCarCenter.setForeground(Color.RED);
		lblCarCenter.setFont(new Font("Magneto", Font.PLAIN, 35));
		lblCarCenter.setBounds(219, 51, 228, 32);
		panel.add(lblCarCenter);
		
		JLabel lblSlogan = new JLabel("Los mejores en ventas de autos...");
		lblSlogan.setForeground(Color.WHITE);
		lblSlogan.setFont(new Font("STXingkai", Font.PLAIN, 20));
		lblSlogan.setBounds(125, 81, 248, 17);
		panel.add(lblSlogan);
		
		JLabel lblInicio = new JLabel("Inicio");
		lblInicio.setForeground(Color.WHITE);
		lblInicio.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblInicio.setBounds(60, 111, 35, 21);
		panel.add(lblInicio);
	       lblInicio.addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent e) {
	            	  dispose(); 
	     		     Inicio Inicio = new Inicio();
	     		     Inicio.setVisible(true);
	            }});
		
		JLabel lblInventario = new JLabel("Inventario");
		lblInventario.setForeground(Color.WHITE);
		lblInventario.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblInventario.setBounds(166, 111, 66, 21);
		panel.add(lblInventario);
		 lblInventario.addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent e) {
	            	  dispose(); 
	     		     Inventario Inventario = new Inventario();
	     		     Inventario.setVisible(true);
	            }});
		
		JLabel lblAgregarCarro = new JLabel("Agregar carro");
		lblAgregarCarro.setForeground(Color.WHITE);
		lblAgregarCarro.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblAgregarCarro.setBounds(315, 111, 94, 21);
		panel.add(lblAgregarCarro);
		 lblAgregarCarro.addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent e) {
	            	  dispose(); 
	     		     AgregarCarro AgregarCarro = new AgregarCarro();
	     		     AgregarCarro.setVisible(true);
	            }});
		
		JLabel lblAplicar = new JLabel("Aplicar a financiamiento");
		lblAplicar.setForeground(new Color(0, 0, 255));
		lblAplicar.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblAplicar.setBounds(495, 112, 162, 19);
		panel.add(lblAplicar);
		
		JLabel lblCar1 = new JLabel("");
		lblCar1.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen19.png"));
		lblCar1.setBounds(10, 30, 104, 71);
		panel.add(lblCar1);
		
		JLabel lblCar2 = new JLabel("");
		lblCar2.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen17.png"));
		lblCar2.setBounds(647, 24, 150, 108);
		panel.add(lblCar2);
		
		JLabel lblPrincipal = new JLabel("Volver a la pagina principal");
		lblPrincipal.setForeground(Color.WHITE);
		lblPrincipal.setBounds(433, 64, 178, 13);
		panel.add(lblPrincipal);
	       lblPrincipal.addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent e) {
	            	  dispose(); 
	     		     PrincipalVentas PrincipalVentas = new PrincipalVentas();
	     		     PrincipalVentas.setVisible(true);
	            }});
		
		JLabel lblNewLabel = new JLabel("Datos Personales");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 25));
		lblNewLabel.setBounds(25, 156, 263, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(25, 234, 67, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido:");
		lblNewLabel_1_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(25, 298, 67, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Correo electronico:");
		lblNewLabel_1_2.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(369, 234, 135, 21);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Cédula:");
		lblNewLabel_1_3.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(369, 298, 55, 21);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Télefono:");
		lblNewLabel_1_4.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(580, 298, 67, 21);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblInformacinDeIngresos = new JLabel("Información de ingresos");
		lblInformacinDeIngresos.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 25));
		lblInformacinDeIngresos.setBounds(25, 357, 385, 55);
		contentPane.add(lblInformacinDeIngresos);
		
		JComboBox comboBoxMarca = new JComboBox();
		comboBoxMarca.setModel(new DefaultComboBoxModel(new String[] {"Tipo de financiamiento", "Asalariado", "Independiente", "Servidor Publico", "Extranjero"}));
		comboBoxMarca.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		comboBoxMarca.setBounds(25, 434, 187, 27);
		contentPane.add(comboBoxMarca);
		
		JComboBox comboBoxMarca_2 = new JComboBox();
		comboBoxMarca_2.setModel(new DefaultComboBoxModel(new String[] {"Rango de salario", "Entre $200 y $299", "Entre $300 y $399", "Entre $400 y $499", "Entre $500 y $599", "Entre $600 y $699", "Entre $700 y $799", "Entre $800 y $899", "Entre $900 y $999", "Más de $1 000"}));
		comboBoxMarca_2.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		comboBoxMarca_2.setBounds(244, 434, 201, 27);
		contentPane.add(comboBoxMarca_2);
		
		JComboBox comboBoxMarca_3 = new JComboBox();
		comboBoxMarca_3.setModel(new DefaultComboBoxModel(new String[] {"Continuidad Laboral", "Más de un año laborando", "Menos de un año laborando"}));
		comboBoxMarca_3.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		comboBoxMarca_3.setBounds(142, 486, 201, 27);
		contentPane.add(comboBoxMarca_3);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.setBounds(471, 452, 85, 21);
		contentPane.add(btnValidar);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(91, 237, 225, 19);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(91, 301, 225, 19);
		contentPane.add(textFieldApellido);
		
		textFieldCorreo = new JTextField();
		textFieldCorreo.setColumns(10);
		textFieldCorreo.setBounds(503, 237, 225, 19);
		contentPane.add(textFieldCorreo);
		
		textFieldCedula = new JTextField();
		textFieldCedula.setColumns(10);
		textFieldCedula.setBounds(424, 301, 135, 19);
		contentPane.add(textFieldCedula);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setColumns(10);
		textFieldTelefono.setBounds(645, 301, 124, 19);
		contentPane.add(textFieldTelefono);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(471, 491, 85, 21);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      // Cierra la ventana actual
		 			    dispose(); 
		     AplicarFinanciamniento AplicarFinanciamniento = new AplicarFinanciamniento();
		     AplicarFinanciamniento.setVisible(true);
		}});
		contentPane.add(btnCancelar);
	}
}
