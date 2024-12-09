import java.util.Scanner;

public class GestorProductos {
    private Chaqueta [] chaquetas = new Chaqueta[5];
    private Camiseta [] camisetas= new Camiseta[5];
    private Pantalon [] pantalones = new Pantalon[5];
    private Zapato [] zapatos = new Zapato[5];
    private String [] menuObjetos = {"Chaquetas.", "Camisetas.", "Pantalones.", "Zapatos.", "Volver al menú."};
    private String [] atributosObjetos = {"Tipo.", "Color.", "Talla."};

    /** JD inicio
     * Este método se llamará al inicio del programa, iniciando cada objeto del array perteneciente.
     */
    protected void inicio (){
        for (int i=0 ; i<chaquetas.length ; i++){
            chaquetas[i] = new Chaqueta();
        }
        for (int i=0 ; i<camisetas.length ; i++){
            camisetas[i] = new Camiseta();
        }
        for (int i=0 ; i<pantalones.length ; i++){
            pantalones[i] = new Pantalon();
        }
        for (int i=0 ; i<zapatos.length ; i++){
            zapatos[i] = new Zapato();
        }
    }

    /** JD agregarProductos
     * Al llamarse este método, lo que realiza es el añadir a los arrays de objetos sus datos pertenecientes. Se recorrerán los 4 arrays de
     * objetos y se irán añadiendo todas las chaquetas, camisetas, pantalones y zapatos en este orden.
     * @param sc Variable Scanner traída desde el ProgramaMain. 
     */
    protected void agregarProductos (Scanner sc){
        System.out.println("--- Su armario dispone de 5 huecos para cada tipo de ropa: Chaquetas, Camisetas, Pantalones y Zapatos. ---");
        for (int i = 0 ; i < chaquetas.length ; i++){
            sc.nextLine();
            System.out.println("-------------------------------");
            System.out.println("--- Chaqueta " + (i+1) + " ---");
            System.out.println("-------------------------------");
            System.out.print("Tipo de la chaqueta: ");
            chaquetas[i].setTipo(sc.nextLine());
            System.out.println("-------------------------------");
            System.out.print("Color de la chaqueta: ");
            chaquetas[i].setColor(sc.nextLine());
            System.out.println("-------------------------------");
            System.out.print("Talla de la chaqueta: ");
            chaquetas[i].setTalla(sc.nextLine());
            System.out.println("-------------------------------");
            System.out.print("Cantidad de la chaqueta: ");
            chaquetas[i].setCantidad(sc.nextInt());
            System.out.println("-------------------------------");
            System.out.print("Precio de la chaqueta: ");
            chaquetas[i].setPrecio(sc.nextDouble());
            System.out.println("-------------------------------");
        }
        for (int i = 0 ; i < camisetas.length ; i++){
            sc.nextLine();
            System.out.println("-------------------------------");
            System.out.println("--- Camiseta " + (i+1) + " ---");
            System.out.println("-------------------------------");
            System.out.print("Tipo de la camiseta: ");
            camisetas[i].setTipo(sc.nextLine());
            System.out.println("-------------------------------");
            System.out.print("Color de la camiseta: ");
            camisetas[i].setColor(sc.nextLine());
            System.out.println("-------------------------------");
            System.out.print("Talla de la camiseta: ");
            camisetas[i].setTalla(sc.nextLine());
            System.out.println("-------------------------------");
            System.out.print("Cantidad de la camiseta: ");
            camisetas[i].setCantidad(sc.nextInt());
            System.out.println("-------------------------------");
            System.out.print("Precio de la camiseta: ");
            camisetas[i].setPrecio(sc.nextDouble());
            System.out.println("-------------------------------");
        }
        for (int i = 0 ; i < pantalones.length ; i++){
            sc.nextLine();
            System.out.println("-------------------------------");
            System.out.println("--- Pantalón " + (i+1) + " ---");
            System.out.println("-------------------------------");
            System.out.print("Tipo del pantalón: ");
            pantalones[i].setTipo(sc.nextLine());
            System.out.println("-------------------------------");
            System.out.print("Color del pantalón: ");
            pantalones[i].setColor(sc.nextLine());
            System.out.println("-------------------------------");
            System.out.print("Talla del pantalón: ");
            pantalones[i].setTalla(sc.nextLine());
            System.out.println("-------------------------------");
            System.out.print("Cantidad del pantalón: ");
            pantalones[i].setCantidad(sc.nextInt());
            System.out.println("-------------------------------");
            System.out.print("Precio del pantalón: ");
            pantalones[i].setPrecio(sc.nextDouble());
            System.out.println("-------------------------------");
        }
        for (int i = 0 ; i < zapatos.length ; i++){
            sc.nextLine();
            System.out.println("-------------------------------");
            System.out.println("--- Par de zapatos " + (i+1) + " ---");
            System.out.println("-------------------------------");
            System.out.print("Tipo de los zapatos: ");
            zapatos[i].setTipo(sc.nextLine());
            System.out.println("-------------------------------");
            System.out.print("Color de los zapatos: ");
            zapatos[i].setColor(sc.nextLine());
            System.out.println("-------------------------------");
            System.out.print("Talla de los zapatos: ");
            zapatos[i].setTalla(sc.nextLine());
            System.out.println("-------------------------------");
            System.out.print("Cantidad de los zapatos(en pares): ");
            zapatos[i].setCantidad(sc.nextInt());
            System.out.println("-------------------------------");
            System.out.print("Precio de los zapatos: ");
            zapatos[i].setPrecio(sc.nextDouble());
            System.out.println("-------------------------------");      
        }
        System.out.println("--- PRODUCTOS AÑADIDOS ---");
    }

