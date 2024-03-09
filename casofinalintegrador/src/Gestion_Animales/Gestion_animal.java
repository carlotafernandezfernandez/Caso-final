import Visitantes.*;
import Animales.*;
import Habitats.*;

public class Gestion_animal {

    public static void modificarEstadoAnimalAcuatico (Animal_acuatico a){
        a.setAlimentacion("algas");
        a.setComportamiento("bueno");
        a.setEspecie("delfin");
        a.setSalud("buena");
    }
    public static void modificarEstadoAnimalAviario (Animal_aviario a){
        a.setAlimentacion("hierbas");
        a.setComportamiento("muy inquieto");
        a.setEspecie("aguila");
        a.setSalud("buena");
    }
    public static void modificarEstadoAnimalTerrestre (Animal_terrestre a){
        a.setAlimentacion("hierbas");
        a.setComportamiento("buenisimo");
        a.setEspecie("tigre");
        a.setSalud("empeorando");
    }

    public void registrarSalud(){
        if (salud==TRUE){
            System.out.println("El animal tiene buena salud");
        }else {
            System.out.println("El animal tiene mala salud");
        }
    }

    public void registrarAlimentacion(){
        System.out.println("La alimentacion del animal es "+a.getAlimentacion());
    }

    public void registrarComportamiento(){
        System.out.println("EL comportamiento del animal es "+a.getComportamiento());
    }

    public void ImprimirInformacionEspecie (){
        System.out.println("La especie del animal es "+a.getEspecie());
    }

}
