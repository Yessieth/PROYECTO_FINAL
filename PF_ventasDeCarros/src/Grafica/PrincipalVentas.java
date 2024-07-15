package Grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.Box;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JEditorPane;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

import java.awt.Canvas;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.SystemColor;

public class PrincipalVentas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalVentas frame = new PrincipalVentas();
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
	public PrincipalVentas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 871, 675);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 877, 141);
		panel.setBackground(new Color(0, 0, 0));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPty = new JLabel("PTY");
		lblPty.setBounds(115, 39, 150, 53);
		lblPty.setFont(new Font("Showcard Gothic", Font.PLAIN, 50));
		panel.add(lblPty);
		lblPty.setForeground(new Color(255, 0, 0));
		
		JLabel lblCarCenter = new JLabel("car center");
		lblCarCenter.setBounds(219, 51, 228, 32);
		lblCarCenter.setFont(new Font("Magneto", Font.PLAIN, 35));
		lblCarCenter.setForeground(new Color(255, 0, 0));
		panel.add(lblCarCenter);
		
		JLabel lblSlogan = new JLabel("Los mejores en ventas de autos...");
		lblSlogan.setBounds(125, 81, 248, 17);
		panel.add(lblSlogan);
		lblSlogan.setForeground(Color.WHITE);
		lblSlogan.setFont(new Font("STXingkai", Font.PLAIN, 20));
		
		JLabel lblInicio = new JLabel("Inicio");
		lblInicio.setBounds(60, 111, 35, 21);
		panel.add(lblInicio);
		lblInicio.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblInicio.setForeground(Color.WHITE);
	       lblInicio.addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent e) {
	            	  dispose(); 
	     		     Inicio Inicio = new Inicio();
	     		     Inicio.setVisible(true);
	            }});
	       
		JLabel lblInventario = new JLabel("Inventario");
		lblInventario.setBounds(166, 111, 66, 21);
		panel.add(lblInventario);
		lblInventario.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblInventario.setForeground(Color.WHITE);
	       lblInventario.addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent e) {
	            	  dispose(); 
	     		     Inventario Inventario = new Inventario();
	     		     Inventario.setVisible(true);
	            }});
		
		JLabel lblAgregarCarro = new JLabel("Agregar carro");
		lblAgregarCarro.setBounds(315, 111, 94, 21);
		panel.add(lblAgregarCarro);
		lblAgregarCarro.setForeground(Color.WHITE);
		lblAgregarCarro.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
	       lblAgregarCarro.addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent e) {
	            	  dispose(); 
	     		     AgregarCarro AgregarCarro = new AgregarCarro();
	     		     AgregarCarro.setVisible(true);
	            }});
		
		JLabel lblAplicar = new JLabel("Aplicar a financiamiento");
		lblAplicar.setBounds(495, 112, 162, 19);
		panel.add(lblAplicar);
		lblAplicar.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblAplicar.setForeground(Color.WHITE);
	       lblAplicar.addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent e) {
	            	  dispose(); 
	     		     AplicarFinanciamniento AplicarFinanciamniento = new AplicarFinanciamniento();
	     		     AplicarFinanciamniento.setVisible(true);
	            }});
		
		JLabel lblCar1 = new JLabel("");
		lblCar1.setBounds(10, 30, 104, 71);
		panel.add(lblCar1);
		lblCar1.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen19.png"));
		
		JLabel lblCar2 = new JLabel("");
		lblCar2.setBounds(667, 24, 150, 108);
		panel.add(lblCar2);
		lblCar2.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen17.png"));
		
		JLabel lblNewLabel_7 = new JLabel("El auto que necesitas");
		lblNewLabel_7.setBounds(186, 146, 510, 48);
		lblNewLabel_7.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 40));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblimage1 = new JLabel("");
		lblimage1.setBounds(10, 146, 183, 161);
		lblimage1.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen12.png"));
		contentPane.add(lblimage1);
		
		JLabel lblNewLabel_7_1 = new JLabel("al mejor precio");
		lblNewLabel_7_1.setBounds(244, 202, 367, 48);
		lblNewLabel_7_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 40));
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblimage2 = new JLabel("");
		lblimage2.setBounds(653, 146, 192, 161);
		lblimage2.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen13.png"));
		contentPane.add(lblimage2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 312, 877, 259);
		panel_1.setBackground(new Color(25, 25, 112));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("BUSCA EL AUTO QUE SUEÑAS");
		lblNewLabel_9.setBounds(233, 10, 407, 39);
		lblNewLabel_9.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 25));
		lblNewLabel_9.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_9);
		
		JComboBox comboBoxMarca = new JComboBox();
		comboBoxMarca.setBounds(337, 78, 152, 21);
		comboBoxMarca.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		comboBoxMarca.setModel(new DefaultComboBoxModel(new String[] {"Marca", "Acura", "BMW", "Chevrolet", "Hyundai", "Kia", "Mazda", "Mitsubishi", "Nissan", "Lexus", "Toyota"}));
		panel_1.add(comboBoxMarca);
		
		JComboBox comboBox_Tipo = new JComboBox();
		comboBox_Tipo.setBounds(141, 78, 152, 21);
		comboBox_Tipo.setModel(new DefaultComboBoxModel(new String[] {"Tipo", "Sedán", "Suv", "Pickup", "Hacktback", "Panel"}));
		comboBox_Tipo.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		panel_1.add(comboBox_Tipo);
		
		JComboBox comboBoxPrecioDesde = new JComboBox();
		comboBoxPrecioDesde.setBounds(44, 141, 152, 21);
		comboBoxPrecioDesde.setModel(new DefaultComboBoxModel(new String[] {"Precio desde ", "$5,000", "$10,000", "$15,000", "$20,000", "$25,000", "$30,000", "$35,000", "$40,000", "$45,000", "$50,000"}));
		comboBoxPrecioDesde.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		panel_1.add(comboBoxPrecioDesde);
		
		JComboBox comboBoxPrecioHasta = new JComboBox();
		comboBoxPrecioHasta.setBounds(240, 141, 152, 21);
		comboBoxPrecioHasta.setModel(new DefaultComboBoxModel(new String[] {"Precio hasta", "$5,000", "$10,000", "$15,000", "$20,000", "$25,000", "$30,000", "$35,000", "$40,000", "$45,000", "$50,000", "$55,000", "$60,000", "$65,000", "$70,000", "$75,000", "$80,000", "$85,000", "$90,000", "$95,000", "$100,000"}));
		comboBoxPrecioHasta.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		panel_1.add(comboBoxPrecioHasta);
		
		JComboBox comboBoxAñoDesde = new JComboBox();
		comboBoxAñoDesde.setBounds(446, 141, 152, 21);
		comboBoxAñoDesde.setModel(new DefaultComboBoxModel(new String[] {"Año desde ", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000"}));
		comboBoxAñoDesde.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		panel_1.add(comboBoxAñoDesde);
		
		JComboBox comboBoxAñoHasta = new JComboBox();
		comboBoxAñoHasta.setBounds(653, 141, 152, 21);
		comboBoxAñoHasta.setModel(new DefaultComboBoxModel(new String[] {"Año hasta", "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000"}));
		comboBoxAñoHasta.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		panel_1.add(comboBoxAñoHasta);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(364, 200, 121, 26);
		btnBuscar.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
		panel_1.add(btnBuscar);
		
		JComboBox comboBoxMarca_1 = new JComboBox();
		comboBoxMarca_1.setModel(new DefaultComboBoxModel(new String[] {"Modelo"}));
		comboBoxMarca_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		comboBoxMarca_1.setBounds(545, 78, 152, 21);
		panel_1.add(comboBoxMarca_1);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
		btnSalir.setBounds(10, 574, 121, 26);
		contentPane.add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "Hasta pronto!!", "Salir", JOptionPane.INFORMATION_MESSAGE);
					dispose();
				}
				});
						contentPane.add(btnSalir);
	
	}
}
