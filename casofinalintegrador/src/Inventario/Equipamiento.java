public class Equipamiento extends Recursos{
    boolean estado;

    public Equipamiento (String n, int c, boolean e){
       super (n, c);
        this.estado = e;
    }

    public boolean getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    
}
