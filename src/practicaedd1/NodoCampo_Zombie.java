/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaedd1;

/**
 *
 * @author julior
 */
public class NodoCampo_Zombie {
     NodoCampo_Zombie sig;
     public   String nombre;
     public String nombreJugadorZom;
     public  int cantidad;
   

    public NodoCampo_Zombie() {
    
    nombre = "";
    cantidad=0;
    nombreJugadorZom="";
    }

    public NodoCampo_Zombie( String nombreZom, int cantidad) {  // agrego con el nodo
       
        this.nombreJugadorZom = nombreZom;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public NodoCampo_Zombie( String nombre) { // agrego a la lista....
       
        this.nombre = nombre;
      
    }
    
    
    
}
