/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaedd1;

import java.io.IOException;

/**
 *
 * @author julior
 */
public class PracticaEDD1 {
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       Jugador j = new Jugador();
       
   Parte1  p = new Parte1();
      p.setVisible(true);
      Lista_Cat_Planta planta = new Lista_Cat_Planta();
      
     Nod_Cat_planta n1= planta.Agregar_Inicio("ruta1", "2", 3, "4");
      Nod_Cat_planta n2= planta.Agregar_Inicio("ruta2", "2", 3, "4");
     Nod_Cat_planta n3=  planta.Agregar_Inicio("ruta3", "2", 3, "4");
      
      ListaPTipoCola tc = new ListaPTipoCola();
      NodPlantTipoCola pc= new NodPlantTipoCola();
      
      tc.insertarCola(n1);
       tc.insertarCola(n2);
        tc.insertarCola(n3);
        
       // tc.recorrerCola();
        
        System.err.println("arriba llene mi pila ahora empiezo con la logica siguiete");
        
      
//   while(! miPila.vacio()){
//    miPila.recorrerPila();
//    miPila.extraerPila();
   
    }
         
    }