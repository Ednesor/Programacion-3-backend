package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista de enteros
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40);

        // Lista de cadenas
        List<String> nombres = Arrays.asList("Ana", "Luis", "María");

        // Usando el metodo genérico
        System.out.println("Lista de enteros:");
        Utiliadades.imprimirLista(numeros);

        System.out.println("\nLista de cadenas:");
        Utiliadades.imprimirLista(nombres);
    }
}