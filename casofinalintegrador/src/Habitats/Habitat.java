public class Habitat {

    float temperatura;
    boolean humedad;
    boolean limpieza;
    
    public Habitat (float t, boolean h, boolean l){
        this.temperatura = t;
        this.humedad = h;
        this.limpieza = l;
    }

    public float getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(float t) {
        this.temperatura = t;
    }

    public boolean isHumedad() {
        return this.humedad;
    }

    public void setHumedad(boolean h) {
        this.humedad = h;
    }

    public boolean isLimpieza() {
        return this.limpieza;
    }

    public void setLimpieza(boolean l) {
        this.limpieza = l;
    }

}