import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("123", "Coca Cola");
        Producto p2 = new Producto("123", "Coca Cola Zero");
        Producto p3 = new Producto("456", "Pepsi");
        Producto p4 = new Producto("456", "Pepsi Light");
        Producto p5 = new Producto("789", "Fanta");
        Producto p56 = new Producto("789", "Fanta Zero");

        HashSet <Producto> productos = new HashSet<>();
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        productos.add(p56);

        System.out.println("Tamaño del HashSet: " + productos.size());
        for (Producto p : productos) {
            System.out.println(p.codigo + " - " + p.descripcion);
        }
    }
}