    /** JD modificarProductos
     * Este método, cuando se le llame, pedirá al usuario varias opciones, siendo estas mostradas por consola. Según navegue el usuario, este
     * podrá modificar tres parámetros en esta opción los cuales son: Tipo, Talla y Color. También se incluirá la opción de volver al menú
     * previo en caso de no querer modificar nada. Este método se repetirá hasta que el usuario decida querer salir de esta opción.
     * @param sc Variable Scanner traída desde el ProgramaMain.
     */
    protected void modificarProductos (Scanner sc){
        int opcion=0, opcion2=0, opcion3 = 0;
        System.out.println("---------------------------------");
        do{
            System.out.println("¿Qué tipo de prenda quieres modificar?");
            for (int i = 0 ; i<menuObjetos.length ; i++){
                System.out.println((i+1) + ". " + menuObjetos[i]);
            }
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            System.out.println("---------------------------------");
            switch (opcion) {
                case 1: // Para las chaquetas.
                    do{
                        for (int i = 0 ; i<chaquetas.length ; i++){
                            System.out.println((i+1) + ". " + chaquetas[i].imprimirDetalles());
                        }
                        System.out.print("Opción: ");
                        opcion2 = sc.nextInt();
                        System.out.println("---------------------------------");
                        if (opcion2<1 || opcion2>chaquetas.length){
                            System.out.println("La opción no es válida.");
                        }
                    } while (opcion2<1 || opcion2>chaquetas.length);
                    do{
                        atributos();
                        System.out.print("Opción: ");
                        opcion3 = sc.nextInt();
                        System.out.println("---------------------------------");
                            switch (opcion3) {
                                case 1: sc.nextLine();
                                        System.out.println("Tipo actual: "+chaquetas[(opcion2-1)].getTipo());
                                        chaquetas[(opcion2-1)].setTipo(sc.nextLine());
                                    break;
                                case 2: sc.nextLine();
                                        System.out.println("Color actual: "+chaquetas[(opcion2-1)].getColor());
                                        chaquetas[(opcion2-1)].setColor(sc.nextLine());
                                    break;
                                case 3: sc.nextLine();
                                        System.out.println("Talla actual: "+chaquetas[(opcion2-1)].getTalla());
                                         chaquetas[(opcion2-1)].setTalla(sc.nextLine());
                                    break;
                                default:System.out.println("La opción no es válida.");
                                    break;
                            }
                            System.out.println("---------------------------------");
                    } while(opcion3<1 || opcion3>atributosObjetos.length);
                    break;
                case 2: // Para Camisetas
                    do{
                        for (int i = 0 ; i<camisetas.length ; i++){
                            System.out.println((i+1) + ". " + camisetas[i].imprimirDetalles());
                        }
                        System.out.print("Opción: ");
                        opcion2 = sc.nextInt();
                        System.out.println("---------------------------------");
                        if (opcion2<1 || opcion2>camisetas.length){
                            System.out.println("La opción no es válida.");
                        }
                    } while (opcion2<1 || opcion2>camisetas.length);
                    do{
                        atributos();
                        System.out.print("Opción: ");
                        opcion3 = sc.nextInt();
                        System.out.println("---------------------------------");
                            switch (opcion3) {
                                case 1: sc.nextLine();
                                        System.out.println("Tipo actual: "+camisetas[(opcion2-1)].getTipo());
                                        camisetas[(opcion2-1)].setTipo(sc.next());
                                    break;
                                case 2: sc.nextLine();
                                        System.out.println("Color actual: "+camisetas[(opcion2-1)].getColor());
                                        camisetas[(opcion2-1)].setColor(sc.next());
                                    break;
                                case 3: sc.nextLine();
                                        System.out.println("Talla actual: "+camisetas[(opcion2-1)].getTalla());
                                        camisetas[(opcion2-1)].setTalla(sc.next());
                                    break;
                                default:System.out.println("La opción no es válida.");
                                    break;
                            }
                            System.out.println("---------------------------------");
                    } while(opcion3<1 || opcion3>atributosObjetos.length);
                    break;
                case 3: // Para Pantalones
                    do{
                        for (int i = 0 ; i<chaquetas.length ; i++){
                            System.out.println((i+1) + ". " + chaquetas[i].imprimirDetalles());
                        }
                        System.out.print("Opción: ");
                        opcion2 = sc.nextInt();
                        System.out.println("---------------------------------");
                        if (opcion2<1 || opcion2>chaquetas.length){
                            System.out.println("La opción no es válida.");
                        }
                    } while (opcion2<1 || opcion2>chaquetas.length);
                    do{
                        atributos();
                        System.out.print("Opción: ");
                        opcion3 = sc.nextInt();
                        System.out.println("---------------------------------");
                            switch (opcion3) {
                                case 1: sc.nextLine();
                                        System.out.println("Tipo actual: "+chaquetas[(opcion2-1)].getTipo());
                                        chaquetas[(opcion2-1)].setTipo(sc.next());
                                    break;
                                case 2: sc.nextLine();
                                        System.out.println("Color actual: "+chaquetas[(opcion2-1)].getColor());
                                        chaquetas[(opcion2-1)].setColor(sc.next());
                                    break;
                                case 3: sc.nextLine();
                                        System.out.println("Talla actual: "+chaquetas[(opcion2-1)].getTalla());
                                        chaquetas[(opcion2-1)].setTalla(sc.next());
                                    break;
                                default:System.out.println("La opción no es válida.");
                                    break;
                            }
                            System.out.println("---------------------------------");
                    } while(opcion3<1 || opcion3>atributosObjetos.length);
                    break;
                case 4: // Para Zapatos
                    do{
                        for (int i = 0 ; i<zapatos.length ; i++){
                            System.out.println((i+1) + ". " + zapatos[i].imprimirDetalles());
                        }
                        System.out.print("Opción: ");
                        opcion2 = sc.nextInt();
                        System.out.println("---------------------------------");
                        if (opcion2<1 || opcion2>zapatos.length){
                            System.out.println("La opción no es válida.");
                        }
                    } while (opcion2<1 || opcion2>zapatos.length);
                    do{
                        atributos();
                        System.out.print("Opción: ");
                        opcion3 = sc.nextInt();
                        System.out.println("---------------------------------");
                            switch (opcion3) {
                                case 1: sc.nextLine();
                                        System.out.println("Tipo actual: "+zapatos[(opcion2-1)].getTipo());
                                        zapatos[(opcion2-1)].setTipo(sc.next());
                                    break;
                                case 2: sc.nextLine();
                                        System.out.println("Color actual: "+zapatos[(opcion2-1)].getColor());
                                        zapatos[(opcion2-1)].setColor(sc.next());
                                    break;
                                case 3: sc.nextLine();
                                        System.out.println("Talla actual: "+zapatos[(opcion2-1)].getTalla());
                                        zapatos[(opcion2-1)].setTalla(sc.next());
                                    break;
                                default:System.out.println("La opción no es válida.");
                                    break;
                            }
                            System.out.println("---------------------------------");
                    } while(opcion3<1 || opcion3>atributosObjetos.length);
                    break;
                case 5: System.out.println("Volviendo al menú...");
                    break;
                default: System.out.println("La opción no es válida.");
                    break;
                }
                System.out.println("---------------------------------");
        }while (opcion!=5);
    }

