public class HTerrestre extends Habitat {
    boolean tierra;

    public HTerrestre(float t, boolean h, boolean l, boolean tierra) {
        super(t, h, l);
        this.tierra = tierra;
    }

    public boolean isTierra() {
        return tierra;
    }

    public void setTierra(boolean tierra) {
        this.tierra = tierra;
    }
}


