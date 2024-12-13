import java.util.Scanner;

/**
 * The type Tarifas asistente.
 * Esta es la clase TarifasAsistente, que contiene diferentes metodos funcionales para el menu
 */
public class TarifasAsistente {
    /**
     * Menu inicial.
     *
     * @param sc the sc
     * Este es el menu inicial de tarifas
     */
    public void menuInicial(Scanner sc) {
        int opcion;

        do {
            System.out.println();
            System.out.println("1. Tarifas");
            System.out.println("2. Pago");
            System.out.println("3. Atencion Al Cliente");
            System.out.println("4. Contacto");
            System.out.println("5. Salir");
            System.out.print("Introduce tu opcion: ");
            
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: tarifas(sc);
                    break;
                case 2: pago(sc);
                    break;
                case 3: atencionAlCliente(sc);
                    break;
                case 4: contacto(sc);
                    break;
                case 5: System.out.println("Saliendo...");
                    break;
                default: System.out.println("Opcion no valida.");
                    break;
            }
        } while (opcion != 5);
    }

    /**
     * Tarifas.
     *
     * @param sc the sc
     * Este es el metodo que contiene los tipos de tarifa
     */
    public static void tarifas(Scanner sc) {
        int tarifa;
        do {
            System.out.println();
            System.out.println("SELECCION");
            System.out.println("1. Diaria");
            System.out.println("2. Mensual");
            System.out.println("3. Anual");
            System.out.println("4. Promociones");
            System.out.println("5. Salir");
            System.out.print("Introduce tu opción: ");

            tarifa = sc.nextInt();

            switch (tarifa) {
                case 1: diaria(sc);
                    break;
                case 2: mensual(sc);
                    break;
                case 3: anual(sc);
                    break;
                case 4: promociones(sc);
                    break;
                case 5: System.out.println("Saliendo...");
                    break;
                default: System.out.println("Opcion no valida.");
                    break;
            }
        }while (tarifa != 5);
    }

    /**
     * Diaria.
     *
     * @param sc the sc
     * Este es el metodo que contiene las tarifas diarias
     */
    public static void diaria(Scanner sc) {
        int dia;
        do {
            System.out.println();
            System.out.println("SELECCION");
            System.out.println("1. 1 Dia");
            System.out.println("2. 7 Dias");
            System.out.println("3. 15 Dias");
            System.out.println("4. Salir");
            System.out.print("Introduce tu opción: ");

            dia = sc.nextInt();

            switch (dia) {
                case 1: System.out.println("Ha escogido 1 dia");
                    break;
                case 2: System.out.println("Ha escogido 7 dias");
                    break;
                case 3: System.out.println("Ha escogido 15 dias");
                    break;
                case 4: System.out.println("Saliendo...");
                    break;
                default: System.out.println("Opcion no valida.");
                    break;
            }
        }while (dia != 4);
    }

    /**
     * Mensual.
     *
     * @param sc the sc
     * Este es el metodo que contiene las tarifas mensuales
     */
    public static void mensual(Scanner sc) {
        int mes;
        do {
            System.out.println();
            System.out.println("SELECCION");
            System.out.println("1. 1 Mes");
            System.out.println("2. 3 Meses");
            System.out.println("3. 6 Meses");
            System.out.println("4. 9 Meses");
            System.out.println("5. Salir");
            System.out.print("Introduce tu opción: ");

            mes = sc.nextInt();

            switch (mes) {
                case 1: System.out.println("Ha escogido 1 Mes");
                    break;
                case 2: System.out.println("Ha escogido 3 Meses");
                    break;
                case 3: System.out.println("Ha escogido 6 Meses");
                    break;
                case 4: System.out.println("Ha escogido 9 Meses");
                    break;
                case 5: System.out.println("Saliendo...");
                    break;
                default: System.out.println("Opcion no valida.");
                    break;
            }
        }while (mes != 5);
    }

    /**
     * Anual.
     *
     * @param sc the sc
     * Este es el metodo que contiene las tarifas anuales
     */
    public static void anual(Scanner sc) {
        int anyo;
        do {
            System.out.println();
            System.out.println("SELECCION");
            System.out.println("1. 1 Anyo");
            System.out.println("2. 2 Anyos");
            System.out.println("3. 3 Anyos");
            System.out.println("4. Salir");
            System.out.print("Introduce tu opción: ");

            anyo = sc.nextInt();

            switch (anyo) {
                case 1: System.out.println("Ha escogido 1 Anyo");
                    break;
                case 2: System.out.println("Ha escogido 7 Anyos");
                    break;
                case 3: System.out.println("Ha escogido 15 Anyos");
                    break;
                case 4: System.out.println("Saliendo...");
                    break;
                default: System.out.println("Opcion no valida.");
                    break;
            }
        }while (anyo != 4);
    }

    /**
     * Promociones.
     *
     * @param sc the sc
     * Este es el metodo que contiene las tarifas promocionales
     */
    public static void promociones(Scanner sc) {
        int promo;
        do {
            System.out.println();
            System.out.println("SELECCION");
            System.out.println("1. 3 meses 5% descuento");
            System.out.println("2. 6 meses 10% descuento");
            System.out.println("3. 9 meses 15% descuento");
            System.out.println("4. Salir");
            System.out.print("Introduce tu opción: ");

            promo = sc.nextInt();

            switch (promo) {
                case 1: System.out.println("Ha escogido 3 meses de promocion");
                    break;
                case 2: System.out.println("Ha escogido 6 meses de promocion");
                    break;
                case 3: System.out.println("Ha escogido 9 meses de promocion");
                    break;
                case 4: System.out.println("Saliendo...");
                    break;
                default: System.out.println("Opcion no valida.");
                    break;
            }
        }while (promo != 4);
    }

    /**
     * Pago.
     *
     * @param sc the
     * Este es el metodo que contiene las tipos de pago
     */
    public static void pago(Scanner sc) {
        int pago;
        do {
            System.out.println();
            System.out.println("SELECCION");
            System.out.println("1. Efectivo (Ticket de Pago)");
            System.out.println("2. Tarjeta de Credito");
            System.out.println("3. Plataformas de pago");
            System.out.println("4. Salir");
            System.out.print("Introduce tu opcion: ");

            pago = sc.nextInt();

            switch (pago) {
                case 1: System.out.println("Ha escogido efectivo");
                    break;
                case 2: System.out.println("Ha escogido tarjeta de credito");
                    break;
                case 3: plataformas(sc);
                    break;
                case 4: System.out.println("Saliendo...");
                    break;
                default: System.out.println("Opcion no valida.");
                    break;
            }
        }while (pago != 4);
    }

    /**
     * Plataformas.
     *
     * @param sc the sc
     * Este es el metodo que contiene las plataformas- de pago
     */
    public static void plataformas(Scanner sc) {
        int plataforma;
        do {
            System.out.println();
            System.out.println("SELECCION");
            System.out.println("1. PayPal");
            System.out.println("2. Bizum");
            System.out.println("3. Bono Cultural");
            System.out.println("4. Paysafecard");
            System.out.println("5. Cryptomonedas");
            System.out.println("6. Salir");
            System.out.print("Introduce tu opcion: ");

            plataforma = sc.nextInt();

            switch (plataforma) {
                case 1: System.out.println("Ha escogido PayPal");
                    break;
                case 2: System.out.println("Ha escogido Bizum");
                    break;
                case 3: System.out.println("Ha escogido Bono Cultural");
                    break;
                case 4: System.out.println("Ha escogido Paysafecard");
                    break;
                case 5: System.out.println("Ha escogido Cryptomonedas");
                    break;
                case 6: System.out.println("Saliendo...");
                    break;
                default: System.out.println("Opcion no valida.");
                    break;
            }
        }while (plataforma != 6);
    }

    /**
     * Atencion al cliente.
     *
     * @param sc the sc
     * Este es el metodo que contiene la atencion al cliente
     */
    public static void atencionAlCliente(Scanner sc) {
        int aten;
        do {
            System.out.println();
            System.out.println("SELECCION");
            System.out.println("1. Preguntas Frecuentes");
            System.out.println("2. Errores Comunes");
            System.out.println("3. Soporte Automatico");
            System.out.println("4. Salir");
            System.out.print("Introduce tu opcion: ");

            aten = sc.nextInt();

            switch (aten) {
                case 1: preguntas(sc);
                    break;
                case 2: errores(sc);
                    break;
                case 3: System.out.println("Bienvenido al soporte automatico");
                    break;
                case 4: System.out.println("Saliendo...");
                    break;
                default: System.out.println("Opcion no valida.");
                    break;
            }
        }while (aten != 4);
    }

    /**
     * Preguntas.
     *
     * @param sc the sc
     * Este es el metodo que contiene las preguntas frecuentes
     */
    public static void preguntas(Scanner sc) {
        int preg;
        do {
            System.out.println();
            System.out.println("SELECCION");
            System.out.println("1. ¿Puedo pagar con otro metodo a parte de los proporcionados?");
            System.out.println("2. ¿Puedo pagar a final mi tarifa?");
            System.out.println("3. ¿Necesito estar registrado en el gimnasio para usar la APP?");
            System.out.println("4. Salir");
            System.out.print("Introduce tu opcion: ");

            preg = sc.nextInt();

            switch (preg) {
                case 1: System.out.println("No, lo sentimos, solo metodos de pago aceptados.");
                    break;
                case 2: System.out.println("No, por temas de seguridad, se realiza el pago al solicitar la tarifa.");
                    break;
                case 3: System.out.println("No necesariamente, la APP esta al alcance de todo el mundo, desde Play Store y App Store.");
                    break;
                case 4: System.out.println("Saliendo...");
                    break;
                default: System.out.println("Opcion no valida.");
                    break;
            }
        }while (preg != 4);
    }

    /**
     * Errores.
     *
     * @param sc the sc
     * Este es el metodo que contiene los errores comunes
     */
    public static void errores(Scanner sc) {
        int error;
        do {
            System.out.println();
            System.out.println("SELECCION");
            System.out.println("1. Errores en las tarifas");
            System.out.println("2. Errores en los pagos");
            System.out.println("3. Errores en los ejercicios");
            System.out.println("4. Salir");
            System.out.print("Introduce tu opcion: ");

            error = sc.nextInt();

            switch (error) {
                case 1: System.out.println("Las tarifas unicamente son las que tenemos asignadas.");
                    break;
                case 2: System.out.println("Los pagos se realizan con los metodos aceptados en los plazos aceptados.");
                    break;
                case 3: System.out.println("Debe seguir completamente los pasos del entrenador personal.");
                    break;
                case 4: System.out.println("Saliendo...");
                    break;
                default: System.out.println("Opcion no valida.");
                    break;
            }
        }while (error != 4);
    }

    /**
     * Contacto.
     *
     * @param sc the sc
     * Este es el metodo que contiene los medios de contacto
     */
    public static void contacto(Scanner sc) {
        int cont;
        do {
            System.out.println();
            System.out.println("SELECCION");
            System.out.println("1. Numero de telefono");
            System.out.println("2. Correo electronico");
            System.out.println("3. Redes Sociales");
            System.out.println("4. Salir");
            System.out.print("Introduce tu opcion: ");

            cont = sc.nextInt();

            switch (cont) {
                case 1: System.out.println("+34 677 888 999");
                    break;
                case 2: System.out.println("todogymonline@invent.com");
                    break;
                case 3: redesSociales(sc);
                    break;
                case 4: System.out.println("Saliendo...");
                    break;
                default: System.out.println("Opcion no valida.");
                    break;
            }
        }while (cont != 4);
    }

    /**
     * Redes sociales.
     *
     * @param sc the sc
     * Este es el metodo que contiene las redes sociales
     */
    public static void redesSociales(Scanner sc) {
        int redes;
        do {
            System.out.println();
            System.out.println("SELECCION");
            System.out.println("1. Instagram");
            System.out.println("2. Twitter");
            System.out.println("3. Facebook");
            System.out.println("4. Salir");
            System.out.print("Introduce tu opcion: ");

            redes = sc.nextInt();

            switch (redes) {
                case 1: System.out.println("instagram.com/@todogym");
                    break;
                case 2: System.out.println("twitter.com/@todogym_");
                    break;
                case 3: System.out.println("facebook.com/@Todo Gym");
                    break;
                case 4: System.out.println("Saliendo...");
                    break;
                default: System.out.println("Opcion no valida.");
                    break;
            }
        }while (redes != 4);
    }
}