    /** JD atributos
     * Impresión por consola del array atributosObjetos, para reducir línea de código y dejarlo más limpio.
     */
    private void atributos(){
        for (int i = 0 ; i<atributosObjetos.length ; i++){
            System.out.println((i+1)+". "+atributosObjetos[i]);
        }
    }

    /** JD modificarPrecio
     * Preguntamos al usuario de qué producto quiere modificar el precio, para ello recorremos el array 
     * de objetos para mostrar los tipos de productos. Después en cada opción, se escoge el producto
     * concreto a modificar su precio, llamando al método setPrecio. 
     * @param sc variable Scanner traída del main.
     */
    protected void modificarPrecio(Scanner sc) {
        int opcion = 0;
    
        do {
        System.out.println("De qué tipo de producto quieres modificar el precio?");
        for (int i = 0; i<menuObjetos.length;i++) {
            System.out.println((i+1) + ". " + menuObjetos[i]);
        }
        System.out.print("Opción: ");
        opcion = sc.nextInt();
        System.out.println("---------------------------------");
        switch (opcion) {
            case 1 : for (int i = 0; i <chaquetas.length; i++){
                System.out.println((i+1) + ". " + chaquetas[i].imprimirDetalles());
                }
                System.out.print("Opción: ");
                opcion= sc.nextInt();
                System.out.print("¿Nuevo precio?");
                chaquetas[opcion-1].setPrecio(sc.nextDouble());
                break;
            case 2 : for (int i = 0; i<camisetas.length; i++){
                System.out.println((i+1) + ". " + camisetas[i].imprimirDetalles());
                }
                System.out.print("Opción: ");
                opcion= sc.nextInt();
                System.out.print("¿Nuevo precio?");
                camisetas[opcion-1].setPrecio(sc.nextDouble());
                break;
            case 3 : for (int i = 0; i<pantalones.length; i++){
                System.out.println((i+1) + ". " + pantalones[i].imprimirDetalles());
                }
                System.out.print("Opción: ");
                opcion= sc.nextInt();
                System.out.print("¿Nuevo precio?");
                pantalones[opcion-1].setPrecio(sc.nextDouble());
                break;
            case 4 : for (int i = 0 ; i<zapatos.length; i++) {
                System.out.println((i+1) + ". " + zapatos[i].imprimirDetalles());
                }
                System.out.print("Opción: ");
                opcion= sc.nextInt();
                System.out.print("¿Nuevo precio?");
                zapatos[opcion-1].setPrecio(sc.nextDouble());
                break;
            case 5: System.out.println("Volviendo a menú anterior");
                break;
            default: System.out.println("Opción no válida");
                break;
            }
            System.out.println("---------------------------------");
        } while (opcion!=5);
    }

