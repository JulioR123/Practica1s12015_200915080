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
public class ListaPTipoCola {
    
    NodPlantTipoCola cabeza,cola;
    int tam=0;

    public ListaPTipoCola() {
    cabeza=cola=null;
    }
    
    public boolean  vacio (){
        if(cabeza==null){
          return true;
        }
        else{
            return false;
        }
    
    }
    
    public void insertarCola(Nod_Cat_planta p){
        NodPlantTipoCola nuevo = new NodPlantTipoCola(p.rutaImagenP,p.nombre,p.puntos,p.Tipo_ataque);
        nuevo.sig=null;
        if(vacio()){
          cabeza=nuevo;
          cola=nuevo;
          tam++;
        
        }
        else{
        
            cola.sig=nuevo;
            cola=nuevo;
            tam++;
        
        }
        
      }
    
    public NodPlantTipoCola extraerCola(){
        
        if(!vacio()){
            if(cabeza==cola){
                cabeza=null;
                cola=null;
            return cabeza;
            }else{
            
                cabeza= cabeza.sig;
                
            }
        
            return cabeza;
        }
        
       return null;
    }
    int contador=1;
    public void recorrerCola(){
    
    
        NodPlantTipoCola tem;
        tem= cabeza;
        
        while(tem!=null){
        
            System.out.println("Agrego a Cola "+contador+"datos " +tem.nombrePtC);
            contador++;
            
        tem = tem.sig;
        }
        
    }
    
    
public int graficar() throws IOException {
         

          NodPlantTipoCola tem;
          tem=cabeza;
         
     
      
        File archivo = new File("lista4.dot");
        BufferedWriter ver;
        ver = new BufferedWriter(new FileWriter(archivo));
        ver.write("digraph G {  ");
        System.out.println("aqui llega");
        if(tem!=null){
     
            System.err.println("entrando");
   ver.write("COLA" + " -> " + tem.nombrePtC + ";"); 
    ver.write("COLA" + "[shape=box,color=blue, style=filled]");
   ver.write(tem.nombrePtC + "[shape=box,color=brown, style=filled]");
//    
    System.err.println("+entrando");
   tem= cabeza;
   while(tem.sig!=null){
    ver.write(tem.nombrePtC+ " -> " + tem.sig.nombrePtC+ ";"); 
     ver.write(tem.sig.nombrePtC + "[shape=box,color=brown, style=filled]");
    tem = tem.sig;
     System.err.println("+entrando");
   }
        
       
       
        }

    
      
        ver.write("}");
        ver.close();
        Runtime.getRuntime().exec("dot -Tpng lista4.dot -o lista4.png");

        Runtime.getRuntime().exec("eog lista4.png");

        try {

            //java.io.File out = new java.io.File(archivo);
            //gv.writeGraphToFile(gv.getGraph( gv.getDotSource(), formato), out);
            return 0;
        } catch (Exception e) {
            return -3;
        }

    }
    
}
