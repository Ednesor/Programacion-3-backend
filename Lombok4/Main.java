package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("001", "Coca-Cola", "Coca-Cola Company", 1.5);
        Producto p2 = new Producto("002", "Pepsi", "PepsiCo", 1.4);
        Producto p3 = new Producto("003", "Fanta", "Coca-Cola Company", 1.3);

        ProductoRecord pr1 = new ProductoRecord(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductoRecord pr2 = new ProductoRecord(p2.getCodigo(), p2.getNombre(), p2.getPrecio());
        ProductoRecord pr3 = new ProductoRecord(p3.getCodigo(), p3.getNombre(), p3.getPrecio());

        List<ProductoRecord> lista = new ArrayList<>();
        lista.add(pr1);
        lista.add(pr2);
        lista.add(pr3);

        System.out.println("Lista de productos:");
        for (ProductoRecord pr : lista) {
            System.out.println(pr);
        }


    }
}