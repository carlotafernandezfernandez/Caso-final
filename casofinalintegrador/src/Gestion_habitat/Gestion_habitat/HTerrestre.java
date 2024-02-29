package Gestion_habitat;

public class HTerrestre extends Habitat {

    boolean puede_caminar;

    public HTerrestre (float t, float h, boolean l, boolean puede_caminar){
        super(temperatura, humedad, limpieza);
        this.puede_caminar=puede_caminar;
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

    public boolean isPuede_caminar() {
        return puede_caminar;
    }

    public void setPuede_caminar(boolean puede_caminar) {
        this.puede_caminar = puede_caminar;
    }
    private String extracted() {
        return "HTerrestre []";
    }
    
}
