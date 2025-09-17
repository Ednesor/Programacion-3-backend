package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto("Arroz", "Alimentos", 120, 50),
                new Producto("Detergente", "Limpieza", 90, 30),
                new Producto("Leche", "Alimentos", 110, 25),
                new Producto("Shampoo", "Limpieza", 150, 10),
                new Producto("Pan", "Alimentos", 80, 40),
                new Producto("Galletitas", "Alimentos", 130, 15),
                new Producto("Lavandina", "Limpieza", 105, 20)
        );

        // 1. Listar productos con precio > 100, ordenados por precio descendente
        List<Producto> carosOrdenados = productos.stream()
                .filter(p -> p.getPrecio() > 100)
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .toList();

        System.out.println("Productos con precio > 100 ordenados:");
        carosOrdenados.forEach(System.out::println);

        // 2. Agrupar por categoría y calcular el stock total
        Map<String, Integer> stockPorCategoria = productos.stream()
                .collect(groupingBy(
                        Producto::getCategoria,
                        summingInt(Producto::getStock)
                ));

        System.out.println("\nStock total por categoría:");
        stockPorCategoria.forEach((cat, stock) ->
                System.out.println(cat + ": " + stock)
        );

        // 3. Generar String separando con ';' cada producto (nombre y precio)
        String productosStr = productos.stream()
                .map(p -> p.getNombre() + " $" + p.getPrecio())
                .collect(joining("; "));

        System.out.println("\nString productos (nombre y precio):");
        System.out.println(productosStr);

        // 4.a. Precio promedio general
        double promedioGeneral = productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0.0);

        System.out.println("\nPrecio promedio general: " + promedioGeneral);

        // 4.b. Precio promedio por categoría
        Map<String, Double> promedioPorCategoria = productos.stream()
                .collect(groupingBy(
                        Producto::getCategoria,
                        averagingDouble(Producto::getPrecio)
                ));

        System.out.println("Precio promedio por categoría:");
        promedioPorCategoria.forEach((cat, prom) ->
                System.out.println(cat + ": " + prom)
        );
    }
}