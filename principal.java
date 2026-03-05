
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 1;
        //boolean nw = true;
        metodos m = new metodos();

        obj[][] almacen = m.llenarMatriz(2, 2, sc);
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String nombreBuscado = sc.next();
        m.buscarPorNombre(almacen, nombreBuscado);

        sc.close();
        while (opt == 1) {
            System.out.println("Ingrese el nombre de otro producto: 1) si 2) no: ");
            opt = sc.nextInt();

        }

    }
}
