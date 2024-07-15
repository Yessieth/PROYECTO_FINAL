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
import java.awt.Canvas;
import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

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
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 872, 136);
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
		
		JLabel lblNewLabel_1 = new JLabel("Inventario");
		lblNewLabel_1.setBounds(166, 111, 66, 21);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_2 = new JLabel("Agregar carro");
		lblNewLabel_2.setBounds(315, 111, 94, 21);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		
		JLabel lblNewLabel_6 = new JLabel("Aplicar a financiamiento");
		lblNewLabel_6.setBounds(495, 112, 162, 19);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblNewLabel_6.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(10, 30, 104, 71);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen19.png"));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(667, 24, 150, 108);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen17.png"));
		
		JLabel lblNewLabel_7 = new JLabel("El auto que necesitas");
		lblNewLabel_7.setBounds(186, 146, 510, 48);
		lblNewLabel_7.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 40));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(10, 146, 183, 161);
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen12.png"));
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_7_1 = new JLabel("al mejor precio");
		lblNewLabel_7_1.setBounds(244, 202, 367, 48);
		lblNewLabel_7_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 40));
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("");
		lblNewLabel_8_1.setBounds(653, 146, 192, 161);
		lblNewLabel_8_1.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen13.png"));
		contentPane.add(lblNewLabel_8_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 312, 872, 259);
		panel_1.setBackground(new Color(255, 0, 0));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("BUSCA EL AUTO QUE SUEÑAS");
		lblNewLabel_9.setBounds(233, 10, 407, 39);
		lblNewLabel_9.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 25));
		lblNewLabel_9.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_9);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(240, 78, 152, 21);
		comboBox.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Marca", "Acura", "BMW", "Chevrolet", "Hyundai", "Kia", "Mazda", "Mitsubishi", "Nissan", "Lexus", "Toyota"}));
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(44, 78, 152, 21);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Tipo", "Sedán", "Suv", "Pickup", "Hacktback", "Panel"}));
		comboBox_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(446, 78, 152, 21);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Precio desde ", "$5,000", "$10,000", "$15,000", "$20,000", "$25,000", "$30,000", "$35,000", "$40,000", "$45,000", "$50,000"}));
		comboBox_2.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		panel_1.add(comboBox_2);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setBounds(653, 78, 152, 21);
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] {"Precio hasta", "$5,000", "$10,000", "$15,000", "$20,000", "$25,000", "$30,000", "$35,000", "$40,000", "$45,000", "$50,000", "$55,000", "$60,000", "$65,000", "$70,000", "$75,000", "$80,000", "$85,000", "$90,000", "$95,000", "$100,000"}));
		comboBox_2_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		panel_1.add(comboBox_2_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(183, 141, 152, 21);
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Año desde ", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990"}));
		comboBox_1_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		panel_1.add(comboBox_1_1);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setBounds(520, 141, 152, 21);
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"Año hasta", "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990"}));
		comboBox_1_1_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		panel_1.add(comboBox_1_1_1);
		
		JButton btnNewButton = new JButton("BUSCAR");
		btnNewButton.setBounds(364, 200, 121, 26);
		btnNewButton.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
		panel_1.add(btnNewButton);
	}
}
