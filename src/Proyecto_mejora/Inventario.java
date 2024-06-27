package Proyecto_mejora;

import java.util.ArrayList;

public class Inventario {
    ArrayList<Producto> productos;

    Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(String codigo) {
        productos.removeIf(producto -> producto.getCodigo().equals(codigo));
    }

    public void actualizarCantidad(String codigo, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                producto.setCantidad(cantidad);
                break;
            }
        }
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}