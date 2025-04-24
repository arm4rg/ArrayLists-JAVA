/*Librerías a utilizar*/
import java.util.Scanner;                               //Para ingresar datos por teclado
import java.util.ArrayList;                             //Para hacer uso de ArrayList
import java.util.Collections;                           //Para realizar un orden alfabético
import java.util.InputMismatchException;                //Para manejo de errores de ingreso de caracteres

/*Clase Principal */
public class App {
    public static Scanner sc = new Scanner(System.in);                                                  //Objeto para ingresar datos por teclado
    public static ArrayList<String> productos =  new ArrayList<String>();                               //Declaración de Arraylist
    
    /*Método para limpiar la consola */
    public static void LimpiarC()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /*Método agregar productos al arraylist */
    public static void AgregarP(){
        sc.nextLine();                  //Limpia la entrada de datos por teclado
        /*Ciclo mientras para agregar productos sin límites */
        while (true) {
            System.out.print("Ingrese nombre de producto a agregar (o ingrese 0 para salir): ");
            String producto = sc.nextLine();            //variable producto adquiere el valor ingresado por teclado
            if (producto.equalsIgnoreCase("0")) {           //Si se ingresa un número 0
                break;                  //Sale del ciclo 
            }
            productos.add(producto);                    //Si el valor ingresado no es 0 entonces agrega la cadena de datos ingresada
        }
     }
    
     /*Método para mostrar la lista de productos*/
    public static void MostrarList(){
        System.out.println("Elementos en la lista:");
        for (String producto : productos) {         //A la variable producto le asigna continuamente cada valor de cada casilla del arraylist
            System.out.println("-->" +producto);
        }
    }

    /*Método para eliminar productos*/
    public static void EliminarP(){
        sc.nextLine();
        System.out.println("Ingrese el nombre de los productos a eliminar (ingrese 0 al terminar): ");
        while (true) {
            String producto = sc.nextLine();        //la variable producto adquiere el valor ingresado por teclado  
            if (producto.equalsIgnoreCase("0")) {       //El ciclo termina si se ingresa un número 0
                break;
            }
            productos.remove(producto);         //Elimina el producto 
        }
    }

    /*Método para buscar productos*/
    public static void BuscarP(){
        String buscar;
        sc.nextLine();                              //Limpia el ingreso por el teclado
        System.out.print("Ingrese el nombre del producto a buscar: ");      
        buscar = sc.nextLine();                     //La variable adquiere el valor ingresado por teclado 
        boolean existe = productos.contains(buscar);
       
        System.out.println("¿La lista de compras contiene a '" + buscar + "'? " + existe); 
    }

    /*Método para ordenar la lista de productos*/
    public static void OrdenarList(){
        Collections.sort(productos);            //Ordena el arraylist
        System.out.println("La lista ordenada alfabeticamente es: " + productos);
    }

    /*Método para desplegar el menú*/
    public static void menu(){
        int Opcion=0;
        LimpiarC();                 //Limpia consola al iniciar ejecución
        /*Ciclo hacer mientras para desplegar el menú de opciones */
        do{
            System.out.println("***************************************************");
            System.out.println("                MENÚ");
            System.out.println("1)Agregar un producto a la lista");
            System.out.println("2)Mostrar la lista de compras");
            System.out.println("3)Eliminar un producto de la lista");
            System.out.println("4)Buscar un producto en la lista");
            System.out.println("5)Ordenar la lista de productos alfabéticamente");
            System.out.println("6)Salir");
            System.out.print("Seleccione una opción: ");

            /*Para capturar ingreso de caracteres no válidos */
            try {
                Opcion = sc.nextInt();
            } catch (InputMismatchException e) {            
                System.out.println("****Los caracteres ingresados no son válidos, ingrese nuevamente la opción.****");
                sc.next();      
                Opcion=0;
            }

            /*Seleccionar según opción ingresada */
            switch (Opcion) {
                case 1:
                    LimpiarC();             //Limpia la consola al entrar al método
                    AgregarP();         //Método de ingreso de productos
                    break;
                case 2:
                    LimpiarC();
                    MostrarList();      //Método para mostrar lista de productos
                    break;
                case 3:
                    LimpiarC();
                    EliminarP();        //Método para eliminar productos de la lista de productos
                    break;
                case 4:
                    LimpiarC();
                    BuscarP();          //Método para buscar productos en la lista
                    break;
                case 5:
                    LimpiarC();
                    OrdenarList();      //Método para ordenar la lista alfabeticamente
                    break;
                case 6:
                    sc.close();         //Cierra el objeto para ingresar datos por teclado
                    System.out.println("Saliendo del programa....");
                    break;
                default:
                    System.out.println("La opción seleccionada no es válida, ingrese una nuevamente");
                    break;
            }

        }while(Opcion !=6);     //El ciclo termina si la opción ingresada es igual a 6
    }

    public static void main(String[] args) throws Exception {
        menu();             //Método que dirige al menú
    }
}