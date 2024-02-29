package Gestion_habitat;

public class HAviario extends Habitat{

    boolean puede_volar;

    public HAviario (float t, float h, boolean l, boolean puede_volar){
        super(temperatura, humedad, limpieza);
        this.puede_volar= puede_volar;
    }

    public float getTemperatura() {
        return temperatura;
    }


    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }


    public float getHumedad() {
        return humedad;
    }


    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }


    public boolean isLimpieza() {
        return limpieza;
    }


    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }

    public String toString(){
        return "HAviario []";
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
}
