package Grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AgregarCarro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtKms;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarCarro frame = new AgregarCarro();
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
	public AgregarCarro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 499);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 877, 141);
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
		lblAgregarCarro.setBackground(new Color(255, 255, 255));
		lblAgregarCarro.setForeground(new Color(0, 0, 255));
		lblAgregarCarro.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblAgregarCarro.setBounds(315, 111, 94, 21);
		panel.add(lblAgregarCarro);
		
		JLabel lblAplicar = new JLabel("Aplicar a financiamiento");
		lblAplicar.setForeground(Color.WHITE);
		lblAplicar.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblAplicar.setBounds(495, 112, 162, 19);
		panel.add(lblAplicar);
		lblAplicar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	  dispose(); 
     		     AplicarFinanciamniento AplicarFinanciamniento = new AplicarFinanciamniento();
     		     AplicarFinanciamniento.setVisible(true);
            }});
		
		JLabel lblCar1 = new JLabel("");
		lblCar1.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen19.png"));
		lblCar1.setBounds(10, 30, 104, 71);
		panel.add(lblCar1);
		
		JLabel lblCar2 = new JLabel("");
		lblCar2.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen17.png"));
		lblCar2.setBounds(650, 24, 150, 108);
		panel.add(lblCar2);
		
		JLabel lblPrincipal = new JLabel("Volver a la pagina principal");
		lblPrincipal.setForeground(Color.WHITE);
		lblPrincipal.setBounds(434, 64, 162, 13);
		panel.add(lblPrincipal);
	       lblPrincipal.addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent e) {
	            	  dispose(); 
	     		     PrincipalVentas PrincipalVentas = new PrincipalVentas();
	     		     PrincipalVentas.setVisible(true);
	            }});
		
		JLabel lblIngresarAuto = new JLabel("INGRESA LOS DATOS DEL AUTO");
		lblIngresarAuto.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 25));
		lblIngresarAuto.setBounds(186, 167, 448, 40);
		contentPane.add(lblIngresarAuto);
		
		JComboBox comboBoxMarca = new JComboBox();
		comboBoxMarca.setModel(new DefaultComboBoxModel(new String[] {"Marca", "Acura", "BMW", "Chevrolet", "Hyundai", "Kia", "Mazda", "Mitsubishi", "Nissan", "Lexus", "Toyota"}));
		comboBoxMarca.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		comboBoxMarca.setBounds(49, 261, 152, 21);
		contentPane.add(comboBoxMarca);
		
		JComboBox comboBoxMarca_1 = new JComboBox();
		comboBoxMarca_1.setModel(new DefaultComboBoxModel(new String[] {"Año ", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000"}));
		comboBoxMarca_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		comboBoxMarca_1.setBounds(454, 261, 152, 21);
		contentPane.add(comboBoxMarca_1);
		
		JComboBox comboBoxMarca_2 = new JComboBox();
		comboBoxMarca_2.setModel(new DefaultComboBoxModel(new String[] {"Modelo"}));
		comboBoxMarca_2.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		comboBoxMarca_2.setBounds(252, 261, 152, 21);
		contentPane.add(comboBoxMarca_2);
		
		JComboBox comboBoxMarca_3 = new JComboBox();
		comboBoxMarca_3.setModel(new DefaultComboBoxModel(new String[] {"Transmision ", "Manual", "Automática", "otro"}));
		comboBoxMarca_3.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		comboBoxMarca_3.setBounds(49, 316, 152, 21);
		contentPane.add(comboBoxMarca_3);
		
		txtKms = new JTextField();
		txtKms.setBounds(308, 316, 96, 19);
		contentPane.add(txtKms);
		txtKms.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Kms");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(252, 320, 45, 13);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Guardar Datos");
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setBounds(186, 405, 126, 31);
		contentPane.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(new Color(255, 102, 102));
		btnCancelar.setBounds(36, 405, 126, 31);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel_1 = new JLabel("Agregar imagen");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(472, 348, 108, 21);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Seleccionar");
		btnNewButton_1.setBounds(595, 410, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(224, 255, 255));
		lblNewLabel_2.setBounds(590, 311, 90, 90);
		contentPane.add(lblNewLabel_2);
	}
}
