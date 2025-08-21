import java.util.Objects;

class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // misma referencia
        if (obj == null || getClass() != obj.getClass()) return false; // distinto tipo
        Producto otro = (Producto) obj;
        return Objects.equals(this.codigo, otro.codigo); // igualdad por código
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo); // siempre que sobrescribas equals, también hashCode
    }

    @Override
    public String toString() {
        return nombre + " (Código: " + codigo + ", Precio: $" + precio + ")";
    }
}