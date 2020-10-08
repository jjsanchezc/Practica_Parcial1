import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class ColeccionDatos {

    int contador = 0;// hará el trabajo de contar las filas que hay en el .txt
    int columnas = 0;
    String[][] arreglo;
    String[] tmpColumn;
    String[] tmpFilas;
    // crear un arreglo con n numero de filas(las que lea)
    // y con m columnas(las que lea x2)



    


    /*este metodo funciona para leer 
    y definir el tamaño del arreglo */
    protected void LecturaArchivo(String Archivo) throws FileNotFoundException {
        Scanner Dato0 = new Scanner(new File(Archivo));
        while (Dato0.hasNextLine()) {
            String line = Dato0.nextLine();
            line = line.replace(";", " ");
            Scanner lineScan = new Scanner(line);
            String linea = lineScan.next();
            if (contador == 0) {
                do {
                    columnas++;
                    String aux= lineScan.next();
                }while (lineScan.hasNext());
            }
            contador++;
            lineScan.close();
        }
        columnas=columnas+1;
        arreglo = new String[contador][columnas];// contador][columnas];
        System.out.println("Fueron encontrados: " + contador + " estudiantes de manera correcta, y cada uno tiene: "+columnas+" datos");
        Dato0.close();
        Asignar();
    }

    /**este metodo debe de asignar cada valor a cada espacio del arreglo */
    public void Asignar(){
        tmpColumn=new String[columnas];
        tmpFilas=new String[contador];
        for(int i=0; i<tmpFilas.length - 1; i++) {
            for(int j=0;j<tmpColumn.length-1;j++){
                arreglo[i][j]="234";
            }
        }
    }
}