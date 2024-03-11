public class Alimentos extends Recursos{
    String tipo;

    public Alimentos (String nombre, int cantidad, String tipo){
        super (nombre, cantidad);
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
}
