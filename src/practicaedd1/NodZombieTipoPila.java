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
public class NodZombieTipoPila {
   
     
    String nombreZtp;
    String RutIma;
    int puntos;
    String Tipo_ataque;
  
    NodZombieTipoPila sig;
    
    
    
  // int puntosZtp;  Pendient posiblemente me sirvan
   //String AtaqueTpila; // pendiente posiblemente me isrvan

    public NodZombieTipoPila() {
       
        nombreZtp="";
        RutIma="";
        puntos=0;
        Tipo_ataque="";
       
         sig = null;
    }

    public NodZombieTipoPila( String RutIma,String nombreZtp, int puntos, String Tipo_ataque) {
        this.nombreZtp = nombreZtp;
        this.RutIma = RutIma;
        this.puntos = puntos;
        this.Tipo_ataque = Tipo_ataque;
        this.sig = null;
    }

    

    

   

    public String getNombreZtp() {
        return nombreZtp;
    }

    public void setNombreZtp(String nombreZtp) {
        this.nombreZtp = nombreZtp;
    }
    
    
    
}
