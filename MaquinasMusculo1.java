public class MaquinasMusculo1 {
    private String [] musculopecho;
    private String [] musculoespalda;
    private String [] musculopierna;
    private String [] musculobrazo;


    public MaquinasMusculo1(String[] musculopecho, String[] musculoespalda, String[] musculopierna, String[] musculobrazo) {
        this.musculopecho = musculopecho;
        this.musculoespalda = musculoespalda;
        this.musculopierna = musculopierna;
        this.musculobrazo = musculobrazo;
    }

    public void pecho(){
        System.out.println("Musculos de  pecho: ");
        for (int i = 0; i < musculopecho.length - 1; i++) {
            System.out.println(musculopecho[i]);
        }
    }

    public void spalda(){
        System.out.println("Musculos de espalda: ");
        for (int i = 0; i < musculoespalda.length; i++) {
            System.out.println(musculoespalda[i]);
        }
    }

    public void pierna(){
        System.out.println("Musculos de pierna: ");
        for (int i = 0; i < musculopierna.length; i++) {
            System.out.println(musculopierna[i]);
        }
    }

    public void brazo(){
        System.out.println("Musculos de brazo: ");
        for (int i = 0; i < musculobrazo.length; i++) {
            System.out.println(musculobrazo[i]);
        }
    }


}

