import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instanciamos las clases
        Alumnos a1 = new Alumnos("Pepito", 8);
        Alumnos a2 = new Alumnos("Juan", 1);
        Alumnos a3 = new Alumnos("Pedro", 3);
        Alumnos a4 = new Alumnos("Edgardo", 10);
        Alumnos a5 = new Alumnos("Enzo", 6);

        //Guardamos en un ArrayList
        ArrayList<Alumnos> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(a1);
        listaAlumnos.add(a2);
        listaAlumnos.add(a3);
        listaAlumnos.add(a4);
        listaAlumnos.add(a5);

        //Mostramos el ArrayList
        System.out.println("Lista de Alumnos:");
        for (Alumnos alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }
}