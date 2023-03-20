package Clase04Ejercicio02;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String nombreArchivo = "src/Clase04Ejercicio02/productos.txt";
        LeerArchivo archivo = new LeerArchivo(nombreArchivo);
        ArrayList<Producto> productos = archivo.leerProductos();
        Carrito carrito = new Carrito(productos);

        System.out.println("cant\tprecioUnitario\tproducto");
        for (Producto producto : productos) {
            System.out.println(producto.getCantidad() + "\t\t$"+ producto.getPrecio() + "\t\t\t" + producto.getNombre());
        }

        System.out.println("Total a Pagar: $" + carrito.precio());
    }

}
