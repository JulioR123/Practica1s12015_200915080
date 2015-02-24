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
public class ListaZomTipoPila {
    
  
   NodZombieTipoPila raiz;
   int tam=0;

    public ListaZomTipoPila() {
        raiz = null;
    }
    public boolean vacio (){
      return raiz ==null;
    }
    
    public void insertaPila(NodCat_Zombie z){
        
        NodZombieTipoPila nuevo = new NodZombieTipoPila(z.rutaImagenZ,z.nombre,z.puntos,z.Tipo_ataque);
        
        if(vacio()){
        
        nuevo.sig=null;
        raiz =nuevo;
        tam++;
        }
        else{
        nuevo.sig=raiz;
        raiz=nuevo;
        tam++;
        
        }
    
    }
    
    
    public NodZombieTipoPila extraerPila(){
    
       
    if(raiz!=null){
       raiz = raiz.sig;
       return raiz;
    }
    else{
    
    
    return null;
    
    }
    
    
    
    }
    
    int contador=1;
    public void recorrerPila(){
        
          NodZombieTipoPila tem;
          tem=raiz;
         
       
          while(tem!=null){
      
              System.out.println("Agrego Pila   "+contador+" Datos  "+tem.nombreZtp);
              
    contador++;
             
          tem= tem.sig;
          }
   
    }
    
    
    
    
    
 public int graficar() throws IOException {
         

          NodZombieTipoPila tem;
          tem=raiz;
         
     
      
        File archivo = new File("lista3.dot");
        BufferedWriter ver;
        ver = new BufferedWriter(new FileWriter(archivo));
        ver.write("digraph G {  ");
        if(tem!=null){
     ver.write("PILA" + "[shape=box,color=blue, style=filled]");
     
   ver.write("PILA" + " -> " + tem.nombreZtp + ";"); 
   ver.write(tem.nombreZtp + "[shape=box,color=brown, style=filled]");
//    
   tem= raiz;
   while(tem.sig!=null){
    ver.write(tem.nombreZtp + " -> " + tem.sig.nombreZtp + ";"); 
     ver.write(tem.sig.nombreZtp + "[shape=box,color=brown, style=filled]");
    tem = tem.sig;
   }
        
       
       
        }

    
      
        ver.write("}");
        ver.close();
        Runtime.getRuntime().exec("dot -Tpng lista3.dot -o lista3.png");

        Runtime.getRuntime().exec("eog lista3.png");

        try {

            //java.io.File out = new java.io.File(archivo);
            //gv.writeGraphToFile(gv.getGraph( gv.getDotSource(), formato), out);
            return 0;
        } catch (Exception e) {
            return -3;
        }

    }
    
    
}
