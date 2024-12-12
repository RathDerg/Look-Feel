import java.util.Scanner;

public class ProgramaMain {
    private static GestorProductos gestor = new GestorProductos();
    private static boolean flag = false;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String [] opcionesPrincipal = {"Agregar / Modificar datos de los productos.", "Controlar stock y precios.", "Salir del programa."};
        String [] opcionesAgregar = {"Añadir productos.", "Modificar datos de los productos.", "Imprimir datos de productos.", "Salir al menú principal."};
        String [] opcionesStock = {"Modificar stock de un producto.", "Modificar precio de un producto.", "Salir al menú principal."};
    
        gestor.inicio();
        menuPrincipal(opcionesPrincipal, opcionesAgregar, opcionesStock, sc);
    
        sc.close();
    }

    public static void menuPrincipal (String [] opcionesPrincipal, String [] opcionesAgregar, String [] opcionesStock, Scanner sc){
        int opcion = 0;
        System.out.println("---------------------------------");
        System.out.println("--- ADMINISTRADOR DE LOOK & FEEL ---");
        do{
            System.out.println("--- MENÚ PRINCIPAL ---");
            System.out.println("---------------------------------");
            System.out.println("¿Qué acción desea realizar?");
            for (int i=0; i<opcionesPrincipal.length ; i++){
                System.out.println((i+1) + ". " + opcionesPrincipal[i]);
            }
            System.out.print("Opción: ");
            opcion=datoInt(sc);
            System.out.println("---------------------------------");
            switch (opcion){
                case 1: menuAgregar(opcionesAgregar, sc);
                    break;
                case 2: menuStock(opcionesStock, sc);
                    break;
                case 3: System.out.println("Saliendo del programa...");
                    break;
                default: System.out.println("La opción no es válida.");
                    break;
            }
            System.out.println("---------------------------------");
        } while (opcion != 3);
    }

    public static void menuAgregar (String [] opcionesAgregar, Scanner sc){
        int opcion = 0;
        System.out.println("---------------------------------");
        System.out.println("--- ADMINISTRADOR DE LOOK & FEEL ---");
        do{
            System.out.println("--- MENÚ AGREGAR ---");
            System.out.println("---------------------------------");
            System.out.println("¿Qué acción desea realizar?");
            for (int i=0; i<opcionesAgregar.length ; i++){
                System.out.println((i+1) + ". " + opcionesAgregar[i]);
            }
            System.out.print("Opción: ");
            opcion=datoInt(sc);
            System.out.println("---------------------------------");
            switch (opcion){
                case 1: if (!flag){   
                            System.out.println("Accediendo a agregar objetos...");
                            gestor.agregarProductos(sc);
                            flag = true;
                        } else{
                            System.out.println("Los productos ya han sido añadidos.");
                        }
                    break;
                case 2: if (flag){
                            System.out.println("Accediendo a modificar datos de los productos..");
                            gestor.modificarProductos(sc);
                        } else {
                            System.out.println("No hay productos que modificar. Añádalos para poder operar.");
                        }
                    break;
                case 3: if (flag){
                            System.out.println("Accediendo a ver los detalles...");
                            gestor.obtenerDetalles(sc);
                        } else {
                            System.out.println("No hay productos en el armario. Añádalos para poder operar.");
                        }
                    break;
                case 4: System.out.println("Volviendo al menú principal...");
                    break;
                default: System.out.println("La opción no es válida.");
                    break;
            }
            System.out.println("---------------------------------");
        } while (opcion != 4);
    }

    public static void menuStock (String [] opcionesStock, Scanner sc){
        int opcion = 0;
        System.out.println("---------------------------------");
        System.out.println("--- ADMINISTRADOR DE LOOK & FEEL ---");
        do{
            System.out.println("--- MENÚ STOCK ---");
            System.out.println("---------------------------------");
            System.out.println("¿Qué acción desea realizar?");
            for (int i=0; i<opcionesStock.length ; i++){
                System.out.println((i+1) + ". " + opcionesStock[i]);
            }
            System.out.print("Opción: ");
            opcion=datoInt(sc);
            System.out.println("---------------------------------");
            switch (opcion){
                case 1: if (flag){
                            System.out.println("Accediendo a modificar el stock...");
                            gestor.modificarCantidad(sc);
                        } else {
                            System.out.println("No hay productos en el armario. Añádalos para poder operar.");
                        }
                    break;
                case 2: if (flag){
                            System.out.println("Accediendo a modificar el precio...");
                            gestor.modificarPrecio(sc);
                        } else {
                            System.out.println("No hay productos en el armario. Añádalos para poder operar.");
                        }
                    break;
                case 3: System.out.println("Volviendo al menú principal...");
                    break;
                default: System.out.println("La opción no es válida.");
                    break;
            }
            System.out.println("---------------------------------");
        } while (opcion != 3);  
    }

    public static int datoInt (Scanner sc){
        int numero=sc.nextInt();
        return numero;
    }
}