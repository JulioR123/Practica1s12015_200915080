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
public class NodCat_Zombie {
    NodCat_Zombie sig;
    String rutaImagenZ;
    String nombre;
    int puntos;
    String Tipo_ataque;
    //int cod;

    public NodCat_Zombie() {
  this.sig=null;
  rutaImagenZ=nombre=Tipo_ataque="";
  puntos=0;
    }

    public NodCat_Zombie( String rutaImagen, String nombre, int puntos, String Tipo_ataque) {
        
        this.rutaImagenZ = rutaImagen;
        this.nombre = nombre;
        this.puntos = puntos;
        this.Tipo_ataque = Tipo_ataque;
       // this.cod=cod;
    }
    
    
  
      

    
    
}



