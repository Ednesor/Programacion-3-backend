class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad); // Llamada al constructor de la clase base
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{nombre='" + nombre + "', edad=" + edad + ", carrera='" + carrera + "'}";
    }
}