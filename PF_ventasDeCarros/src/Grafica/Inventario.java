package Grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.ListaDeCarros;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class Inventario extends JFrame {
	private JTextArea textAreaDisponible;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventario frame = new Inventario();
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
	public Inventario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 662);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 808, 141);
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
		lblInventario.setForeground(new Color(0, 0, 255));
		lblInventario.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblInventario.setBounds(166, 111, 66, 21);
		panel.add(lblInventario);

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
		lblPrincipal.setForeground(new Color(255, 255, 255));
		lblPrincipal.setBounds(434, 64, 162, 13);
		panel.add(lblPrincipal);
		
		JLabel lblNewLabel_7 = new JLabel("Autos Disponibles");
		lblNewLabel_7.setBounds(187, 146, 434, 48);
		contentPane.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 40));
		
		JTextArea textAreaDisponible = new JTextArea();
		textAreaDisponible.setEditable(false);
		textAreaDisponible.setBounds(10, 204, 788, 411);
		contentPane.add(textAreaDisponible);
	       lblPrincipal.addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent e) {
	            	  dispose(); 
	     		     PrincipalVentas PrincipalVentas = new PrincipalVentas();
	     		     PrincipalVentas.setVisible(true);
	            }});
	}
	void mostrarCarros(ListaDeCarros listaDECarros) {
        System.out.println("Carros Disponibles: " + listaDECarros.obtenerCarrosDisponibles().size());

        StringBuilder sb = new StringBuilder();
        sb.append("Nombres de los Estudiantes:\n");

        for (String modelo : listaDECarros.obtenerCarrosDisponibles()) {
            sb.append(modelo).append("\n");
        }

        textAreaDisponible.setText(sb.toString());
    }
}
