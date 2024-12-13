import java.util.Scanner;

/**
 * The type Gym app.
 * Clase GymApp, donde contiene el Main y el menu Inicial
 */
public class GymApp {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * Este es el main que contiene el Scanner y el metodo Menu
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu(sc);
        sc.close();
    }

    /**
     * Menu.
     *
     * @param sc the sc
     * Metodo Menu que contiene las Opciones/Servicios de nuestra App
     */
    public static void menu(Scanner sc) {
        MaquinasMusculo maquinas = new MaquinasMusculo();
        Suplementos suplementos = new Suplementos();
        ServiciosPersonales serv = new ServiciosPersonales();
        TarifasAsistente tarifasAsistente = new TarifasAsistente();
        RecetasFittnes recetasFittnes = new RecetasFittnes();

        System.out.println("Bienvenido a la aplicacion del GYM");
        int opcion;

        do {
            System.out.println();
            System.out.println("ELIGE UNA OPCION DE 1-6");
            System.out.println("1.Horario De Los Entrenadores");
            System.out.println("2.Entrenamiento para cada grupo muscular");
            System.out.println("3.Tarifas");
            System.out.println("4.Recetas Fitness");
            System.out.println("5.Suplementos");
            System.out.println("6.Salir de la APP");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    serv.serviciosArrays(sc);
                    break;
                case 2:
                    maquinas.declaracionarrys(sc);
                    break;
                case 3:
                    tarifasAsistente.menuInicial(sc);
                    break;
                case 4:
                    recetasFittnes.mostrarelegit(sc);
                    break;
                case 5:
                    suplementos.declaracionarrys2(sc);
                    break;
                case 6:
                    System.out.println("Gracias por ver la App, hasta la proxima");
                    break;
                default:
                    System.out.println("Opcion no valida en la APP");
                    break;
            }
        } while (opcion != 6);
    }
}
