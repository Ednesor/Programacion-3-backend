public class Alumnos {
    String nombre;
    int nota;

    public Alumnos() {
    }

    public Alumnos(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}
