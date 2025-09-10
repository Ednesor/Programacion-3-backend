package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Caja de String
        Caja<String> cajaDeTexto = new Caja<>();
        cajaDeTexto.guardar("Hola Mundo");
        String texto = cajaDeTexto.obtener();
        System.out.println("Caja de String: " + texto);

        // Caja de Integer
        Caja<Integer> cajaDeNumero = new Caja<>();
        cajaDeNumero.guardar(123);
        Integer numero = cajaDeNumero.obtener();
        System.out.println("Caja de Integer: " + numero);
    }
}