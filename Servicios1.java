public class Servicios1 {
    private String[] horarioJose;
    private String[] horarioMaria;
    private String[] horarioJuan;

    public Servicios1(String[] horarioJose, String[] horarioMaria, String[] horarioJuan) {
        this.horarioJose = horarioJose;
        this.horarioMaria = horarioMaria;
        this.horarioJuan = horarioJuan;
    }

    public void horarioJose1() {
        System.out.println("horarioJose");
        for (int i = 0; i < horarioJose.length; i++) {
            System.out.println(horarioJose[i]);
        }
    }

    public void horarioMaria1() {
        System.out.println("horarioMaria");
        for (int i = 0; i < horarioMaria.length; i++) {
            System.out.println(horarioMaria[i]);
        }
    }

    public void horarioJuan1() {
        System.out.println("horarioJuan");
        for (int i = 0; i < horarioJuan.length; i++) {
            System.out.println(horarioJuan[i]);
        }
    }
}

