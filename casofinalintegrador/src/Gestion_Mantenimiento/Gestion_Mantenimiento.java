import Mantenimiento.*;

public class Gestion_Mantenimiento {
    List <Mantenimiento> listaMantenimiento = new ArrayList <Mantenimiento>();

    public void imprimirMantenimiento (){
        for (int i = 0; i < listaMantenimiento.size(); i++){
            System.out.println("Tipo de mantenimiento: " + listaMantenimiento.get(i).getTipoDeMantenimiento());
            System.out.println("Ubicacion: " + listaMantenimiento.get(i).getUbicacion());
        }
    }
    public void solucion (Mantenimiento m){
        if(m.getTipoDeMantenimiento == "Urgente"){
            System.out.println("Se solucionara el problema de manera urgente");
            listaMantenimiento.remove(m);
        }
        if(m.getTipoDeMantenimiento == "Regular"){
            System.out.println("Cuando sea posible se solucionara el problema");
            listaMantenimiento.remove(m);
        }
    }


    
    
}