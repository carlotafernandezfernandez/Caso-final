public class Habitat {

    float temperatura;
    int humedad;
    boolean limpieza;
    
    public Habitat (float t, int h, boolean l){
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

    public int getHumedad() {
        return this.humedad;
    }

    public void setHumedad(int h) {
        this.humedad = h;
    }

    public boolean isLimpieza() {
        return this.limpieza;
    }

    public void setLimpieza(boolean l) {
        this.limpieza = l;
    }

}