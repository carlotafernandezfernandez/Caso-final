package Animales;

public class Animal_terrestre extends Animal {
    boolean patas;

    public boolean isPatas() {
        return patas;
    }

    public void setPatas(boolean patas) {
        this.patas = patas;
    }

    public Animal_terrestre(String e, boolean a, boolean s, boolean c, boolean p){
        super(especie, alimentacion, salud, comportamiento);
        this.patas=p;
    }
    
    buenaSalud(salud); //?
}