package Logica;

import java.util.ArrayList;

public class ListaDeCarros {
    private static final int MAX_CARROS = 100;
    private ArrayList<Carros> carros ;

    public ListaDeCarros() {
        carros = new ArrayList<>();
    }

    public void agregarCarros(Carros carro) {
        if (carros.size() < MAX_CARROS) {
            carros.add(carro);
        } else {
            System.out.println("No se puede agregar más carros. Límite alcanzado.");
        }
    }

    public ArrayList<String> obtenerCarrosDisponibles() {
        ArrayList<String> carrosDisponibles = new ArrayList<>();

        for (Carros carros : carros) {
                carrosDisponibles.add(carros.getModelo());
        }

        return carrosDisponibles;
    }

}
