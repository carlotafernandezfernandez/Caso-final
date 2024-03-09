public class Animal_terrestre extends Animal {
    boolean patas;

    public boolean isPatas() {
        return patas;
    }

    public void setPatas(boolean patas) {
        this.patas = patas;
    }

    public Animal_terrestre(String e, boolean a, boolean s, String c, boolean p){
        super(e, a, s, c);
        this.patas=p;
    }
}
