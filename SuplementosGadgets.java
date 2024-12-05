import java.util.Scanner;

public class SuplementosGadgets {

    public void definirarrys() {
        Scanner sc = new Scanner(System.in);
        //Arrys de Gadgets del gym
        String[] Cinturones = new String[5];
        Cinturones[0] = "1.Talla XS";
        Cinturones[1] = "2.Talla S";
        Cinturones[2] = "3.Talla M";
        Cinturones[3] = "4.Talla L";
        Cinturones[4] = "5.Talla XL";

        String[] munequeras = new String[3];
        munequeras[0] = "Talla XS";
        munequeras[1] = "Talla S";
        munequeras[2] = "Talla M";

        String[] rodilleras = new String[5];
        rodilleras[0] = "Talla XS";
        rodilleras[1] = "2.Talla S";
        rodilleras[2] = "3.Talla M";
        rodilleras[3] = "4.Talla L";
        rodilleras[4] = "5.Talla XL";

        String[] slipers = new String[5];
        slipers[0] = "1.Talla 34";
        slipers[1] = "2.Talla 36";
        slipers[2] = "3.Talla 40";
        slipers[3] = "4.Talla 41";
        slipers[4] = "5.Talla 42";

        String[] straps = new String[2];
        straps[0] = "1.Tradicionl";
        straps[1] = "2.En 8";
        /// /////////////////////////////////////////////////////////////

        SuplementosGadgest1 sup = new SuplementosGadgest1(Cinturones, munequeras, rodilleras, slipers, straps);


        int opcion1;
        do {

            System.out.println("Seleccione un Gadgets");
            System.out.println("1.Cinturones");
            System.out.println("2.Munequeras");
            System.out.println("3.Rodilleras");
            System.out.println("4.Slipers");
            System.out.println("5.Straps");

            opcion1 = sc.nextInt();

            switch (opcion1) {
                case 1:
                    sup.tallascinturones();
                    break;
                case 2:
                    sup.vermunera();
                    break;
                case 3:
                    //Metodo del menu
                    break;
                case 4:
                    //Metodo del menu
                    break;
                case 5:
                    //Metodo del menu
                    break;
                default:
            }
        } while (opcion1 != 5);


        sc.close();
    }

}
