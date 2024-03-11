import java.util.Date;

public class Medicinas extends Recusos{
    Date fechaDeExpiracion;
    
    public Medicinas(String nombre, int cantidad, Fecha fechaDeExpiracion){
        super (nombre, cantidad);
        this.fechaDeExpiracion = fechaDeExpiracion;
    }
    
    public Date getFechaDeExpiracion(){
        return fechaDeExpiracion;
    }
    public void setFechaDeExpiracion(Date fechaDeExpiracion){
        this.fechaDeExpiracion = fechaDeExpiracion;
    }
    
    
}
