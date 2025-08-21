public class Main {
    public static void main(String[] args) {
        // Crear cursos
        Curso estructuras = new Curso("Estructuras de Datos", "Prof. Carlos Ruiz");
        Curso programacion = new Curso("Programación Orientada a Objetos", "Prof. Ana Pérez");

        // Crear estudiantes
        Estudiante e1 = new Estudiante("Juan", 20, "Ingeniería en Sistemas");
        Estudiante e2 = new Estudiante("María", 22, "Diseño Gráfico");
        Estudiante e3 = new Estudiante("Pedro", 21, "Medicina");

        // Agregar estudiantes a cursos
        estructuras.agregarEstudiante(e1);
        estructuras.agregarEstudiante(e2);

        programacion.agregarEstudiante(e3);

        // Imprimir cursos
        System.out.println(estructuras);
        System.out.println(programacion);
    }
}