package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("001", "Libro de Java", 29.99, "Autor A");
        Producto p2 = new Producto("002", "Libro de Python", 39.99, "Autor B");
        Producto p3 = new Producto("003", "Libro de C++", 49.99, "Autor C");
        Producto p4 = new Producto("004", "Libro de JavaScript", 19.99, "Autor D");

        // Los dto sirven para transportar solo los datos necesarios sin exponer toda la informacion del objeto original
        ProductoDTO pdto1 = new ProductoDTO();
        pdto1.setCodigo(p1.getCodigo());
        pdto1.setNombre(p1.getNombre());
        pdto1.setPrecio(p1.getPrecio());

        ProductoDTO pdto2 = new ProductoDTO();
        pdto2.setCodigo(p2.getCodigo());
        pdto2.setNombre(p2.getNombre());
        pdto2.setPrecio(p2.getPrecio());

        ProductoDTO pdto3 = new ProductoDTO();
        pdto3.setCodigo(p3.getCodigo());
        pdto3.setNombre(p3.getNombre());
        pdto3.setPrecio(p3.getPrecio());

        ProductoDTO pdto4 = new ProductoDTO();
        pdto4.setCodigo(p4.getCodigo());
        pdto4.setNombre(p4.getNombre());
        pdto4.setPrecio(p4.getPrecio());

        List<ProductoDTO> listaProductosDTO = new ArrayList<>();
        listaProductosDTO.add(pdto1);
        listaProductosDTO.add(pdto2);
        listaProductosDTO.add(pdto3);
        listaProductosDTO.add(pdto4);

        System.out.println("Lista de Productos DTO:");
        for (ProductoDTO productoDTO : listaProductosDTO) {
            System.out.println("Código: " + productoDTO.getCodigo() +
                    ", Nombre: " + productoDTO.getNombre() +
                    ", Precio: " + productoDTO.getPrecio());
        }
    }
}