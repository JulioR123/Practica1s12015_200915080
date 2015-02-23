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
public class Nod_Cat_planta {
     Nod_Cat_planta sig;
     String rutaImagenP;
    String nombre;
    int puntos;
    String Tipo_ataque;

    public Nod_Cat_planta() {
  this.sig=null;
  rutaImagenP=nombre=Tipo_ataque="";
  puntos=0;
    }

    public Nod_Cat_planta( String rutaImagen, String nombre, int puntos, String Tipo_ataque) {
        
        this.rutaImagenP = rutaImagen;
        this.nombre = nombre;
        this.puntos = puntos;
        this.Tipo_ataque = Tipo_ataque;
    }
    
    
  
      
}
