package org.example;

import java.lang.reflect.Method;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            Persona p1 = new Persona("Ana", 25);

            // Obtener la clase Persona e imprimir sus constructores
            Class<?> personaClass = Class.forName("org.example.Persona");
            var constructor = personaClass.getConstructor(String.class, int.class);
            System.out.println(constructor);

            // Instanciar objeto con reflection
            Object persona = constructor.newInstance("Juan", 30);
            System.out.println(persona);

            //Modifica el nombre usando reflection
            var setNombreMethod = personaClass.getMethod("setNombre", String.class);
            setNombreMethod.invoke(persona, "Pedro");
            System.out.println(persona);

            //Invocar metodo que muestra la informacion de la persona toString
            var toStringMethod = personaClass.getMethod("toString");
            String resultado = (String) toStringMethod.invoke(persona);
            System.out.println(resultado);

            //Modifica el encapsulamiento de Saludar() hacia private usando reflection
            var saludarMethod = personaClass.getMethod("saludar");
            String saludo = (String) saludarMethod.invoke(persona);

            Method metodo = Persona.class.getDeclaredMethod("Saludar");
            metodo.setAccessible(true);
            System.out.println(p1.saludar());

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}