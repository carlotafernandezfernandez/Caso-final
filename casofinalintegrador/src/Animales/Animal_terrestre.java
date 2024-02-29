package Animales;

public class Animal_terrestre extends Animal {
    boolean puede_andar;

    public Animal_terrestre(String e, boolean a, boolean s, boolean c, boolean p){
        super(especie, alimentacion, salud, comportamiento);
        this.puede_andar=p;
    }
    
}
