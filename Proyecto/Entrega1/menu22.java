import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class menu22{
    private ArrayList<Dato2>da;
    private Scanner sc;
    private ColeccionDatos cd;
    String pre = "Ingrese el numero ";
    String ac = " para: ";

    String total = pre + "1" + ac + "buscar y leer un archivo o fichero\n" + pre + "2" + ac
            + "mostrar en pantalla el número de datos en la colección\n" + pre + "3" + ac + "ver menú nuevamente\n"
            + pre + "0" + ac + "cerrar el programa.\n";

    /**
     * Constructor menu. Se crean instancias de colecciones a usar en la clase
     */
    public menu22() {
        cd = new ColeccionDatos();
        da = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    /**
     * Método menu1. Este método tiene las opciones que el programa ofrece al
     * usuario por medio del System.out.println() se muestra en pantalla dichas
     * posibilidades El Método retorna la opción digitada por el usuario
     */
    public int menu1() {
        // aca debe de imprimr cada opcion
        System.out.println(total);
        
        int opcion=sc.nextInt();
        return opcion;
    }

    /**
     * Método opcionMenu. Este método opera de acuerdo a la opción digitada. En él
     * se instancian los objetos de nuestro sistema y se invocan los métodos con
     * fines específicos.
     */
    public void opcionMenu(int opcii) {
        while (opcii > 0) {
            switch (opcii) {
                case 0:
                    System.out.println("Gracias por usar el programa, hasta la proxima");
                    System.exit(0);
                    break;

                case 1:
                    try {
                        System.out.println("Ingresar nombre del archivo txt a leer: ");
                        String name = sc.next();
                        cd.LecturaArchivo(name);
                    } catch (FileNotFoundException e) {
                        System.out.println("El archivo buscado no existe " + e.getMessage());
                    }                   
                    break;
                    
                case 2:
                    System.out.println(total);
                    break;

                    case 3:
                System.out.println(total);
                break;
                    
                default:
                    System.out.println("El numero digitado no está entre las opciones, intentar de nuevo");
                    break;
            }
            opcii = sc.nextInt();
        }
    }

    /**
     * Método principal. Donde se crea una instancia de tipo menu para poder
     * implementar el programa
     */
    public static void main(String args[]) {
        menu22 m1 = new menu22();
        m1.opcionMenu(m1.menu1());

    }
}