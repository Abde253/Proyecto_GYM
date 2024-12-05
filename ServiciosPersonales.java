import java.util.Scanner;

public class ServiciosPersonales {
    public void arraysServicios() {
        Scanner sc = new Scanner(System.in);
        String[] horarioJose = new String[4];
        horarioJose[0] = "Crossfit";
        horarioJose[1] = "Pilates";
        horarioJose[2] = "Lunes: 9:00 - 21:00";
        horarioJose[3] = "Miercoles: 10:00 - 22:00";


        String[] horarioMaria = new String[4];
        horarioMaria[0] = "Clase de HIT";
        horarioMaria[1] = "Clase de GAP";
        horarioMaria[2] = "Martes: 10:00 - 20:00";
        horarioMaria[3] = "Jueves: 12:00 - 22:00";

        String[] horarioJuan = new String[4];
        horarioJuan[0] = "Crossfit";
        horarioJuan[1] = "Clase de HIT";
        horarioJuan[2] = "Viernes: 9:00 - 22:00";
        horarioJuan[3] = "Sabado: 9:00 - 17:00";

        Servicios1 serv = new Servicios1(horarioJose, horarioMaria, horarioJuan);
        //GymApp volver = new GymApp();

        int menu;
        do {
            System.out.println("Menu:");
            System.out.println("1. Jose");
            System.out.println("2. Maria");
            System.out.println("3. Juan");
            System.out.println("4. Volver atras");
            System.out.print("Elige una opcion: ");

            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    serv.horarioJose1();
                    break;
                case 2:
                    serv.horarioMaria1();
                    break;
                case 3:
                    serv.horarioJuan1();
                    break;
                case 4:
                    //volver.menu(sc);
                    break;
                default:
                    System.out.println("Opcion Invalida.");
            }
        } while (menu != 4);

        sc.close();
    }
}
