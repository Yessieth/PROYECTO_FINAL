package Logica;

public class Cliente {
    private String nombre;
    private String apellido;
    private String correo;
    private String cedula;
    private String telefono;
    private String tipoFinanciamiento;
    private String salario;
    private String continuidadLaboral;

    // Constructor
    public Cliente(String nombre, String apellido, String correo, String cedula, String telefono,
                   String tipoFinanciamiento, String salario, String continuidadLaboral) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.cedula = cedula;
        this.telefono = telefono;
        this.tipoFinanciamiento = tipoFinanciamiento;
        this.salario = salario;
        this.continuidadLaboral = continuidadLaboral;
    }

    // Getters y setters (puedes generarlos automáticamente en tu IDE)

    // Método para evaluar si el cliente puede aplicar al financiamiento
    public boolean puedeAplicar() {
        boolean aplicaPorSalario = false;
        boolean aplicaPorContinuidad = false;

        // Evaluar salario
        switch (salario) {
            case "Entre $200 y $299":
            case "Entre $300 y $399":
                aplicaPorSalario = false;
                break;
            case "Entre $400 y $499":
            case "Entre $500 y $599":
            case "Entre $600 y $699":
            case "Entre $700 y $799":
            case "Entre $800 y $899":
            case "Entre $900 y $999":
            case "Más de $1 000":
                aplicaPorSalario = true;
                break;
        }

        // Evaluar continuidad laboral
        if (continuidadLaboral.equals("Más de un año laborando")) {
            aplicaPorContinuidad = true;
        } else {
            aplicaPorContinuidad = false;
        }

        // Determinar si puede aplicar
        return aplicaPorSalario && aplicaPorContinuidad;
    }

    // Métodos adicionales según tus necesidades

    // Getters y setters
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

    public String getTipoFinanciamiento() {
        return tipoFinanciamiento;
    }

    public void setTipoFinanciamiento(String tipoFinanciamiento) {
        this.tipoFinanciamiento = tipoFinanciamiento;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getContinuidadLaboral() {
        return continuidadLaboral;
    }

    public void setContinuidadLaboral(String continuidadLaboral) {
        this.continuidadLaboral = continuidadLaboral;
    }
}

