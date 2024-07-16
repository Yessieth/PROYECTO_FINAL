package Logica;

public class Cliente {
    private String nombre;
    private String apellido;
    private String correo;
    private String cedula;
    private String telefono;
    private String financiamiento;
    private double salario;
    private double otro;
    private String continuidadLaboral;

    // Constructor
    public Cliente(String nombre, String apellido, String correo, String cedula, String telefono, String financiamiento, double salario, double otro, String continuidadLaboral) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.cedula = cedula;
        this.telefono = telefono;
        this.financiamiento = financiamiento;
        this.salario = salario;
        this.otro = otro;
        this.continuidadLaboral = continuidadLaboral;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFinanciamiento() {
        return financiamiento;
    }

    public void setFinanciamiento(String financiamiento) {
        this.financiamiento = financiamiento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getOtro() {
        return otro;
    }

    public void setOtro(double otro) {
        this.otro = otro;
    }

    public String getContinuidadLaboral() {
        return continuidadLaboral;
    }

    public void setContinuidadLaboral(String continuidadLaboral) {
        this.continuidadLaboral = continuidadLaboral;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", financiamiento='" + financiamiento + '\'' +
                ", salario=" + salario +
                ", otro=" + otro +
                ", continuidadLaboral='" + continuidadLaboral + '\'' +
                '}';
    }
}
