import Visitantes.*;
import Animales.*;
import Habitats.*;



public class Tour {
    public void visitar(HTerrestre h){
        System.out.println("Visitando habitat terrestre");
    }
    public void visitar(HAcuatico h){
        System.out.println("Visitando habitat acuatico");
    }
    public void visitar(HAereo h){
        System.out.println("Visitando habitat aereo");
    }
    public void visitar(Visitante v){
        System.out.println("Visitando visitante");
    }

}