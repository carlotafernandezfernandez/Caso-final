import java.nio.Buffer;

public class Quioscos {
    BufferReader buffer = new BufferReader(new InputStreamReader(System.in));
    public String nombre;
    public String ubicacion;

    public Quioscos(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getUbicacion() {
        return ubicacion;
    } 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void quioscoManolita(Animal_acuatico a, HAcuatico h) {        
        System.out.println("Bienvenido al quiosco de "+nombre);
            a.ImprimirInformacionEspecie();
            a.registrarAlimentacion();
            a.registrarComportamiento();
            a.registrarSalud();
            h.ImprimirInformacionHabitat();
            h.registrarHumedad();
            h.registrarTemperatura();
            h.registrarLimpieza();      
    }

    public void quioscoJuan() {   
        System.out.println("Bienvenido al quiosco de Don Juan");     
        a.ImprimirInformacionEspecie();
            a.registrarAlimentacion();
            a.registrarComportamiento();
            a.registrarSalud();
            h.ImprimirInformacionHabitat();
            h.registrarHumedad();
            h.registrarTemperatura();
            h.registrarLimpieza(); 
    }

public void quioscoMaria() {   
    System.out.println("Bienvenido al quiosco de Doña Maria");     
    a.ImprimirInformacionEspecie();
        a.registrarAlimentacion();
        a.registrarComportamiento();
        a.registrarSalud();
        h.ImprimirInformacionHabitat();
        h.registrarHumedad();
        h.registrarTemperatura();
        h.registrarLimpieza(); 
}
public void quioscoPedro() {   
    System.out.println("Bienvenido al quiosco de Don Pedro");     
    a.ImprimirInformacionEspecie();
        a.registrarAlimentacion();
        a.registrarComportamiento();
        a.registrarSalud();
        h.ImprimirInformacionHabitat();
        h.registrarHumedad();
        h.registrarTemperatura();
        h.registrarLimpieza(); 
}

public void quioscoJuana() {   
    System.out.println("Bienvenido al quiosco de Doña Juana");     
    a.ImprimirInformacionEspecie();
        a.registrarAlimentacion();
        a.registrarComportamiento();
        a.registrarSalud();
        h.ImprimirInformacionHabitat();
        h.registrarHumedad();
        h.registrarTemperatura();
        h.registrarLimpieza(); 
}
public void quioscoJose() {   
    System.out.println("Bienvenido al quiosco de Don Jose");     
    a.ImprimirInformacionEspecie();
        a.registrarAlimentacion();
        a.registrarComportamiento();
        a.registrarSalud();
        h.ImprimirInformacionHabitat();
        h.registrarHumedad();
        h.registrarTemperatura();
        h.registrarLimpieza(); 
}

}