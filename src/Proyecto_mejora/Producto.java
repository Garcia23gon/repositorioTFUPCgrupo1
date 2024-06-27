package Proyecto_mejora;
//Código para la variable de salida: LISTA DE PRODUCTO
public class Producto {
    String codigo;
    String nombre;
    int cantidad;

    public Producto(String codigo, String nombre, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    //Utilizamos esta anotación para sobreescribir toString cuando se modifica
    //Ya que hay una opcion para modificar el stock y no genere error al compilarse
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Stock: " + cantidad;
    }
}
