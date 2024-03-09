public class HAcuatico extends Habitat{
    boolean agua;

    public HAcuatico(float t, int h, boolean l, boolean a){
        super(t, h, l);
        this.agua = a;
    }

    public boolean isAgua() {
        return agua;
    }

    public void setAgua(boolean agua) {
        this.agua = agua;
    }       

}