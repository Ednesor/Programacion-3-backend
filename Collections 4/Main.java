import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso("Programación I", "Juan Pérez", "CS101");
        Curso c2 = new Curso("Matemáticas", "María Gómez", "MATH101");
        Curso c3 = new Curso("Física", "Carlos López", "PHY101");
        Curso c4 = new Curso("Química", "Ana Martínez", "CHEM101");
        Curso c5 = new Curso("Biología", "Luis Rodríguez", "BIO101");

        HashMap<String, Curso> mapaCursos = new HashMap<>();
        mapaCursos.put(c1.codigo, c1);
        mapaCursos.put(c2.codigo, c2);
        mapaCursos.put(c3.codigo, c3);
        mapaCursos.put(c4.codigo, c4);
        mapaCursos.put(c5.codigo, c5);

        System.out.println("Buscamos por codigo:");
        System.out.println("Curso con código CS101: " + mapaCursos.get("CS101").nombre);
        System.out.println("Curso con código MATH101: " + mapaCursos.get("MATH101").nombre);

        System.out.println("\nListado de todos los cursos:");
        for (Map.Entry<String, Curso> entry: mapaCursos.entrySet()) {
            System.out.println("Código: " + entry.getKey() + ", Nombre del curso: " + entry.getValue().nombre);
        }
    }
}