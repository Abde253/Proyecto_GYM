import java.util.Scanner;

/**
 * The type Suplementos.
 * Esta es la clase que contiene el metodo que almacena los diferentes suplementos y donde comprarlos
 */
public class Suplementos {
    /**
     * Declaracionarrys 2.
     *
     * @param sc the sc
     * Este es el metodo que contiene los arrays con la informacion de cada suplemento (web/marca/precio)
     * Estos arrays se recorren con un Bucle For
     */
    public void declaracionarrys2(Scanner sc) {
        String[] creatina = new String[3];
        creatina[0] = "-MyProtein por 13 euros-";
        creatina[1] = "-Prozis- por 12,55 euros";
        creatina[2] = "-HSN- por 10 euros";

        String[] proteina = new String[3];
        proteina[0] = "-MyProtein por 35 euros-";
        proteina[1] = "-Prozis por 37,55 euros-";
        proteina[2] = "-HSN por 36 euros-";

        String[] multivitaminico = new String[3];
        multivitaminico[0] = "-MyProtein por 6,23 euros-";
        multivitaminico[1] = "-Prozis por 6,14 euros-";
        multivitaminico[2] = "-HSN por 4,44 euros-";

        String[] omega3 = new String[3];
        omega3[0] = "-MyProtein por 3,33 euros-";
        omega3[1] = "-Prozis por 2,36 euros-";
        omega3[2] = "-HSN por 2,20 euros-";

        int opcion2;

        do {
            System.out.println();
            System.out.println("ELIGE EL SUPLEMENTO");
            System.out.println("1. Creatina");
            System.out.println("2. Proteina");
            System.out.println("3. Multivitaminico");
            System.out.println("4. Omega3");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");

            opcion2 = sc.nextInt();

            switch (opcion2) {
                case 1:
                System.out.println();
                    System.out.println("~Puedes encontrarlo en:");
                    for (int i = 0; i < creatina.length; i++) {
                        System.out.println(creatina[i]);
                    }
                    break;
                case 2:
                System.out.println();
                    System.out.println("~Puedes encontrarlo en:");
                    for (int i = 0; i < proteina.length; i++) {
                        System.out.println(proteina[i]);
                    }
                    break;
                case 3:
                System.out.println();
                    System.out.println("~Puedes encontrarlo en:");
                    for (int i = 0; i < multivitaminico.length; i++) {
                        System.out.println(multivitaminico[i]);
                    }
                    break;
                case 4:
                System.out.println();
                    System.out.println("~Puedes encontrarlo en:");
                    for (int i = 0; i < omega3.length; i++) {
                        System.out.println(omega3[i]);
                    }
                    break;
                case 5: System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("¡No tenemos ese Suplement!");
                    break;
            }
        } while (opcion2 != 5);
    }


}
