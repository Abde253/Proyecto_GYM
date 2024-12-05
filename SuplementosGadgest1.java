import java.util.Scanner;

public class SuplementosGadgest1 {
    Scanner sc = new Scanner(System.in);
    private String[] Cinturones;
    private String[] munequeras;
    private String[] rodilleras;
    private String[] slipers;
    private String[] straps;


    public SuplementosGadgest1(String[] cinturones, String[] munequeras, String[] rodilleras, String[] slipers, String[] straps) {
        Cinturones = cinturones;
        this.munequeras = munequeras;
        this.rodilleras = rodilleras;
        this.slipers = slipers;
        this.straps = straps;
    }

    public void vercinturones() {
        System.out.println("Cinturones Disponibles : ");
        for (int i = 0; i < Cinturones.length; i++) {
            System.out.println(Cinturones[i]);
        }
    }

    public void vermuneras() {
        System.out.println("Munequeras Disponibles : ");
        for (int i = 0; i < munequeras.length; i++) {
            System.out.println(munequeras[i]);
        }
    }

    public void verrodilleras() {
        System.out.println("Rodilleras Disponibles : ");
        for (int i = 0; i < rodilleras.length; i++) {
            System.out.println(rodilleras[i]);
        }
    }

    public void slipers() {
        System.out.println("Slipers Disponibles : ");
        for (int i = 0; i < slipers.length; i++) {
            System.out.println(slipers[i]);
        }
    }

    public void straps() {
        System.out.println("Straps Disponibles : ");
        for (int i = 0; i < straps.length; i++) {
            System.out.println(straps[i]);
        }
    }

    SuplementosGadgets volver = new SuplementosGadgets();

    public void tallascinturones() {

        int tall;

        do {

            System.out.println("Tallas Disponibles : ");
            System.out.println("1.XS");
            System.out.println("2.S");
            System.out.println("3.M");
            System.out.println("4.L");
            System.out.println("5.XL");
            System.out.println("6.Volver a los Gadgets");

            tall = sc.nextInt();

            switch (tall) {
                case 1:
                    System.out.println("Has seleccionado XS");
                    break;
                case 2:
                    System.out.println("Has seleccionado S");
                    break;
                case 3:
                    System.out.println("Has seleccionado M");
                    break;
                case 4:
                    System.out.println("Has seleccionado L");
                    break;
                case 5:
                    System.out.println("Has seleccionado XL");
                    break;
                case 6:
                    volver.definirarrys();

                    break;
                default:
            }

        } while (tall != 6);
        sc.close();
    }

    public void vermunera() {
        int ver;

        do {
            System.out.println("Tallas Disponibles : ");
            System.out.println("1.XS");
            System.out.println("2.S");
            System.out.println("3.M");
            System.out.println("4.Volver a los Gadgets ");

            ver = sc.nextInt();

            switch (ver) {
                case 1:
                    System.out.println("Has seleccionado XS");
                    break;
                case 2:
                    System.out.println("Has seleccionado S");
                    break;
                case 3:
                    System.out.println("Has seleccionado M");
                    break;
                case 4:
                    volver.definirarrys();
                    break;
                default:
            }

        } while (ver != 4);
        sc.close();
    }


    public void verrodillera() {
        int ver1;

        do{

            System.out.println("Tallas Disponibles : ");
            System.out.println("1.XS");
            System.out.println("2.S");
            System.out.println("3.M");
            System.out.println("4.L");
            System.out.println("5.XL");
            System.out.println("6.Volver a los Gadgets");

            ver1 = sc.nextInt();















        }while (ver1 != 5)
        sc.close();
    }



}
