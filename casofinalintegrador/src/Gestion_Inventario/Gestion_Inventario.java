public class Gestion_Inventario {
    List <String> listaMedicinas = new ArrayList <String>();
    List <String> listaAlimentos = new ArrayList <String>();
    List <String> listaEquipamiento = new ArrayList <String>();

    public void EstadoEquipamiento (Equipamiento e){
        if(e.getEstado() == true){
            System.out.println("El equipamiento esta disponible");
        }
        else{
            System.out.println("El equipamiento no esta disponible");
        }
    }

    public void imprimirInventario (){
        System.out.println("Medicinas: ");
        for (int i = 0; i < listaMedicinas.size(); i++){
            System.out.println(listaMedicinas.get(i));
        }
        System.out.println("Alimentos: ");
        for (int i = 0; i < listaAlimentos.size(); i++){
            System.out.println(listaAlimentos.get(i));
        }
        System.out.println("Equipamiento: ");
        for (int i = 0; i < listaEquipamiento.size(); i++){
            System.out.println(listaEquipamiento.get(i));
        }
    }

    public void agregarMedicinas (Medicinas m, Proovedor p){
        System.out.println("Hola soy "+p.getNombre()+" y estoy agregando medicinas al inventario");
        System.out.println("Medicina: " + m.getNombre() + " agregada al inventario");
        listaMedicinas.add(m);
    }
    public void eliminarMedicinas (Medicinas m){
        listaMedicinas.remove(m);
    }
    
    public void agregarEquipamiento (Equipamiento e, Proovedor p){
        System.out.println("Hola soy "+p.getNombre()+" y estoy agregando equipamiento al inventario");
        System.out.println("Equipamiento: " + e.getNombre() + " agregado al inventario");
        listaEquipamiento.add(e);
    }
    public void eliminarEquipamiento (Equipamiento e){
        listaEquipamiento.remove(e);
    }
    
    public void agregarAlimentos (Alimentos a, Proovedor p){
        System.out.println("Hola soy "+p.getNombre()+" y estoy agregando alimentos al inventario");
        System.out.println("Alimento: " + a.getNombre() + " agregado al inventario");
        listaAlimentos.add(a);
    }
    public void eliminarAlimentos (Alimentos a){
        listaAlimentos.remove(a);
    }
}