    /** JD modificarCantidad
     * Preguntamos al usuario de qué producto quiere modificar la cantidad, para ello recorremos el array 
     * de objetos para mostrar los tipos de productos. Después en cada opción, se escoge el producto
     * concreto a modificar su cantidad, llamando al método setCantidad.
     * @param sc variable Scanner traída del main
     */
    protected void modificarCantidad(Scanner sc) {
        int opcion = 0;
    
        do {
        System.out.println("De qué tipo de producto quieres modificar el precio?");
        for (int i = 0; i<menuObjetos.length;i++) {
            System.out.println((i+1) + ". " + menuObjetos[i]);
        }
        System.out.print("Opción: ");
        opcion = sc.nextInt();
        System.out.println("---------------------------------");
        switch (opcion) {
            case 1 : for (int i = 0; i <chaquetas.length; i++){
                System.out.println((i+1) + ". " + chaquetas[i].imprimirDetalles());
                }
                System.out.print("Opción: ");
                opcion= sc.nextInt();
                System.out.print("¿Cantidad actual del producto?");
                chaquetas[opcion-1].setCantidad(sc.nextInt());
                break;
            case 2 : for (int i = 0; i<camisetas.length; i++){
                System.out.println((i+1) + ". " + camisetas[i].imprimirDetalles());
                }
                System.out.print("Opción: ");
                opcion= sc.nextInt();
                System.out.print("¿Cantidad actual del producto?");
                camisetas[opcion-1].setCantidad(sc.nextInt());
                break;
            case 3 : for (int i = 0; i<pantalones.length; i++){
                System.out.println((i+1) + ". " + pantalones[i].imprimirDetalles());
                }
                System.out.print("Opción: ");
                opcion= sc.nextInt();
                System.out.print("¿Cantidad actual del producto?");
                pantalones[opcion-1].setCantidad(sc.nextInt());
                break;
            case 4 : for (int i = 0 ; i<zapatos.length; i++) {
                System.out.println((i+1) + ". " + zapatos[i].imprimirDetalles());
                }
                System.out.print("Opción: ");
                opcion= sc.nextInt();
                System.out.print("¿Cantidad actual del producto?");
                zapatos[opcion-1].setCantidad(sc.nextInt());
                break;
            case 5: System.out.println("Volviendo a menú anterior");
                break;
            default: System.out.println("Opción no válida");
                break;
            }
            System.out.println("---------------------------------");
        } while (opcion!=5);
    }

