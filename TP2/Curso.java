import java.util.ArrayList;
import java.util.List;

class Curso {
    private String nombre;
    private String profesor;
    private List<Estudiante> listaDeEstudiantes;

    public Curso(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.listaDeEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        listaDeEstudiantes.add(e);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso: ").append(nombre).append("\n");
        sb.append("Profesor: ").append(profesor).append("\n");
        sb.append("Cantidad de alumnos: ").append(listaDeEstudiantes.size()).append("\n");
        int i = 1;
        for (Estudiante e : listaDeEstudiantes) {
            sb.append(i++).append(". ").append(e).append("\n");
        }
        return sb.toString();
    }
}