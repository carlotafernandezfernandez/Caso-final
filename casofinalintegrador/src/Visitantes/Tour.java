import Visitantes.*;
import Animales.*;
import Habitats.*;
import java.util.*;



public class Tour {
    BufferReader buf= new BufferReader(new InputStreamReader(System.in));
    public void visitarHabitatAcuatico(HAcuatico h, Animal_Acuatico a){
        System.out.println("¿Le gustaria modificar algun valor sobre el animal que va a visitar?"); 
        int respuesta = buf.readLine();
        if (respuesta=="si"){
            System.out.println("¿Que valor le gustaria modificar?");
            System.out.println("1. Alimentacion");
            System.out.println("2. Comportamiento");
            System.out.println("3. Salud");
            int respuesta2 = buf.readLine();
            if (respuesta2==1){
                System.out.println("Introduzca la nueva alimentacion");
                String alim = buf.readLine();
                a.setAlimentacion(alim);
            }else if (respuesta2==2){
                System.out.println("Introduzca el nuevo comportamiento");
                String comp = buf.readLine();
                a.setComportamiento(comp);
            }else if (respuesta2==3){
                System.out.println("¿El animal sigue sano?");
                if (buf.readLine()=="si"){
                    a.setSalud(true);
                }else{
                    a.setSalud(false);
                }
            }
        }
    }
    public void visitarHabitatAviario(HAviario h, Animal_aviario a){
        System.out.println("Le contamos un poco sobre los animales de este habitat:");
        a.ImprimirInformacionEspecie();
        a.registrarAlimentacion();
        a.registrarComportamiento();
        a.registrarSalud();
        System.out.println("En cuanto al habitat: ");
        h.registrarHumedad();
        h.registrarTemperatura();
        h.registrarLimpieza(); 
        System.out.println("¿Le gustaria modificar algun valor sobre el animal?"); 
        int respuesta = buf.readLine();
        if (respuesta=="si"){
            System.out.println("¿Que valor le gustaria modificar?");
            System.out.println("1. Alimentacion");
            System.out.println("2. Comportamiento");
            System.out.println("3. Salud");
            int respuesta2 = buf.readLine();
            if (respuesta2==1){
                System.out.println("Introduzca la nueva alimentacion");
                String alim = buf.readLine();
                a.setAlimentacion(alim);
            }else if (respuesta2==2){
                System.out.println("Introduzca el nuevo comportamiento");
                String comp = buf.readLine();
                a.setComportamiento(comp);
            }else if (respuesta2==3){
                System.out.println("¿El animal sigue sano?");
                if (buf.readLine()=="si"){
                    a.setSalud(true);
                }else{
                    a.setSalud(false);
                }
            }
        }
    }

    public void visitarHabitatTerrestre(HTerrestre h, Animal_terrestre a){
        System.out.println("Le contamos un poco sobre los animales de este habitat:");
        a.ImprimirInformacionEspecie();
        a.registrarAlimentacion();
        a.registrarComportamiento();
        a.registrarSalud();
        System.out.println("En cuanto al habitat: ");
        h.registrarHumedad();
        h.registrarTemperatura();
        h.registrarLimpieza();
        System.out.println("¿Le gustaria modificar algun valor sobre el animal?"); 
        int respuesta = buf.readLine();
        if (respuesta=="si"){
            System.out.println("¿Que valor le gustaria modificar?");
            System.out.println("1. Alimentacion");
            System.out.println("2. Comportamiento");
            System.out.println("3. Salud");
            int respuesta2 = buf.readLine();
            if (respuesta2==1){
                System.out.println("Introduzca la nueva alimentacion");
                String alim = buf.readLine();
                a.setAlimentacion(alim);
            }else if (respuesta2==2){
                System.out.println("Introduzca el nuevo comportamiento");
                String comp = buf.readLine();
                a.setComportamiento(comp);
            }else if (respuesta2==3){
                System.out.println("¿El animal sigue sano?");
                if (buf.readLine()=="si"){
                    a.setSalud(true);
                }else{
                    a.setSalud(false);
                }
            }
        }
    }    

    public void jugarConPinguinos(HAcuatico h, Animal_acuatico a){
        System.out.println("Le contamos un poco sobre los animales de este habitat:");
        a.ImprimirInformacionEspecie();
        a.registrarAlimentacion();
        a.registrarComportamiento();
        a.registrarSalud();
        System.out.println("En cuanto al habitat: ");
        h.registrarHumedad();
        h.registrarTemperatura();
        h.registrarLimpieza();
        System.out.println("Debes de estar acompañado de un adulto. ¿Estas acompañado de un adulto?");
        String stringLeida = buf.readLine();
        if(stringLeida=="si"){
            System.out.println("Estas jugando con pinguinos!!!");
        }else{
            System.out.println("Lo siento, no puedes jugar con los pinguinos");
        }        
        System.out.println("¿Le gustaria modificar algun valor sobre el animal?"); 
        int respuesta = buf.readLine();
        if (respuesta=="si"){
            System.out.println("¿Que valor le gustaria modificar?");
            System.out.println("1. Alimentacion");
            System.out.println("2. Comportamiento");
            System.out.println("3. Salud");
            int respuesta2 = buf.readLine();
            if (respuesta2==1){
                System.out.println("Introduzca la nueva alimentacion");
                String alim = buf.readLine();
                a.setAlimentacion(alim);
            }else if (respuesta2==2){
                System.out.println("Introduzca el nuevo comportamiento");
                String comp = buf.readLine();
                a.setComportamiento(comp);
            }else if (respuesta2==3){
                System.out.println("¿El animal sigue sano?");
                if (buf.readLine()=="si"){
                    a.setSalud(true);
                }else{
                    a.setSalud(false);
                }
            }
        }
    }

