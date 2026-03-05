
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 1;
       
        metodos m = new metodos();
        
        System.out.println("Ingrese numero de filas:");        
        int filas = sc.nextInt();
        System.out.println("Ingrese numero de columnas:"); 
        int columnas = sc.nextInt();


        obj[][] almacen = m.llenarMatriz(filas, columnas, sc);
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String nombreBuscado = sc.next();
        m.buscarPorNombre(almacen, nombreBuscado);

        
        while (opt == 1) {
            System.out.println("Ingrese el nombre de otro producto: 1) si 2) no: ");
            opt = sc.nextInt();
            if (opt == 1) {
                System.out.print("Ingrese el nombre del producto a buscar: ");
                nombreBuscado = sc.next();
                m.buscarPorNombre(almacen, nombreBuscado);
            }
            opt = sc.nextInt();


        }
sc.close();
    }
}
