import java.util.Scanner;

public class ProgramaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String [] opcionesPrincipal = {"Agregar y modificar productos.", "Controlar stock, precios y liquidaciones.", "Salir del programa."};
        String [] opcionesAgregar = {"Añadir productos.", "Modificar productos.", "Imprimir datos de productos.", "Salir al menú principal."};
        String [] opcionesStock = {"Añadir / Restar stock de un producto.", "Modificar precio.", "Manejar liquidaciones.", "Salir al menú principal."};
    
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
                case 1: System.out.println("Opcion 1.");
                        menuAgregar(opcionesAgregar, sc);
                    break;
                case 2: System.out.println("Opcion 2.");
                        menuStock(opcionesStock, sc);
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
                case 1: System.out.println("Opcion 1.");
                    break;
                case 2: System.out.println("Opcion 2.");
                    break;
                case 3: System.out.println("Opcion 3");
                    break;
                case 4: System.out.println("Vovliendo al menú principal...");
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
                case 1: System.out.println("Opcion 1.");
                    break;
                case 2: System.out.println("Opcion 2.");
                    break;
                case 3: System.out.println("Opcion 3");
                    break;
                case 4: System.out.println("Vovliendo al menú principal...");
                    break;
                default: System.out.println("La opción no es válida.");
                    break;
            }
            System.out.println("---------------------------------");
        } while (opcion != 4);  
    }

    public static int datoInt (Scanner sc){
        int numero=sc.nextInt();
        return numero;
    }
}