import java.io.FileNotFoundException;

public class manin {
    public static void main(String[] args) throws FileNotFoundException {
        ColeccionDatos cd=new ColeccionDatos();
        cd.LecturaArchivo("ejemplo.txt");
    }
}
