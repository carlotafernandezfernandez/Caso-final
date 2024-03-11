public class Mantenimiento {
    String tipoDeMantenimiento; 
    String ubicacion;

    public Mantenimiento (String tipo, String ubicacion){
        this.tipoDeMantenimiento= tipo;
        this.ubicacion = ubicacion;
    }

    public String getTipoDeMantenimiento() {
        return tipoDeMantenimiento;
    }

    public void setTipoDeMantenimiento(String tipoDeMantenimiento) {
        this.tipoDeMantenimiento = tipoDeMantenimiento;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}

    



    

