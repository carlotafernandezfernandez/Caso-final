public class animal {
    String especie;
    String alimentacion;
    boolean salud;
    boolean comportamiento;

    public Animal (String e, string a, boolean s, boolean c){
        this.especie=e;
        this.alimentacion=a;
        this.salud=s;
        this.comportamiento=c;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public boolean isSalud() {
        return salud;
    }

    public void setSalud(boolean salud) {
        this.salud = salud;
    }

    public boolean isComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(boolean comportamiento) {
        this.comportamiento = comportamiento;
    }

    public void buenaSalud(boolean salud){
        if (salud==TRUE){
            System.out.println("El animal tiene buena salud");
        }else {
            System.out.println("El animal tiene mala salud");
        }
    }

    public void buenComportamiento(boolean comportamiento){
        if (comportamiento==TRUE){
            System.out.println("El animal tiene buen comportamiento");
        }else {
            System.out.println("El animal tiene mal comportamiento");
        }
    }
    
    //metodo para registrar la alimentacion
    public void registrarAlimentacion(String alimentacion){
        System.out.println("La alimentacion del animal es "+alimentacion);
    }

    //metodo para registrar la salud
    public void registrarSalud (boolean salud){
        buenaSalud(salud);
    }

    public void registrarComportamiento (boolean comportamiento){
        buenComportamiento(comportamiento);
    }
}
