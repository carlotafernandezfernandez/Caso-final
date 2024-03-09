package Animales;

public class Animal_aviario extends Animal{

    boolean alas;

    public boolean isAlas() {
        return alas;
    }

    public void setAlas(boolean alas) {
        this.alas = alas;
    }

    public Animal_aviario(String e, boolean a, boolean s, String c, boolean b){
        super(e, a, s, c);
        this.alas = b;
    }
    
}
