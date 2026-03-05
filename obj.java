//Dada una matriz que representa un almacén donde cada celda contiene un objeto 
//Producto con atributos nombre, precio y cantidad, 
//escribe un algoritmo que encuentre la ubicación (fila, columna) de un producto
//en una lisa de 30 productos buscar específico por su nombre.
//Solución: Recorre la matriz buscando el Producto cuyo nombre 
//coincida con el buscado. Devuelve la posición de la celda.

public class obj {
    private String nombre;
    private double precio;  
    private int cantidad;   

    public obj() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }



    
}
