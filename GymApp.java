import java.util.Scanner;

public class GymApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GymApp gymApp = new GymApp();
        gymApp.menu(sc);

        sc.close();
    }

    public void menu(Scanner sc) {

        MaquinasMusculo maquinas = new MaquinasMusculo();
        SuplementosGadgets suplementosGadgets = new SuplementosGadgets();

        System.out.println("Bienvenido a la aplicaicon del GYM");
        int opcion;
        do {
            System.out.println("Elige un Servicio del 1-5");
            System.out.println("1. Servicios Personales ");
            System.out.println("2. Entrenamiento para cada grupo muscular  ");
            System.out.println("3. Tarifas (Asistente) ");
            System.out.println("4. Estasdisticas del gym  ");
            System.out.println("5. Suplementos/Gadgets");
            System.out.println("6. Salir de la APP");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    //Opcion1
                    break;
                case 2:
                    maquinas.declaracionarrys();
                    break;
                case 3:
                    //Opcion1
                    break;
                case 4:
                    //Opcion1
                    break;
                case 5:
                    suplementosGadgets.definirarrys();
                    break;
                case 6:
                    System.out.println("Gracias por ver la App, asta la proxima");
                    break;
                default:
                    System.out.println("Opcion no valida en la APP");

            }

        } while (opcion != 6);

    }
}
