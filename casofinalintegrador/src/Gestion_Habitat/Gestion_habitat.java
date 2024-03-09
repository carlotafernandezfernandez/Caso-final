import Animales.*;
import Habitats.*;
import Visitantes.*;

public class Gestion_habitat {
    public void actualizarEstadoHabitatAcuatico(HAcuatico habitat) {
        habitat.setTemperatura(28F);
        habitat.setHumedad(45);
        habitat.setLimpieza("limpio");
        habitat.setAgua(true);
        System.out.println("Hábitat actualizado automáticamente");
    }

    public void actualizarEstadoHabitatAviario(HAviario habitat) {
        habitat.setTemperatura(28F);
        habitat.setHumedad(45);
        habitat.setLimpieza("limpio");
        habitat.setAire(true);
        System.out.println("Hábitat actualizado automáticamente");
    }

    public void actualizarEstadoHabitatTerrestre(HTerrestre habitat) {
        habitat.setTemperatura(28F);
        habitat.setHumedad(45);
        habitat.setLimpieza("limpio");
        habitat.setTierra(true);
        System.out.println("Hábitat actualizado automáticamente");
    }

    
    public void registrarHumedad(){
        System.out.println("La humedad del habitat es "+h.getHumedad());
    }

    public void registrarTemperatura(){
        System.out.println("La temperatura del habitat es "+h.getTemperatura());
    }

    public void registrarLimpieza(){
        if (limpieza==TRUE){
            System.out.println("El habitat se encuntra en un estado limpio");
        }else {
            System.out.println("El habitat no se encuntra en un estado limpio");
        }
    }
}