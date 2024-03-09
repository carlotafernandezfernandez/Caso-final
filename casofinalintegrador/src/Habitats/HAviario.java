public class HAviario extends Habitat{
    boolean aire;

    public HAviario(float t, boolean h, boolean l, boolean a){
        super(t, h, l);
        this.aire = a;
    }

    public boolean isAire() {
        return aire;
    }

    public void setAire(boolean aire) {
        this.aire = aire;
    }       

}