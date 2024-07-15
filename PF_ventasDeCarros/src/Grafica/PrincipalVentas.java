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
		panel.setBounds(0, 0, 857, 124);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPty = new JLabel("PTY");
		lblPty.setFont(new Font("Showcard Gothic", Font.PLAIN, 50));
		panel.add(lblPty);
		lblPty.setForeground(new Color(255, 0, 0));
		lblPty.setBounds(111, 39, 150, 53);
		
		JLabel lblCarCenter = new JLabel("car center");
		lblCarCenter.setFont(new Font("Magneto", Font.PLAIN, 35));
		lblCarCenter.setForeground(new Color(255, 0, 0));
		lblCarCenter.setBounds(209, 51, 228, 32);
		panel.add(lblCarCenter);
		
		JMenu mnNewMenu = new JMenu("menú");
		mnNewMenu.setForeground(new Color(255, 255, 255));
		mnNewMenu.setBounds(35, 88, 115, 26);
		panel.add(mnNewMenu);
		
		JLabel lblNewLabel = new JLabel("Inicio");
		mnNewMenu.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Inventario");
		mnNewMenu.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Agregar carro");
		mnNewMenu.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
	}
}
