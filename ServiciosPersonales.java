import java.util.Scanner;

/**
 * The type Servicios personales.
 * Esta es la clase que contiene el metodo de servicios/entrenamientos/horarios de los entrenadores
 */
public class ServiciosPersonales {
    /**
     * Servicios arrays.
     *
     * @param sc the sc
     * Este es el metodo que contiene los arrays con la informacion de cada entrenador (servicios/entrenamientos/horarios)
     * Estos arrays se recorren con un Bucle For
     */
    public void serviciosArrays(Scanner sc){
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

        int opcion;
        do {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Jose");
            System.out.println("2. Maria");
            System.out.println("3. Juan");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1: 
                System.out.println();
                System.out.println("Este es el horario de Jose");
                    for (int i = 0; i < horarioJose.length; i++) {
                    System.out.println(horarioJose[i]);
                }
                    break;
                case 2: 
                System.out.println();
                System.out.println("Este es el horario de Maria");
                    for (int i = 0; i < horarioMaria.length; i++) {
                    System.out.println(horarioMaria[i]);
                }
                    break;
                case 3: 
                System.out.println();
                System.out.println("Este es el horario de Juan");
                    for (int i = 0; i < horarioJuan.length; i++) {
                    System.out.println(horarioJuan[i]);
                }
                    break;
                case 4: System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion Invalida.");
                    break;
            }
        } while (opcion != 4);
    }
}
