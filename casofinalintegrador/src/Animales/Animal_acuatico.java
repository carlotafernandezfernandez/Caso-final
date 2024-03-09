package Animales;

public class Animal_acuatico extends Animal {
    boolean aletas;

    public boolean isAletas() {
        return aletas;
    }

    public void setAletas(boolean aletas) {
        this.aletas = aletas;
    }

    public Animal_acuatico (String e, boolean a, boolean s, String c, boolean b){
        super(especie, alimentacion, salud, comportamiento);
        this.aletas=b;
        }
    }
    

