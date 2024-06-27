package Proyecto_mejora;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int opcion;

        do {
            System.out.println("\n--- Menú Gestión de Inventario ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Actualizar stock del producto");
            System.out.println("4. Mostrar lista de productos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción del menú: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            //Estas 3 variables se repetian en mas de 2 bloques y solo tienen alcance en un bloque
            String codigo; //Declaro la variable codigo fuera de switch
            String nombre; //Declaro la variable nombre fuera de switch
            int cantidad;  //Declaro la variable cantidad fuera de switch


            switch (opcion) {
                case 1:
                    System.out.print("Ingrese código del producto: ");
                    codigo = scanner.nextLine();
                    System.out.print("Ingrese nombre del producto: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese stock del producto: ");
                    cantidad = scanner.nextInt();
                    inventario.agregarProducto(new Producto(codigo, nombre, cantidad));
                    break;
                case 2:
                    System.out.print("Ingrese código del producto a eliminar: ");
                    codigo = scanner.nextLine();
                    inventario.eliminarProducto(codigo);
                    break;
                case 3:
                    System.out.print("Ingrese código del producto: ");
                    codigo = scanner.nextLine();
                    System.out.print("Ingrese nuevo stock: ");
                    cantidad = scanner.nextInt();
                    inventario.actualizarCantidad(codigo, cantidad);
                    break;
                case 4:
                    inventario.mostrarProductos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 5);
        //Se usa el do-While
        //Terminar el bucle en la opción 5 o cerrar el menu
        scanner.close();
    }
}