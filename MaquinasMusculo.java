import java.util.Scanner;

public class MaquinasMusculo {

    public void declaracionarrys(){
        Scanner sc = new Scanner(System.in);
        String [] musculopecho = new String[4];
        musculopecho[0] = "Press Banca, 4 Sets, 6-8 Reps, 4-5 Min descanso";
        musculopecho[1] = "Press Inclinado 30º mancurnas, 2 Sets, 8-10 Reps, 3-4 Min descanso ";
        musculopecho[2] = "Press Inclinado Maquina 45 º, 2 Sets, 8-10 Reps, 3-4 Min descanso ";
        musculopecho[3] = "Aperturas poleas, 2 Sets, 8-10 Reps, 3 Min descanso ";

        String [] musculoespalda = new String[4];
        musculoespalda [0] = "Peso muerto, 4 Sets, 3-5 Reps, 4-5 Min descanso, (Bajada de peso despues de cada Set)";
        musculoespalda [1] = "Remo en T, 3 Sets, 6-8 Reps, 3-4 Min descanso";
        musculoespalda [2] = "Jalon al pecho prono, 3 Sets, 6-8 Reps, 3-4 Min descanso";
        musculoespalda [3] = "Pull over, 3 Sets, 8-10 Reps, 3-4 Min descanso ";

        String [] musculopierna = new String[6];
        musculopierna [0] = "-Sentadilla, 4 Sets, 3-6 Reps, 4-6 Min descanso-";
        musculopierna [1] = "-Bulgara, 2 Sets, 6-8 Reps, 3-5 Min descanso-";
        musculopierna [2] = "-Aductor, 3 Sets, 6-10 Reps, 3-4 Min descanso-";
        musculopierna [3] = "-Extension cuadriceps, 3 Sets, 6-10 Reps, 3-4 Min descanso-";
        musculopierna [4] = "-Curl Femoral, 3 Sets, 6-10 Reps, 3-4 Min descanso-";
        musculopierna [5] = "-Gemelo levantado, 2 Sets, 6-10 Reps, 3-4 Min descanso-";

        String [] musculobrazo = new String[6];
        musculobrazo [0] ="Press milirar, 3 Sets, 6-10 Reps, 3-4 Min descanso";
        musculobrazo [1] ="Elevaciones laterales, 3 Sets, 6-10 Reps, 3-4 Min descanso";
        musculobrazo [2] ="Curl Martillo, 3 Sets, 6-10 Reps, 3-4 Min descanso";
        musculobrazo [3] ="Curl ballesian, 3 Sets, 6-10 Reps, 3-4 Min descanso ";
        musculobrazo [4] ="Press frances, 3 Sets, 6-10 Reps, 3-4 Min descanso";
        musculobrazo [5] ="Extension en polea, 3 Sets, 6-10 Reps, 3-4 Min descanso ";

        MaquinasMusculo1 maquina1 = new MaquinasMusculo1(musculopecho, musculoespalda,musculopierna,musculobrazo);
        GymApp voler = new GymApp();

        int opcion1;


        do{
            System.out.println("Bienvenido al selector de musculos ");
            System.out.println("Elige el musculo que quieres entrenar: ");
            System.out.println("1.Musculos de Pecho ");
            System.out.println("2.Musculos Espalda ");
            System.out.println("3.Musculos Pierna ");
            System.out.println("4.Musculos Brazo ");
            System.out.println("5.Volver al menu Inical ");

            opcion1 = sc.nextInt();

            switch (opcion1){
                case 1:
                    maquina1.pecho();
                    break;
                case 2:
                    maquina1.spalda();
                    break;
                case 3:
                    maquina1.pierna();
                    break;
                case 4:
                    maquina1.brazo();
                    break;
                    case 5:
                    voler.menu(sc);
                        break;
                default:
            }
        }while (opcion1 != 6);

        sc.close();
    }


}
