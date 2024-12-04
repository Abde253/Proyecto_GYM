import java.util.Scanner;

public class GymApp {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    MaquinasMusculo maquinas = new MaquinasMusculo();

    System.out.println("Bienvenido a la aplicaicon del GYM");
    int opcion;
    do{
    System.out.println("Elige un Servicio del 1-5");
    System.out.println("1. Servicios Personales ");
    System.out.println("2. Maquinas para cada grupo muscular  ");
    System.out.println("3. Tarifas (Asistente) ");
    System.out.println("4. Estasdisticas del gym  ");
    System.out.println("5. Suplementos/Gadgets");

    opcion = sc.nextInt();

    switch(opcion){
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
                            //Opcion1
                            break;
                            default: System.out.println("Opcion no valida en la APP");

    }

    }while (opcion != 5);











    sc.close();
    }
}
