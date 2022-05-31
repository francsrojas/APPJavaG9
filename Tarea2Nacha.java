import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class App2 {
    public static int Main (String[] args) {
        BufferedReader lectura = null;
        lectura = new BufferedReader(new FileReader("inventario.csv"));
        String linea = lectura.readLine();
        total_Libros = new ArrayList<Libros>();
        while (linea != null) {
            String[] variable = line.split(",");
            libro.setLibro(variable[0], variable[1], variable[2], variable[3], variable[4], variable[5], variable[6], variable[7]);
            total_Libros.add(libro);
        }
        boolean = true;
        while (boolean==true){

            System.out.println("Bienvenido al menú de Bibliotecas UAI");
            System.out.println("Ingrese la acción que desea realizar:\n" +
                    "1. Agregar un libro nuevo \n" +
                    "2. Quitar un libro \n" +
                    "3. Agregar una sede\n" +
                    "4. Quitar una sede\n" +
                    "5. Editar un libro\n" +
                    "6. Cambiar libro de sede, sección o piso\n" +
                    "7. Agregar sección\n" +
                    "8. Eliminar sección\n" +
                    "9. Agregar piso\n" +
                    "10. Eliminar piso\n" +
                    "11. Buscar un libro\n");

            Scanner myObj = new Scanner(System.in);
            opcion = myObj.nextLine();

            if (opcion =="1") {

            }
            if (opcion =="2") {

            }
            if (opcion =="3") {
                crear_Sede();
            }
            if (opcion =="4") {

            }
            if (opcion =="5") {

            }
            if (opcion =="6") {

            }
            if (opcion =="6") {

            }
            if (opcion =="7") {

            }
            if (opcion =="8") {

            }
            if (opcion =="9") {
                crear_Piso();
            }
            if (opcion =="10") {

            }
            if (opcion =="11") {
                System.out.println("Ingrese el libro que desea buscar: \n");
                Scanner this myObj = new Scanner(System.in);
                LibroABuscar = myObj.nextLine();
                buscar_Libro(LibroABuscar, lectura);
            }

            System.out.println("¿Desea realizar otra acción?");
            Scanner myObj = new Scanner(System.in);
            opcion2 = myObj.nextLine();

            if (opcion2=="No"||opcion2="no"){
                boolean=false;
            }
           if (boolean==false){
               exit();
            }
        }
    }
}
