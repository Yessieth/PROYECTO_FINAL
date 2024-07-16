package Logica;

public class Carros {
    private String marca;
    private String modelo;
    private String año;
    private String transmision;
    private String kms;
    private String precio;

    public Carros(String marca, String modelo, String transmision, String año, String precio, String kms2) {
        this.marca = marca;
        this.modelo = modelo;
        this.transmision = transmision;
        this.año = año;
        this.precio = precio;
        this.kms = kms2;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getKms() {
        return kms;
    }

    public void setKms(String kms) {
        this.kms = kms;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", transmision='" + transmision + '\'' +
                ", kms=" + kms +
                ", precio=" + precio +
                '}';
    }
}
