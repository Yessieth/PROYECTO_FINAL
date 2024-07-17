package Grafica;

import Logica.Cliente;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

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
		setBounds(100, 100, 994, 743);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 985, 141);
		contentPane.add(panel);
		
		JLabel lblPty = new JLabel("PTY");
		lblPty.setForeground(Color.RED);
		lblPty.setFont(new Font("Showcard Gothic", Font.PLAIN, 50));
		lblPty.setBounds(153, 39, 150, 53);
		panel.add(lblPty);
		
		JLabel lblCarCenter = new JLabel("car center");
		lblCarCenter.setForeground(Color.RED);
		lblCarCenter.setFont(new Font("Magneto", Font.PLAIN, 35));
		lblCarCenter.setBounds(256, 51, 228, 32);
		panel.add(lblCarCenter);
		
		JLabel lblSlogan = new JLabel("Los mejores en ventas de autos...");
		lblSlogan.setForeground(Color.WHITE);
		lblSlogan.setFont(new Font("STXingkai", Font.PLAIN, 20));
		lblSlogan.setBounds(178, 81, 248, 17);
		panel.add(lblSlogan);
		
		JLabel lblInicio = new JLabel("Inicio");
		lblInicio.setForeground(Color.WHITE);
		lblInicio.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblInicio.setBounds(108, 111, 35, 21);
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
		lblInventario.setBounds(378, 111, 66, 21);
		panel.add(lblInventario);
		 lblInventario.addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent e) {
	            	  dispose(); 
	     		     Inventario Inventario = new Inventario();
	     		     Inventario.setVisible(true);
	            }});
		

		JLabel lblAplicar = new JLabel("Aplicar a financiamiento");
		lblAplicar.setForeground(new Color(0, 0, 255));
		lblAplicar.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblAplicar.setBounds(650, 112, 162, 19);
		panel.add(lblAplicar);
		
		JLabel lblCar1 = new JLabel("");
		lblCar1.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen19.png"));
		lblCar1.setBounds(39, 30, 104, 71);
		panel.add(lblCar1);
		
		JLabel lblCar2 = new JLabel("");
		lblCar2.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen17.png"));
		lblCar2.setBounds(822, 24, 150, 108);
		panel.add(lblCar2);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.setBackground(new Color(60, 179, 113));
		btnValidar.setFont(new Font("Arial Unicode MS", Font.BOLD, 20));
		btnValidar.setBounds(668, 432, 152, 50);
		contentPane.add(btnValidar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(new Color(255, 99, 71));
		btnCancelar.setFont(new Font("Arial Unicode MS", Font.BOLD, 20));
		btnCancelar.setBounds(668, 549, 152, 50);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      // Cierra la ventana actual
		      dispose(); 
		      AplicarFinanciamniento aplicarFinanciamiento = new AplicarFinanciamniento();
		      aplicarFinanciamiento.setVisible(true);
		}});
		contentPane.add(btnCancelar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 196, 222));
		panel_1.setBounds(25, 161, 917, 203);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Datos Personales");
		lblNewLabel.setBounds(329, 5, 258, 30);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 25));
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(112, 74, 225, 19);
		panel_1.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(35, 71, 67, 21);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(112, 140, 225, 19);
		panel_1.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido:");
		lblNewLabel_1_1.setBounds(35, 137, 67, 21);
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1_2 = new JLabel("Correo electronico:");
		lblNewLabel_1_2.setBounds(474, 71, 135, 21);
		panel_1.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		
		textFieldCorreo = new JTextField();
		textFieldCorreo.setBounds(619, 74, 225, 19);
		panel_1.add(textFieldCorreo);
		textFieldCorreo.setColumns(10);
		
		JLabel lblNewLabel_1_4 = new JLabel("Télefono:");
		lblNewLabel_1_4.setBounds(542, 110, 67, 21);
		panel_1.add(lblNewLabel_1_4);
		lblNewLabel_1_4.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setBounds(619, 113, 225, 19);
		panel_1.add(textFieldTelefono);
		textFieldTelefono.setColumns(10);
		
		JLabel lblNewLabel_1_3 = new JLabel("Cédula:");
		lblNewLabel_1_3.setBounds(554, 154, 55, 21);
		panel_1.add(lblNewLabel_1_3);
		lblNewLabel_1_3.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		
		textFieldCedula = new JTextField();
		textFieldCedula.setBounds(619, 157, 135, 19);
		panel_1.add(textFieldCedula);
		textFieldCedula.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(176, 196, 222));
		panel_2.setBounds(53, 394, 472, 269);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblInformacinDeIngresos = new JLabel("Información de ingresos");
		lblInformacinDeIngresos.setBounds(50, 10, 369, 30);
		panel_2.add(lblInformacinDeIngresos);
		lblInformacinDeIngresos.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 25));
		
		JComboBox<String> comboBoxFinanciamiento = new JComboBox<>();
		comboBoxFinanciamiento.setBounds(135, 63, 201, 27);
		panel_2.add(comboBoxFinanciamiento);
		comboBoxFinanciamiento.setModel(new DefaultComboBoxModel<>(new String[] {"Tipo de financiamiento", "Asalariado", "Independiente", "Servidor Publico", "Extranjero"}));
		comboBoxFinanciamiento.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		
		JComboBox<String> comboBoxSalario = new JComboBox<>();
		comboBoxSalario.setBounds(135, 196, 201, 27);
		panel_2.add(comboBoxSalario);
		comboBoxSalario.setModel(new DefaultComboBoxModel<>(new String[] {"Rango de salario", "Entre $200 y $299", "Entre $300 y $399", "Entre $400 y $499", "Entre $500 y $599", "Entre $600 y $699", "Entre $700 y $799", "Entre $800 y $899", "Entre $900 y $999", "Más de $1 000"}));
		comboBoxSalario.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		
		JComboBox<String> comboBoxContinuidad = new JComboBox<>();
		comboBoxContinuidad.setBounds(135, 129, 201, 27);
		panel_2.add(comboBoxContinuidad);
		comboBoxContinuidad.setModel(new DefaultComboBoxModel<>(new String[] {"Continuidad Laboral", "Más de un año laborando", "Menos de un año laborando"}));
		comboBoxContinuidad.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Obtener los valores ingresados
				String nombre = textFieldNombre.getText();
				String apellido = textFieldApellido.getText();
				String correo = textFieldCorreo.getText();
				String cedula = textFieldCedula.getText();
				String telefono = textFieldTelefono.getText();
				String tipoFinanciamiento = comboBoxFinanciamiento.getSelectedItem().toString();
				String salario = comboBoxSalario.getSelectedItem().toString();
				String continuidad = comboBoxContinuidad.getSelectedItem().toString();
				
				// Validar los valores
				if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || cedula.isEmpty() || telefono.isEmpty() ||
					tipoFinanciamiento.equals("Tipo de financiamiento") || salario.equals("Rango de salario") || continuidad.equals("Continuidad Laboral")) {
					JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
					return;
				}
				
				// Crear un objeto Cliente
				Cliente cliente = new Cliente(nombre, apellido, correo, cedula, telefono, tipoFinanciamiento, salario, continuidad);
				
				// Calcular si el cliente puede aplicar
				boolean puedeAplicar = cliente.puedeAplicar();
				
				// Mostrar el resultado
				if (puedeAplicar) {
					JOptionPane.showMessageDialog(null, "¡El cliente " + cliente.getNombre()+" " + cliente.getApellido() + " con cédula " + cliente.getCedula() + " puede aplicar al financiamiento!");
				} else {
					JOptionPane.showMessageDialog(null, "                                                               Lo sentimos!! \nEl cliente " + cliente.getNombre()+" " + cliente.getApellido() + " con cédula " + cliente.getCedula() + " no cumple con los requisitos para aplicar al financiamiento.");
				}
			}
		});
	}
}
