
import java.util.Scanner;

public class metodos {

    public obj[][] llenarMatriz(int f, int c, Scanner sc) {
        obj[][] C = new obj[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                C[i][j] = new obj();

                System.out.print("Nombre: ");
                String nombre = sc.next();

                System.out.print("Precio: ");
                

                while (!sc.hasNextDouble()) {
                    System.out.println("Ingrese un precio válido:");
                    sc.next();
                }
                double precio = sc.nextDouble();

                System.out.print("Cantidad: ");
                

                while (!sc.hasNextInt()) {
                    System.out.println("Ingrese una cantidad válida:");
                    sc.next();
                }
                int cantidad = sc.nextInt();

                C[i][j].setNombre(nombre);
                C[i][j].setPrecio(precio);
                C[i][j].setCantidad(cantidad);
            }
        }

        return C;
    }

    public void buscarPorNombre(obj[][] c, String nombreBuscado) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if (c[i][j].getNombre().equals(nombreBuscado)) {
                    System.out.println("Producto encontrado en fila " + i + " columna " + j);
                    return;
                }
            }
        }

        System.out.println("Producto no encontrado");
    }
}
