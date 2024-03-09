public class animal {
    String especie;
    String alimentacion;
    boolean salud;
    String comportamiento;

    public Animal (String e, string a, boolean s, String c){
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

    public String getComportamiento() {
        return comportamiento;
    }

    public String setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }  
    }

