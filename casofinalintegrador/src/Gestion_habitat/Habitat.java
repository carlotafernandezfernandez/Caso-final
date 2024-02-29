package Gestion_habitat; 

public class Habitat {
    float temperatura;
    float humedad;
    boolean limpieza;

    public Habitat (float t, float h, boolean l){
        this.temperatura=t;
        this.humedad=h;
        this.limpieza=l;
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


    @Override
    public String toString(){
        return "habitat []";
    }
    
}
