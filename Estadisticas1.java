public class Estadisticas1 {
    private String[] nuevosUsuarios;
    private String[] totalUsuarios;

    public Estadisticas1(String[] nuevosUsuarios, String[] totalUsuarios) {
        this.nuevosUsuarios = nuevosUsuarios;
        this.totalUsuarios = totalUsuarios;
    }

    public void mostrarNuevos(){
        for (int i = 0; i < nuevosUsuarios.length; i++) {
            System.out.println(nuevosUsuarios[i]);
        }
    }

    public void mostrarTotal(){
        for (int i = 0; i < totalUsuarios.length; i++) {
            System.out.println(totalUsuarios[i]);
        }
    }
}
