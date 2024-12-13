import java.util.Scanner;

/**
 * The type Maquinas musculo.
 * Esta es la clase contiene los entrenaminetos para cada grupos muscular
 */
public class MaquinasMusculo {
    /**
     * Declaracionarrys.
     *
     * @param sc the sc
     * Este es el metodo que contiene la informacion de cada entrenamiento muscular (pecho/espalda/pierna/brazos)
     *  Estos Arryas se recorren con un bucle for
     */
    public void declaracionarrys(Scanner sc) {
        String[] musculopecho = new String[4];
        musculopecho[0] = "1.Press Banca, 4 Sets, 6-8 Reps, 4-5 Min descanso.";
        musculopecho[1] = "2.Press Inclinado 30º mancuernas, 2 Sets, 8-10 Reps, 3-4 Min descanso.";
        musculopecho[2] = "3.Press Inclinado Maquina 45 º, 2 Sets, 8-10 Reps, 3-4 Min descanso.";
        musculopecho[3] = "4.Aperturas poleas, 2 Sets, 8-10 Reps, 3 Min descanso.";

        String[] musculoespalda = new String[4];
        musculoespalda[0] = "1.Peso muerto, 4 Sets, 3-5 Reps, 4-5 Min descanso, (Bajada de peso despues de cada Set).";
        musculoespalda[1] = "2.Remo en T, 3 Sets, 6-8 Reps, 3-4 Min descanso.";
        musculoespalda[2] = "3.Jalon al pecho prono, 3 Sets, 6-8 Reps, 3-4 Min descanso.";
        musculoespalda[3] = "4.Pull over, 3 Sets, 8-10 Reps, 3-4 Min descanso. ";

        String[] musculopierna = new String[6];
        musculopierna[0] = "1.Sentadilla, 4 Sets, 3-6 Reps, 4-6 Min descanso.";
        musculopierna[1] = "2.Bulgara, 2 Sets, 6-8 Reps, 3-5 Min descanso.";
        musculopierna[2] = "3.Aductor, 3 Sets, 6-10 Reps, 3-4 Min descanso.";
        musculopierna[3] = "4.Extension cuadriceps, 3 Sets, 6-10 Reps, 3-4 Min descanso.";
        musculopierna[4] = "5.Curl Femoral, 3 Sets, 6-10 Reps, 3-4 Min descanso.";
        musculopierna[5] = "6.Gemelo levantado, 2 Sets, 6-10 Reps, 3-4 Min descanso.";

        String[] musculobrazo = new String[6];
        musculobrazo[0] = "1.Press milirar, 3 Sets, 6-10 Reps, 3-4 Min descanso.";
        musculobrazo[1] = "2.Elevaciones laterales, 3 Sets, 6-10 Reps, 3-4 Min descanso.";
        musculobrazo[2] = "3.Curl Martillo, 3 Sets, 6-10 Reps, 3-4 Min descanso.";
        musculobrazo[3] = "4.Curl ballesian, 3 Sets, 6-10 Reps, 3-4 Min descanso.";
        musculobrazo[4] = "5.Press frances, 3 Sets, 6-10 Reps, 3-4 Min descanso";
        musculobrazo[5] = "6.Extension en polea, 3 Sets, 6-10 Reps, 3-4 Min descanso.";

        int opcion1;

        do {
            System.out.println();
            System.out.println("ELIGE UN MUSCULO: ");
            System.out.println("1. Musculos de Pecho");
            System.out.println("2. Musculos Espalda");
            System.out.println("3. Musculos Pierna");
            System.out.println("4. Musculos Brazo");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");

            opcion1 = sc.nextInt();

            switch (opcion1) {
                case 1:
                System.out.println();
                    System.out.println("Entrenamientos de pecho: ");
                    for (int i = 0; i < musculopecho.length; i++) {
                        System.out.println(musculopecho[i]);
                    }
                    break;
                case 2:
                System.out.println();
                    System.out.println("Entrenamientos de Espalda : ");
                    for (int i = 0; i < musculoespalda.length; i++) {
                        System.out.println(musculoespalda[i]);
                    }
                    break;
                case 3:
                System.out.println();
                    System.out.println("Entrenamientos de Pierna : ");
                    for (int i = 0; i < musculopierna.length; i++) {
                        System.out.println(musculopierna[i]);
                    }
                    break;
                case 4:
                System.out.println();
                    System.out.println("Entrenamientos de Brazo : ");
                    for (int i = 0; i < musculobrazo.length; i++) {
                        System.out.println(musculobrazo[i]);
                    }
                    break;
                case 5: System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("¡Este musculo proximamente!");
                    break;
            }
        } while (opcion1 != 5);
    }
}
