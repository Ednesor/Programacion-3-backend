import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Producto> productos = new HashSet<>();

        Producto p1 = new Producto(101, "Laptop", 1500.0);
        Producto p2 = new Producto(102, "Mouse", 25.0);
        Producto p3 = new Producto(101, "Laptop Pro", 1600.0);

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);

        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}