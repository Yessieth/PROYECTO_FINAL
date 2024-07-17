package Grafica;

//paquetes importados 
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Logica.Carros;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Inventario extends JFrame {

    private JPanel contentPane;
    private JTable table;
    private JTextField textFieldBMarca;
    private JTextField textFieldBModelo;
    private List<Carros> listaDeCarros = new ArrayList<>();

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
        // Inicializar inventario con algunos datos
        listaDeCarros.add(new Carros("Toyota", "Corolla", 2023, 25000.0, "Rojo"));
        listaDeCarros.add(new Carros("Honda", "Civic", 2022, 20000.0, "Azul"));
        listaDeCarros.add(new Carros("Ford", "Mustang", 2024, 40000.0, "Negro"));
        listaDeCarros.add(new Carros("Chevrolet", "Camaro", 2023, 35000.0, "Blanco"));
        listaDeCarros.add(new Carros("Nissan", "Sentra", 2022, 18000.0, "Plata"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1028, 781);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(100, 149, 237));
        contentPane.setBorder(null);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1014, 141);
        panel.setBackground(Color.BLACK);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblPty = new JLabel("PTY");
        lblPty.setBounds(115, 39, 150, 53);
        lblPty.setFont(new Font("Showcard Gothic", Font.PLAIN, 50));
        lblPty.setForeground(Color.RED);
        panel.add(lblPty);

        JLabel lblCarCenter = new JLabel("car center");
        lblCarCenter.setBounds(219, 51, 228, 32);
        lblCarCenter.setFont(new Font("Magneto", Font.PLAIN, 35));
        lblCarCenter.setForeground(Color.RED);
        panel.add(lblCarCenter);

        JLabel lblSlogan = new JLabel("Los mejores en ventas de autos...");
        lblSlogan.setBounds(125, 81, 248, 17);
        lblSlogan.setForeground(Color.WHITE);
        lblSlogan.setFont(new Font("STXingkai", Font.PLAIN, 20));
        panel.add(lblSlogan);

        JLabel lblInicio = new JLabel("Inicio");
        lblInicio.setBounds(154, 111, 35, 21);
        lblInicio.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
        lblInicio.setForeground(Color.WHITE);
        lblInicio.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                dispose();
                Inicio inicio = new Inicio();
                inicio.setVisible(true);
            }
        });
        panel.add(lblInicio);

        JLabel lblAplicar = new JLabel("Aplicar a financiamiento");
        lblAplicar.setBounds(487, 112, 162, 19);
        lblAplicar.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
        lblAplicar.setForeground(Color.WHITE);
        lblAplicar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                dispose();
                AplicarFinanciamniento aplicarFinanciamiento = new AplicarFinanciamniento();
                aplicarFinanciamiento.setVisible(true);
            }
        });
        panel.add(lblAplicar);

        JLabel lblCar1 = new JLabel("");
        lblCar1.setBounds(10, 30, 104, 71);
        lblCar1.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen19.png"));
        panel.add(lblCar1);

        JLabel lblCar2 = new JLabel("");
        lblCar2.setBounds(835, 24, 150, 108);
        lblCar2.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen17.png"));
        panel.add(lblCar2);
        
        JLabel lblInventario = new JLabel("Inventario");
        lblInventario.setForeground(new Color(0, 0, 255));
        lblInventario.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
        lblInventario.setBounds(322, 111, 66, 21);
        panel.add(lblInventario);

        JLabel lblNewLabel_7 = new JLabel("Lista de Carros");
        lblNewLabel_7.setBounds(367, 172, 355, 48);
        lblNewLabel_7.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 25));
        contentPane.add(lblNewLabel_7);

        JLabel lblimage1 = new JLabel("");
        lblimage1.setBounds(10, 146, 183, 161);
        lblimage1.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen12.png"));
        contentPane.add(lblimage1);

        JLabel lblNewLabel_7_1 = new JLabel("Visualización de carros disponibles");
        lblNewLabel_7_1.setBounds(220, 212, 558, 48);
        lblNewLabel_7_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 25));
        contentPane.add(lblNewLabel_7_1);

        JLabel lblimage2 = new JLabel("");
        lblimage2.setBounds(788, 146, 192, 161);
        lblimage2.setIcon(new ImageIcon("C:\\Users\\sirja\\Downloads\\Imagen13.png"));
        contentPane.add(lblimage2);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 312, 1014, 338);
        panel_1.setBackground(new Color(25, 25, 112));
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 10, 993, 180);
        panel_1.add(scrollPane);

        // Inicialización de la tabla
        table = new JTable();
        actualizarTabla();
        scrollPane.setViewportView(table);

        // Campo de búsqueda por marca
        textFieldBMarca = new JTextField();
        textFieldBMarca.setBounds(37, 210, 150, 25);
        panel_1.add(textFieldBMarca);
        textFieldBMarca.setColumns(10);

        // Campo de búsqueda por modelo
        textFieldBModelo = new JTextField();
        textFieldBModelo.setBounds(211, 210, 150, 25);
        panel_1.add(textFieldBModelo);
        textFieldBModelo.setColumns(10);

        // Botón de búsqueda
        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setBackground(new Color(255, 165, 0));
        btnBuscar.setBounds(390, 210, 100, 25);
        panel_1.add(btnBuscar);
        btnBuscar.addActionListener(e -> {
            String marcaBuscada = textFieldBMarca.getText().trim();
            String modeloBuscado = textFieldBModelo.getText().trim();
            buscarCarro(marcaBuscada, modeloBuscado);
        });

        // Botón para agregar carro
        JButton btnAgregar = new JButton("Agregar Carro");
        btnAgregar.setBackground(new Color(34, 139, 34));
        btnAgregar.setBounds(843, 210, 150, 25);
        panel_1.add(btnAgregar);
        
        JLabel lblMarca = new JLabel("Marca");
        lblMarca.setForeground(Color.WHITE);
        lblMarca.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
        lblMarca.setBounds(85, 240, 54, 19);
        panel_1.add(lblMarca);
        
        JLabel lblModelo = new JLabel("Modelo");
        lblModelo.setForeground(Color.WHITE);
        lblModelo.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
        lblModelo.setBounds(261, 240, 71, 19);
        panel_1.add(lblModelo);
        
                JButton btnSalir = new JButton("SALIR");
                btnSalir.setBounds(24, 662, 121, 26);
                contentPane.add(btnSalir);
                btnSalir.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
                btnSalir.addActionListener(e -> {
                    JOptionPane.showMessageDialog(contentPane, "¡Hasta pronto!", "Salir", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                });
        btnAgregar.addActionListener(e -> {
            agregarCarro();
        });
    }

    // Método para actualizar la tabla con los datos actuales del inventario
    private void actualizarTabla() {
        String[] columnas = {"Marca", "Modelo", "Año", "Precio", "Color", "Acciones"};
        Object[][] datos = new Object[listaDeCarros.size()][6];
        for (int i = 0; i < listaDeCarros.size(); i++) {
            datos[i][0] = listaDeCarros.get(i).getMarca();
            datos[i][1] = listaDeCarros.get(i).getModelo();
            datos[i][2] = listaDeCarros.get(i).getAnio();
            datos[i][3] = listaDeCarros.get(i).getPrecio();
            datos[i][4] = listaDeCarros.get(i).getColor();
            datos[i][5] = "Vender";
        }

        DefaultTableModel model = new DefaultTableModel(datos, columnas) {
            public boolean isCellEditable(int row, int column) {
                return false; // No permitir editar las celdas
            }
        };

        table.setModel(model);
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = table.rowAtPoint(e.getPoint());
                int columna = table.columnAtPoint(e.getPoint());
                if (columna == 5) {
                    venderCarro(fila);
                }
            }
        });
    }

    // Método para vender un carro
    private void venderCarro(int index) {
        String modeloCarro = (String) table.getValueAt(index, 1);
        Carros carroVendido = null;

        // Buscar el carro en la lista original de carros
        for (Carros carro : listaDeCarros) {
            if (carro.getModelo().equalsIgnoreCase(modeloCarro)) {
                carroVendido = carro;
                listaDeCarros.remove(carro);
                break;
            }
        }

        if (carroVendido != null) {
            JOptionPane.showMessageDialog(contentPane, "Vendido el carro " + carroVendido.getModelo());
        } else {
            JOptionPane.showMessageDialog(contentPane, "El carro ya no está disponible.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        actualizarTabla();
    }

    // Método para agregar un nuevo carro
    private void agregarCarro() {
        JTextField marcaField = new JTextField();
        JTextField modeloField = new JTextField();
        JTextField anioField = new JTextField();
        JTextField precioField = new JTextField();
        JTextField colorField = new JTextField();
        final JComponent[] inputs = new JComponent[] {
            new JLabel("Marca"),
            marcaField,
            new JLabel("Modelo"),
            modeloField,
            new JLabel("Año"),
            anioField,
            new JLabel("Precio"),
            precioField,
            new JLabel("Color"),
            colorField
        };
        int result = JOptionPane.showConfirmDialog(null, inputs, "Agregar Carro", JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            try {
                String marca = marcaField.getText().trim();
                String modelo = modeloField.getText().trim();
                int anio = Integer.parseInt(anioField.getText().trim());
                double precio = Double.parseDouble(precioField.getText().trim());
                String color = colorField.getText().trim();
                listaDeCarros.add(new Carros(marca, modelo, anio, precio, color));
                actualizarTabla();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(contentPane, "Datos incorrectos. Intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Método para buscar un carro por marca y modelo
    private void buscarCarro(String marca, String modelo) {
        List<Carros> resultados = new ArrayList<>();
        for (Carros carro : listaDeCarros) {
            if ((marca.isEmpty() || carro.getMarca().equalsIgnoreCase(marca)) &&
                (modelo.isEmpty() || carro.getModelo().equalsIgnoreCase(modelo))) {
                resultados.add(carro);
            }
        }

        if (resultados.isEmpty()) {
            JOptionPane.showMessageDialog(contentPane, "El carro buscado no está en el inventario.", "Búsqueda", JOptionPane.INFORMATION_MESSAGE);
        } else {
            mostrarResultados(resultados);
        }
    }

    // Método para mostrar los resultados de la búsqueda
    private void mostrarResultados(List<Carros> resultados) {
        String[] columnas = {"Marca", "Modelo", "Año", "Precio", "Color", "Acciones"};
        Object[][] datos = new Object[resultados.size()][6];
        for (int i = 0; i < resultados.size(); i++) {
            datos[i][0] = resultados.get(i).getMarca();
            datos[i][1] = resultados.get(i).getModelo();
            datos[i][2] = resultados.get(i).getAnio();
            datos[i][3] = resultados.get(i).getPrecio();
            datos[i][4] = resultados.get(i).getColor();
            datos[i][5] = "Vender";
        }

        DefaultTableModel model = new DefaultTableModel(datos, columnas) {
            public boolean isCellEditable(int row, int column) {
                return false; // No permitir editar las celdas
            }
        };

        table.setModel(model);
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = table.rowAtPoint(e.getPoint());
                int columna = table.columnAtPoint(e.getPoint());
                if (columna == 5) {
                    venderCarro(fila);
                }
            }
        });
    }
    }