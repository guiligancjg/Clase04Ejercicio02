package Clase04Ejercicio02;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos;

    public Carrito(ArrayList<Producto> productos){
        this.productos = productos;
    }

    public double precio(){
        double total = 0;
        for (Producto lista: productos) {
            total += lista.getPrecio() * lista.getCantidad();
        }
        return total;
    }

}




