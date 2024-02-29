package Animales;

public class Animal_aviario extends Animal{

    boolean alas;

    public boolean isAlas() {
        return alas;
    }

    public void setAlas(boolean alas) {
        this.alas = alas;
    }

    public Animal_aviario(String e, boolean a, boolean s, boolean c, boolean a){
        super(especie, alimentacion, salud, comportamiento);
        this.alas=a;
    }
    
}
