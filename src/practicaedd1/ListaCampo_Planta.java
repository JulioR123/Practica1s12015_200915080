/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaedd1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author julior
 */
public class ListaCampo_Planta {

    Jugador j = new Jugador();

    NodCampo_Planta cab;
    NodCampo_Planta inicio;
    NodCampo_Planta ultimo;
  
    
    int tamaño;

    public ListaCampo_Planta() {
        inicio = null;
        ultimo = null;
        tamaño = 0;

    }

    /*
     * Metodo que permite verificar si la lista esta vacia.
     */
    public boolean Vacio() {
        return (inicio == null);
    }

    public int Tamaño() {
        return tamaño;
    }

    NodCampo_Planta nuevo123;

    public NodCampo_Planta datosP(int cantidad, String campos) {

        nuevo123 = new NodCampo_Planta(campos, cantidad);
        // System.out.println(nuevo123.cantidad+nuevo123.nombre_jugador);
        return nuevo123;

    }

    public NodCampo_Planta Agregar_InicioP(String campo) {

        NodCampo_Planta nuevo = new NodCampo_Planta(campo);
        if (Vacio()) {
            inicio = nuevo;
            ultimo = nuevo;
            return inicio;
        } else {
            nuevo.sig = inicio;
            inicio = nuevo;
            return nuevo;
        }

    }
    
    

    public void recorrer() {
        NodCampo_Planta temp;
        temp = inicio;
        while (temp != null) {
            System.out.println("Planta: " + temp.nombre);
            temp = temp.sig;

        }

    }
    
    // NodoCampo_Zombie aux,

    public int graficar(NodoCampo_Zombie aux,ListaCampo_Zombie z) throws IOException {
         
NodCampo_Planta tem;
tem = inicio;

     
      
        File archivo = new File("lista.dot");
        BufferedWriter ver;
        ver = new BufferedWriter(new FileWriter(archivo));
        ver.write("digraph G {  ");
      ver.write(j.nombre + "[shape=box,color=blue, style=filled]");
      ver.write(j.nombre + " -> " + nuevo123.nombre_jugador + nuevo123.cantidad + ";"); 
        System.err.println(nuevo123.nombre_jugador+nuevo123.cantidad);
      ver.write( nuevo123.nombre_jugador + nuevo123.cantidad + "[shape=box,color=red, style=filled]");

      if(tem!=null){
      ver.write(nuevo123.nombre_jugador + nuevo123.cantidad+ " -> "+ tem.getNombre() + ";");
     ver.write(tem.getNombre() + "[shape=box,color=yellow, style=filled]");
     while(tem.sig!=null){
     ver.write(tem.getNombre()+ "->"+ tem.sig.getNombre() + ";");
      ver.write(tem.sig.nombre + "[shape=box,color=yellow, style=filled]");
     tem= tem.getSig();
     }
      }
    NodoCampo_Zombie temp = z.inicio;
  

    
    
 ver.write(nuevo123.nombre_jugador + nuevo123.cantidad+ " -> "+ aux.nombreJugadorZom +aux.cantidad+ ";");
 ver.write(aux.nombreJugadorZom +aux.cantidad+ "[shape=box,color=green, style=filled]");   
// 
 ver.write(aux.nombreJugadorZom +aux.cantidad+ " -> "+temp.getNombre()+ ";");
 ver.write(temp.nombre+ "[shape=box,color=green, style=filled]");
  while(temp.sig !=null){
       ver.write(temp.getNombre()+ " -> "+temp.sig.nombre+ ";");
       ver.write(temp.sig.nombre+ "[shape=box,color=green, style=filled]");   
 
    temp = temp.sig;
    }
  
 
 
    
    
        
      //  ver.write(nuevo123.nombre_jugador + nuevo123.cantidad+ "->"+ + ";");

//    while(temp.sig !=null){
//       //ver.write(nuevo123.nombre_jugador + nuevo123.cantidad+ "->"+ temp.sig.nombre + ";");
//     ver.write(temp.nombre+ "[shape=box,color=blue, style=filled]");
//       
//    temp= temp.sig;
//    }
        //ver.write(aux.nombreJugadorZom+aux.cantidad+ "->"+aux.nombreJugadorZom+aux.cantidad+ ";");

         

//       
      //NodoCampo_Zombie temp;
      
       
       
        //System.out.println(aux.nombreJugadorZom+aux.cantidad);
       
   // tem = inicio;
      //  System.out.println("vvvvv"+tem2.nombreJugadorZom);
    
//        NodoCampo_Zombie z = tem2.inicio;
//        System.out.println(z.nombreJugadorZom);
//    
//    
//        System.out.println(tem2.nombreJugadorZom);
//    
//    ver.write(nuevo123.nombre_jugador + nuevo123.cantidad+ " -> "+ tem2.nombreJugadorZom+tem2.cantidad + ";");
//      ver.write(tem2.nombreJugadorZom+tem2.cantidad + "[shape=box,color=yellow, style=filled]");
//      
//       while(tem2.sig!=null){
//     ver.write(tem2.nombre+ " -> "+ tem2.sig.nombre + ";");
//      ver.write(tem.sig.nombre + "[shape=box,color=yellow, style=filled]");
//    tem2= tem2.sig;
//    }
//          ver.write(j.nombre + " -> " + nuevo123.nombre_jugador + nuevo123.cantidad + ";"); // apunta al nodo que voy hacer..
//        ver.write(j.nombre + "[shape=box,color=blue, style=filled]");
//        ver.write("graph[size=\"40,20\"];");// frmato imagen
//        ver.write(nuevo123.nombre_jugador + "" + nuevo123.cantidad + "[shape=box,color=red, style=filled]"); // agrega forma de imagen
//      

      // System.err.println(tem2);
        // NodoCampo_planta  t:
        //NodoCampo_Zombie z= t.abajo.inicio;
        // System.out.println(z.nombreJugadorZom);
        //ver.write(z.nombre +"[shape=box,color=blue, stle=filled]");
        ver.write("}");
        ver.close();
        Runtime.getRuntime().exec("dot -Tpng lista.dot -o lista.png");

        Runtime.getRuntime().exec("eog lista.png");

        try {

            //java.io.File out = new java.io.File(archivo);
            //gv.writeGraphToFile(gv.getGraph( gv.getDotSource(), formato), out);
            return 0;
        } catch (Exception e) {
            return -3;
        }

    }

}
