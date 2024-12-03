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
        for (int i = 0 ; i < chaquetas.length ; i++){
            sc.nextLine();
            System.out.println("-------------------------------");
            System.out.println("--- Chaqueta " + (i+1) + " ---");
            System.out.println("-------------------------------");
            System.out.print("Tipo de la chaqueta: ");
            chaquetas[i].setTipo(sc.next());
            System.out.println("-------------------------------");
            System.out.print("Color de la chaqueta: ");
            chaquetas[i].setColor(sc.next());
            System.out.println("-------------------------------");
            System.out.print("Talla de la chaqueta: ");
            chaquetas[i].setTalla(sc.next());
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
            camisetas[i].setTipo(sc.next());
            System.out.println("-------------------------------");
            System.out.print("Color de la camiseta: ");
            camisetas[i].setColor(sc.next());
            System.out.println("-------------------------------");
            System.out.print("Talla de la camiseta: ");
            camisetas[i].setTalla(sc.next());
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
            pantalones[i].setTipo(sc.next());
            System.out.println("-------------------------------");
            System.out.print("Color del pantalón: ");
            pantalones[i].setColor(sc.next());
            System.out.println("-------------------------------");
            System.out.print("Talla del pantalón: ");
            pantalones[i].setTalla(sc.next());
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
            zapatos[i].setTipo(sc.next());
            System.out.println("-------------------------------");
            System.out.print("Color de los zapatos: ");
            zapatos[i].setColor(sc.next());
            System.out.println("-------------------------------");
            System.out.print("Talla de los zapatos: ");
            zapatos[i].setTalla(sc.next());
            System.out.println("-------------------------------");
            System.out.print("Cantidad de los zapatos(en pares): ");
            zapatos[i].setCantidad(sc.nextInt());
            System.out.println("-------------------------------");
            System.out.print("Precio de los zapatos: ");
            zapatos[i].setPrecio(sc.nextDouble());
            System.out.println("-------------------------------");      
        }
    }

    /** JD modificarProductos
     * Este método, cuando se le llame, pedirá al usuario varias opciones, siendo estas mostradas por consola. Según navegue el usuario, este
     * podrá modificar tres parámetros en esta opción los cuales son: Tipo, Talla y Color. También se incluirá la opción de volver al menú
     * previo en caso de no querer modificar nada.
     * @param sc Variable Scanner traída desde el ProgramaMain.
     */
    protected void modificarProductos (Scanner sc){
        int opcion=0, opcion2=0, opcion3 = 0;
        do{
            System.out.println("¿Qué tipo de prenda quieres modificar?");
            for (int i = 0 ; i<menuObjetos.length ; i++){
                System.out.println((i+1) + ". " + menuObjetos[i]);
            }
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: // Para las chaquetas.
                    do{
                        for (int i = 0 ; i<chaquetas.length ; i++){
                            System.out.println((i+1) + ". " + chaquetas[i].imprimirDetalles());
                        }
                        System.out.print("Opción: ");
                        opcion2 = sc.nextInt();
                        if (opcion2<1 || opcion2>chaquetas.length){
                            System.out.println("La opción no es válida.");
                        }
                    } while (opcion2<1 || opcion2>chaquetas.length);
                    do{
                        atributos();
                        System.out.print("Opción: ");
                        opcion3 = sc.nextInt();
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
                    } while(opcion3<1 || opcion3>atributosObjetos.length);
                    break;
                case 2: // Para Camisetas
                    do{
                        for (int i = 0 ; i<camisetas.length ; i++){
                            System.out.println((i+1) + ". " + camisetas[i].imprimirDetalles());
                        }
                        System.out.print("Opción: ");
                        opcion2 = sc.nextInt();
                        if (opcion2<1 || opcion2>camisetas.length){
                            System.out.println("La opción no es válida.");
                        }
                    } while (opcion2<1 || opcion2>camisetas.length);
                    do{
                        atributos();
                        System.out.print("Opción: ");
                        opcion3 = sc.nextInt();
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
                    } while(opcion3<1 || opcion3>atributosObjetos.length);
                    break;
                case 3: // Para Pantalones
                    do{
                        for (int i = 0 ; i<chaquetas.length ; i++){
                            System.out.println((i+1) + ". " + chaquetas[i].imprimirDetalles());
                        }
                        System.out.print("Opción: ");
                        opcion2 = sc.nextInt();
                        if (opcion2<1 || opcion2>chaquetas.length){
                            System.out.println("La opción no es válida.");
                        }
                    } while (opcion2<1 || opcion2>chaquetas.length);
                    do{
                        atributos();
                        System.out.print("Opción: ");
                        opcion3 = sc.nextInt();
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
                    } while(opcion3<1 || opcion3>atributosObjetos.length);
                    break;
                case 4: // Para Zapatos
                    do{
                        for (int i = 0 ; i<zapatos.length ; i++){
                            System.out.println((i+1) + ". " + zapatos[i].imprimirDetalles());
                        }
                        System.out.print("Opción: ");
                        opcion2 = sc.nextInt();
                        if (opcion2<1 || opcion2>zapatos.length){
                            System.out.println("La opción no es válida.");
                        }
                    } while (opcion2<1 || opcion2>zapatos.length);
                    do{
                        atributos();
                        System.out.print("Opción: ");
                        opcion3 = sc.nextInt();
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
                    } while(opcion3<1 || opcion3>atributosObjetos.length);
                    break;
                case 5: System.out.println("Volviendo al menú...");
                    break;
                default: System.out.println("La opción no es válida.");
                    break;
                }
        }while (opcion<1 || opcion>menuObjetos.length);
    }

    /** JD atributos
     * Impresión por consola del array atributosObjetos, para reducir línea de código y dejarlo más limpio.
     */
    private void atributos(){
        for (int i = 0 ; i<atributosObjetos.length ; i++){
            System.out.println((i+1)+". "+atributosObjetos[i]);
        }
    }
}
