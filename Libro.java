import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Acciones_Libro{

    private static Scanner x;


    public static void buscar_Libro(String LibroABuscar, String file) throws FileNotFoundException {
        boolean found = false;
        String titulo = "";
        String autor = "";
        String anio = "";
        String estante_numero = "";
        String estante_seccion = "";
        String piso = "";
        String edificio = "";
        String sede = "";

        x = new Scanner(new File("inventario.csv"));
        x.useDelimiter("[,\n]");

        while ((x.hasNext() && found) == false) {
            titulo = x.next();
            autor = x.next();
            anio = x.next();
            estante_numero = x.next();
            estante_seccion = x.next();
            piso = x.next();
            edificio = x.next();
            sede = x.next();

            if (titulo.equals(LibroABuscar)) {
                found = true;
            }

            if (found ==true) {
                System.out.println("titulo: "+ titulo +"autor: "+ autor +"año: " + anio + "núm. estante: " + estante_numero+ "sec. estante: " + estante_seccion + "piso: " +piso+"edificio: "+ edificio+"sede: " +sede);
            }
        }
    }

    public static void crear_Libro(class Libro, file){
        System.out.println("Ingrese el titulo; \n");
        String titulo_nuevo = scan.nextLine();
        System.out.println("Ingrese el autor; \n");
        String autor_nuevo = scan.nextLine();
        System.out.println("Ingrese el año; \n");
        String anio_nuevo = scan.nextLine();
        System.out.println("Ingrese el num. de estante; \n");
        String num_est_nuevo = scan.nextLine();
        System.out.println("Ingrese la sec. de estante; \n");
        String sec_est_nuevo = scan.nextLine();
        System.out.println("Ingrese el piso; \n");
        String piso_nuevo = scan.nextLine();
        System.out.println("Ingrese el edificio; \n");
        String edificio_nuevo = scan.nextLine();
        System.out.println("Ingrese la sede; \n");
        String sede_nuevo = scan.nextLine();
        Libros nuevo = new Libros();
        nuevo.setLibro(titulo_nuevo, autor_nuevo, anio_nuevo, est_num_nuevo, est_sec_nuevo, piso_nuevo, edificio_nuevo, sede_nuevo);

        System.out.println("Listo!");
    }
}
