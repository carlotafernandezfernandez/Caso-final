public class Visitante {
    String nombre;
    int edad;
    boolean adulto;

    public Visitante(String n, int e){
        this.nombre = n;
        this.edad = e;
        if (e >= 18){
            this.adulto = true;
        } else {
            this.adulto = false;
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isAdulto() {
        return adulto;
    }
}