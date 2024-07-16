package Grafica;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Logica.Carros;

public class AgregarCarro extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtKms;
    private JComboBox<String> comboBoxMarca;
    private JComboBox<String> comboBoxModelo;
    private JComboBox<String> comboBoxAño;
    private JComboBox<String> comboBoxTransmision;
    private JComboBox<String> comboBoxPrecio;
    private ArrayList<Carros> listaCarros = new ArrayList<>();

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
        
        // Panel superior
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        panel.setBounds(0, 0, 825, 141);
        contentPane.add(panel);
        
        // Componentes del panel superior
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
                Inicio inicio = new Inicio();
                inicio.setVisible(true);
            }
        });
        
        JLabel lblInventario = new JLabel("Inventario");
        lblInventario.setForeground(Color.WHITE);
        lblInventario.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
        lblInventario.setBounds(166, 111, 66, 21);
        panel.add(lblInventario);
        
        lblInventario.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                dispose();
                Inventario inventario = new Inventario();
                inventario.setVisible(true);
            }
        });
        
        JLabel lblAgregarCarro = new JLabel("Agregar carro");
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
                AplicarFinanciamniento aplicarFinanciamiento = new AplicarFinanciamniento();
                aplicarFinanciamiento.setVisible(true);
            }
        });
        
        JLabel lblCar1 = new JLabel("");
        lblCar1.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen19.png")); // Ajustar la ruta de la imagen según sea necesario
        lblCar1.setBounds(10, 30, 104, 71);
        panel.add(lblCar1);
        
        JLabel lblCar2 = new JLabel("");
        lblCar2.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen17.png")); // Ajustar la ruta de la imagen según sea necesario
        lblCar2.setBounds(650, 24, 150, 108);
        panel.add(lblCar2);
        
        JLabel lblPrincipal = new JLabel("Volver a la página principal");
        lblPrincipal.setForeground(Color.WHITE);
        lblPrincipal.setBounds(434, 64, 162, 13);
        panel.add(lblPrincipal);
        
        lblPrincipal.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                dispose();
                PrincipalVentas principalVentas = new PrincipalVentas();
                principalVentas.setVisible(true);
            }
        });
        
        // Panel de ingreso de datos del auto
        JLabel lblIngresarAuto = new JLabel("INGRESA LOS DATOS DEL AUTO");
        lblIngresarAuto.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 25));
        lblIngresarAuto.setBounds(186, 167, 448, 40);
        contentPane.add(lblIngresarAuto);
        
        comboBoxMarca = new JComboBox<>();
        comboBoxMarca.setModel(new DefaultComboBoxModel<>(new String[] {"Marca", "Acura", "BMW", "Chevrolet", "Hyundai", "Kia", "Mazda", "Mitsubishi", "Nissan", "Lexus", "Toyota"}));
        comboBoxMarca.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
        comboBoxMarca.setBounds(49, 261, 152, 21);
        contentPane.add(comboBoxMarca);
        
        comboBoxAño = new JComboBox<>();
        comboBoxAño.setModel(new DefaultComboBoxModel<>(new String[] {"Año", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000"}));
        comboBoxAño.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
        comboBoxAño.setBounds(454, 261, 152, 21);
        contentPane.add(comboBoxAño);
        
        comboBoxModelo = new JComboBox<>();
        comboBoxModelo.setModel(new DefaultComboBoxModel<>(new String[] {"Modelo"}));
        comboBoxModelo.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
        comboBoxModelo.setBounds(252, 261, 152, 21);
        contentPane.add(comboBoxModelo);
        
        comboBoxTransmision = new JComboBox<>();
        comboBoxTransmision.setModel(new DefaultComboBoxModel<>(new String[] {"Transmision", "Manual", "Automática", "Otro"}));
        comboBoxTransmision.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
        comboBoxTransmision.setBounds(49, 316, 152, 21);
        contentPane.add(comboBoxTransmision);
        
        txtKms = new JTextField();
        txtKms.setBounds(308, 316, 96, 19);
        contentPane.add(txtKms);
        txtKms.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Kms");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel.setBounds(252, 320, 45, 13);
        contentPane.add(lblNewLabel);
        
        JButton btnGuardar = new JButton("Guardar Datos");
        btnGuardar.setBackground(new Color(0, 128, 0));
        btnGuardar.setBounds(186, 405, 126, 31);
        contentPane.add(btnGuardar);
        
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarDatos();
            }
            
            private void guardarDatos() {
                try {
                    String kms = txtKms.getText();
                    String marca = (String) comboBoxMarca.getSelectedItem();
                    String modelo = (String) comboBoxModelo.getSelectedItem();
                    String año = (String) comboBoxAño.getSelectedItem();
                    String transmision = (String) comboBoxTransmision.getSelectedItem();
                    String precio = (String) comboBoxPrecio.getSelectedItem();
                    
                    if (kms.isEmpty() || marca.equals("Marca") || modelo.equals("Modelo") || año.equals("Año") || transmision.equals("Transmision") || precio.equals("Elegir precio")) {
                        throw new Exception("Por favor, complete todos los campos.");
                    }
                    
                    Carros carro = new Carros(marca, modelo, precio, transmision, año, kms);
                    listaCarros.add(carro);
                    
                    JOptionPane.showMessageDialog(AgregarCarro.this, "Información guardada correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    
                    // Limpiar campos después de guardar
                    comboBoxPrecio.setSelectedIndex(0);
                    txtKms.setText("");
                    comboBoxMarca.setSelectedIndex(0);
                    comboBoxModelo.setSelectedIndex(0);
                    comboBoxAño.setSelectedIndex(0);
                    comboBoxTransmision.setSelectedIndex(0);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(AgregarCarro.this, "Ingrese un precio válido.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(AgregarCarro.this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBackground(new Color(255, 102, 102));
        btnCancelar.setBounds(36, 405, 126, 31);
        contentPane.add(btnCancelar);
        
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                AgregarCarro agregarCarro = new AgregarCarro();
                agregarCarro.setVisible(true);
            }
        });
        
        JLabel lblPrecio = new JLabel("Precio");
        lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblPrecio.setBounds(455, 320, 45, 13);
        contentPane.add(lblPrecio);
        
        comboBoxPrecio = new JComboBox();
        comboBoxPrecio.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
        comboBoxPrecio.setModel(new DefaultComboBoxModel(new String[] {"Elegir precio", "$5,000", "$10,000", "$15,000", "$20,000", "$25,000", "$30,000", "$35,000", "$40,000", "$45,000", "$50,000", "$55,000", "$60,000", "$65,000", "$70,000", "$75,000", "$80,000", "$85,000", "$90,000", "$95,000", "$100,000"}));
        comboBoxPrecio.setBounds(508, 315, 126, 23);
        contentPane.add(comboBoxPrecio);
    }
}