    /** JD obtenerDetalles
     * Este método se llamará desde el ProgramaMain, donde este realiza la función de imprimir todo el armario de un tipo de prenda o todo
     * el armario de prendas que dispone. A este método no se puede acceder si previamente no se han añadido los datos de los productos/clases.
     * @param sc Variable Scanner traída desde el ProgramaMain.
     */
    protected void obtenerDetalles(Scanner sc){
        int opcion = 0;
        System.out.println("---------------------------------");
        do {
            System.out.println("De qué tipo de producto quieres conocer los detalles?");
            System.out.println("0. Imprimir todos los productos.");
            for (int i = 0; i<menuObjetos.length;i++) {
                System.out.println((i+1) + ". " + menuObjetos[i]);
            }
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            System.out.println("---------------------------------");
            switch (opcion) {
                case 0: for (int i = 0; i <chaquetas.length; i++){
                            System.out.println((i+1) + ". " + chaquetas[i].imprimirDetalles());
                        }
                        System.out.println("---------------------------------");
                        for (int i = 0; i <camisetas.length; i++){
                            System.out.println((i+1) + ". " + camisetas[i].imprimirDetalles());
                        }
                        System.out.println("---------------------------------");
                        for (int i = 0; i <pantalones.length; i++){
                            System.out.println((i+1) + ". " + pantalones[i].imprimirDetalles());
                        }
                        System.out.println("---------------------------------");
                        for (int i = 0; i <zapatos.length; i++){
                            System.out.println((i+1) + ". " + zapatos[i].imprimirDetalles());
                        }
                    break;
                case 1 : for (int i = 0; i <chaquetas.length; i++){
                            System.out.println((i+1) + ". " + chaquetas[i].imprimirDetalles());
                        }
                    break;
                case 2 : for (int i = 0; i <camisetas.length; i++){
                            System.out.println((i+1) + ". " + camisetas[i].imprimirDetalles());
                        }
                    break;
                case 3 : for (int i = 0; i <pantalones.length; i++){
                            System.out.println((i+1) + ". " + pantalones[i].imprimirDetalles());
                        }
                    break;
                case 4 : for (int i = 0; i <zapatos.length; i++){
                            System.out.println((i+1) + ". " + zapatos[i].imprimirDetalles());
                        }
                    break;
                case 5: System.out.println("Volviendo al menú anterior.");
                    break;
                default: System.out.println("La opción no es válida.");
                    break;
            }
            System.out.println("---------------------------------");
        } while (opcion!=5);
    }
}