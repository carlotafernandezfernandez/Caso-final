package Gestion_habitat; 

public class HAcuatico extends Habitat {

    boolean puede_nadar;

    public HAcuatico (float t, float h, boolean l, boolean puede_nadar){
        super(temperatura, humedad, limpieza);
        this.puede_nadar=puede_nadar;
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
        return "HAcuatico []";
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
}
