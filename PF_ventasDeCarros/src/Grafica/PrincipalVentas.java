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
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 857, 142);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPty = new JLabel("PTY");
		lblPty.setFont(new Font("Showcard Gothic", Font.PLAIN, 50));
		panel.add(lblPty);
		lblPty.setForeground(new Color(255, 0, 0));
		lblPty.setBounds(115, 39, 150, 53);
		
		JLabel lblCarCenter = new JLabel("car center");
		lblCarCenter.setFont(new Font("Magneto", Font.PLAIN, 35));
		lblCarCenter.setForeground(new Color(255, 0, 0));
		lblCarCenter.setBounds(219, 51, 228, 32);
		panel.add(lblCarCenter);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen7.png"));
		lblNewLabel_3.setBounds(11, 26, 104, 71);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen9.png"));
		lblNewLabel_4.setBounds(684, 26, 139, 93);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Los mejores en ventas de autos...");
		lblNewLabel_5.setBounds(125, 81, 248, 17);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("STXingkai", Font.PLAIN, 20));
		
		JLabel lblNewLabel = new JLabel("Inicio");
		lblNewLabel.setBounds(60, 111, 35, 21);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblNewLabel.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_1 = new JLabel("Inventario");
		lblNewLabel_1.setBounds(166, 111, 66, 21);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_2 = new JLabel("Agregar carro");
		lblNewLabel_2.setBounds(304, 111, 94, 21);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
	}
}
