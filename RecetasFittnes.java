import java.util.Scanner;

/**
 * The type Recetas fittnes.
 * Esta es la clase que contiene el metodo que almacena las recetas
 */
public class RecetasFittnes {
    /**
     * Mostrarelegit.
     *
     * @param sc the sc
     * Este es el metodo que contiene la informacion de cada receta dependieno en que etapa estes  (Volumen/Definicion/Mantenimiento)
     *  Estos Arryas se recorren con un bucle for
     */
    public void mostrarelegit(Scanner sc) {
        String[] volumen = new String[3];
        volumen[0] = "1.Avena(500g), Platanos(2 Unidades), leche(250ml), miel(50g), chocolate(2 Tablas)";
        volumen[1] = "2.Cereales(600g), leche(300ml), proteina(60g), platanos(2 Unidades";
        volumen[2] = "3.Pasta(280g), Ternera(200g), Tomate frito(100g)";

        String[] deficion = new String[3];
        deficion[0] = "1.Avena(200g), Platanos(1 Unidades), leche(200ml), miel(20g), chocolate(1 Tabla)";
        deficion[1] = "2.Cereales(300g), leche(150ml), proteina(30g), platanos(1 Unidad)";
        deficion[2] = "3.Pasta(200g), Ternera(100g), Tomate frito(70g)";

        String[] mantenimieto = new String[3];
        mantenimieto[0] = "1.Avena(200g), Platanos(2 Unidades), leche(190ml), miel(30g), chocolate(2 Tablas)";
        mantenimieto[1] = "2.Cereales(300g), leche(200ml), proteina(30g), platanos(2 Unidades)";
        mantenimieto[2] = "3.Pasta(300g), Ternera(150g), Tomate frito(70g)";

        int opcion;
        do {

            System.out.println();
            System.out.println("1. Volumen");
            System.out.println("2. Definicion");
            System.out.println("3. Mantenimiento");
            System.out.println("4. Salir");
            System.out.println("Selecciona en que fase estas: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                System.out.println();
                    for (int i = 0; i < volumen.length; i++) {
                        System.out.println(volumen[i]);
                    }
                    break;
                case 2:
                System.out.println();
                    for (int i = 0; i < deficion.length; i++) {
                        System.out.println(deficion[i]);
                    }
                    break;
                case 3:
                System.out.println();
                    for (int i = 0; i < mantenimieto.length; i++) {
                        System.out.println(mantenimieto[i]);
                    }
                    break;
                case 4: System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("!ESA FASE NO EXISTE¡");
                    break;
            }

        } while (opcion != 4);
    }
}
