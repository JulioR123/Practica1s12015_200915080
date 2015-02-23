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
public class NodCampo_Planta {
    NodCampo_Planta sig;
    String nombre;
    String nombre_jugador;
    int cantidad;
    NodoCampo_Zombie abajo;

    public  NodCampo_Planta() {
    
    nombre = nombre_jugador="";
    cantidad=0;
    abajo=new NodoCampo_Zombie();
    
    }

    public NodCampo_Planta getSig() {
        return sig;
    }

    public NodCampo_Planta( String nombre,int cantidad) {
        this.sig =null;
        this.nombre_jugador =nombre;
        this.cantidad = cantidad;
        abajo=new NodoCampo_Zombie();
    
    }
     

    public NodCampo_Planta( String nombre) {  // agrego con el nodo
       
        this.nombre = nombre;
        cantidad =0;
        nombre_jugador="";
         abajo=new NodoCampo_Zombie();
    }

    public String getNombre() {
        return nombre;
    }

   
    
   
   
    
}
