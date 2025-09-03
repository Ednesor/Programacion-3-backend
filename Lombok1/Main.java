package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 25);
        Persona p2 = new Persona();

        System.out.println("Persona 1: "+ p1.getNombre() + ", edad: " + p1.getEdad());
        p2.setEdad(40);
        p2.setNombre("Ana");
        System.out.println("Persona 2: "+ p2.getNombre() + ", edad: " + p2.getEdad());
    }
}