    public void alimentarAves (HAviario h, Animal_aviario a){
        System.out.println("Le contamos un poco sobre los animales de este habitat:");
        a.ImprimirInformacionEspecie();
        a.registrarAlimentacion();
        a.registrarComportamiento();
        a.registrarSalud();
        System.out.println("En cuanto al habitat: ");
        h.registrarHumedad();
        h.registrarTemperatura();
        h.registrarLimpieza();
        System.out.println("Vas a alimentar a un loro!!!");
        System.out.println("¿Le gustaria modificar algun valor sobre el animal?"); 
        int respuesta = buf.readLine();
        if (respuesta=="si"){
            System.out.println("¿Que valor le gustaria modificar?");
            System.out.println("1. Alimentacion");
            System.out.println("2. Comportamiento");
            System.out.println("3. Salud");
            int respuesta2 = buf.readLine();
            if (respuesta2==1){
                System.out.println("Introduzca la nueva alimentacion");
                String alim = buf.readLine();
                a.setAlimentacion(alim);
            }else if (respuesta2==2){
                System.out.println("Introduzca el nuevo comportamiento");
                String comp = buf.readLine();
                a.setComportamiento(comp);
            }else if (respuesta2==3){
                System.out.println("¿El animal sigue sano?");
                if (buf.readLine()=="si"){
                    a.setSalud(true);
                }else{
                    a.setSalud(false);
                }
            }
        }
    }

    public void montarACaballo (HTerrestre h, Animal_terrestre a){
        System.out.println("Le contamos un poco sobre los animales de este habitat:");
        a.ImprimirInformacionEspecie();
        a.registrarAlimentacion();
        a.registrarComportamiento();
        a.registrarSalud();
        System.out.println("En cuanto al habitat: ");
        h.registrarHumedad();
        h.registrarTemperatura();
        h.registrarLimpieza();
        System.out.println("¿Has montado a caballo antes?");
        int resp = buf.readLine();
        if (resp == "si"){
           System.out.println("¡Que divertido!");
        } else {
            System.out.println("No sera posible montar a caballo esta vez");
    }
    System.out.println("¿Le gustaria modificar algun valor sobre el animal?"); 
        int respuesta = buf.readLine();
        if (respuesta=="si"){
            System.out.println("¿Que valor le gustaria modificar?");
            System.out.println("1. Alimentacion");
            System.out.println("2. Comportamiento");
            System.out.println("3. Salud");
            int respuesta2 = buf.readLine();
            if (respuesta2==1){
                System.out.println("Introduzca la nueva alimentacion");
                String alim = buf.readLine();
                a.setAlimentacion(alim);
            }else if (respuesta2==2){
                System.out.println("Introduzca el nuevo comportamiento");
                String comp = buf.readLine();
                a.setComportamiento(comp);
            }else if (respuesta2==3){
                System.out.println("¿El animal sigue sano?");
                if (buf.readLine()=="si"){
                    a.setSalud(true);
                }else{
                    a.setSalud(false);
                }
            }
        }
}
    public void interactuarConAnimal (){
        System.out.println("¡HOLA!");
        System.out.println("¿Me das de comer?");
        int respuesta = buf.readLine();
        if (respuesta == "si"){
            System.out.println("¡Que rico!");
        } else {
            System.out.println("¿Quieres jugar conmigo?");
            int respuesta2 = buf.readLine();
            if (respuesta2 == "si"){
                System.out.println("¡Que divertido!");
            } else {
                System.out.println("¿Quieres hacerte una foto conmigo?");
                int respuesta3 = buf.readLine();
                if (respuesta3 == "si"){
                    System.out.println("¡Sonrie!");
                } else {
                    System.out.println("¡Adios!");
            }   
        }
    }
    System.out.println("¿Le gustaria modificar algun valor sobre el animal?"); 
    if (buf.readLine()=="si"){
        System.out.println("¿Que valor le gustaria modificar?");
        System.out.println("1. Alimentacion");
        System.out.println("2. Comportamiento");
        System.out.println("3. Salud");
        if (buf.readLine()==1){
            System.out.println("Introduzca la nueva alimentacion");
            String alim = buf.readLine();
            a.setAlimentacion(alim);
        }else if (buf.readLine()==2){
            System.out.println("Introduzca el nuevo comportamiento");
            String comp = buf.readLine();
            a.setComportamiento(comp);
        }else if (buf.readLine()==3){
            System.out.println("¿El animal sigue sano?");
            if (buf.readLine()=="si"){
                a.setSalud(true);
            }else{
                a.setSalud(false);
            }
        }
        
}

}
}