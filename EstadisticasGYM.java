import java.util.Scanner;

public class EstadisticasGYM {
    public void arraysEstadisticas(){
        Scanner sc = new Scanner(System.in);
        String[] nuevosUsuarios = new String[10];
        nuevosUsuarios[0] = "Lucia";
        nuevosUsuarios[1] = "Jose";
        nuevosUsuarios[2] = "David";
        nuevosUsuarios[3] = "Alex";
        nuevosUsuarios[4] = "Raul";
        nuevosUsuarios[5] = "Abdelati";
        nuevosUsuarios[6] = "Maria";
        nuevosUsuarios[7] = "Jaime";
        nuevosUsuarios[8] = "Mario";
        nuevosUsuarios[9] = "Pedro";

        String[] totalUsuarios = new String[20];
        totalUsuarios[0] = "Lucia";
        totalUsuarios[1] = "Jose";
        totalUsuarios[2] = "David";
        totalUsuarios[3] = "Alex";
        totalUsuarios[4] = "Raul";
        totalUsuarios[5] = "Abdelati";
        totalUsuarios[6] = "Maria";
        totalUsuarios[7] = "Jaime";
        totalUsuarios[8] = "Mario";
        totalUsuarios[9] = "Pedro";
        totalUsuarios[10] = "Tomas";
        totalUsuarios[11] = "Manuel";
        totalUsuarios[12] = "Andres";
        totalUsuarios[13] = "Alberto";
        totalUsuarios[14] = "Francisco";
        totalUsuarios[15] = "Juan";
        totalUsuarios[16] = "Laura";
        totalUsuarios[17] = "Ana";
        totalUsuarios[18] = "Monica";
        totalUsuarios[19] = "Arnau";

        Estadisticas1 est = new Estadisticas1(nuevosUsuarios, totalUsuarios);
        //GymApp volver = new GymApp();

        int menu;
        do {
            System.out.println("Menu:");
            System.out.println("1. Nuevos Usuarios de 3 meses");
            System.out.println("2. Total de Usuarios de 6 meses");
            System.out.println("4. Volver atras");
            System.out.print("Elige una opcion: ");

            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    est.mostrarNuevos();
                    break;
                case 2:
                    est.mostrarTotal();
                    break;
                case 3:
                    //volver.menu(sc);
                    break;
                default:
                    System.out.println("Opcion Invalida.");
            }
        } while (menu != 3);
        sc.close();
    }
}
