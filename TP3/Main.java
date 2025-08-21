import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        Producto p1 = new Producto("A001", "Teclado", 1500);
        Producto p2 = new Producto("A002", "Mouse", 800);
        Producto p3 = new Producto("A001", "Teclado Mecánico", 2000);

        agregarSiNoExiste(productos, p1);
        agregarSiNoExiste(productos, p2);
        agregarSiNoExiste(productos, p3);

        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    private static void agregarSiNoExiste(List<Producto> lista, Producto p) {
        if (!lista.contains(p)) {
            lista.add(p);
            System.out.println("Agregado: " + p);
        } else {
            System.out.println("No se agregó (duplicado): " + p);
        }
    }
}