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
public class Lista_Cat_Planta {
   public  Nod_Cat_planta inicio;
     Nod_Cat_planta  ultimo;

    int tamaño;
    int cont;

    public Lista_Cat_Planta(){
        inicio = null;
        ultimo = null;
        tamaño = 0;
        cont=0;
    }
    
    /*
     * Metodo que permite verificar si la lista esta vacia.
     */
    public boolean Vacio(){
        return (inicio==null);
    }
    

    public int Tamaño(){
        return tamaño;
    }
    
     public   Nod_Cat_planta Agregar_Inicio(String ruta, String nombre, int puntos, String Tip_Ataque){
       // cont++;
       Nod_Cat_planta nuevo = new  Nod_Cat_planta(ruta, nombre, puntos, Tip_Ataque);
        if(Vacio()){
            inicio = nuevo;
            ultimo = nuevo;
            return inicio;
        }
        else{
            nuevo.sig = inicio;
            inicio = nuevo;
            return nuevo;
        }
  
    }
  public void recorrer(){
       Nod_Cat_planta temp;
    temp = inicio;
    while(temp !=null){
        System.out.println("Panta: "+temp.nombre);
        temp= temp.sig;
    
    }
        
    
}
  
  public void Eliminar_Nodo(int indice){
        Nod_Cat_planta actual = inicio;
        if(indice == 0){
            inicio = inicio.sig;
        }
        else{
            Nod_Cat_planta siguiente = inicio.sig;
            for(int i = 1;i<indice;i++){
                actual = siguiente;
                siguiente = siguiente.sig;
            }

            if(siguiente == ultimo){
                ultimo = actual;
            }
            actual.sig = siguiente.sig;
        }
        tamaño--;
    }
 
  
  
  
  public void borrarPrimero(){
      inicio = inicio.sig;
  
  }
  
  
  
  public Nod_Cat_planta  retornarPrimero(){
  
  return inicio;
  
  }
  
   public int graficar(Lista_CatZombie aux) throws IOException {
         
Nod_Cat_planta temp;
temp = inicio;

     
       
        File archivo = new File("lista2.dot");
        BufferedWriter ver;
        ver = new BufferedWriter(new FileWriter(archivo));
        ver.write("digraph G {  ");
        ver.write(temp.nombre + "[shape=box,color=blue, style=filled]");
        while(temp.sig!=null){
        ver.write(temp.nombre + " -> " + temp.sig.nombre + ";"); 
        ver.write(temp.nombre + "[shape=box,color=blue, style=filled]");
        ver.write(temp.sig.nombre + "[shape=box,color=blue, style=filled]");
        temp = temp.sig;
        
        }
        
        NodCat_Zombie tem2= aux.inicio;
      
        
          ver.write(tem2.nombre + "[shape=box,color=green, style=filled]");
         while(tem2.sig!=null){
        ver.write(tem2.nombre + " -> " + tem2.sig.nombre + ";"); 
      ver.write(tem2.sig.nombre + "[shape=box,color=green, style=filled]");
        tem2 = tem2.sig;
        
        }    
              
              
              //  System.err.println(tem2.nombre);
      
        
       
        
        
        temp= inicio;
        ver.write("{rank=source;");
        ver.write("\"" + temp.nombre + "\";");
        while (temp != null) {
            ver.write("\"" + temp.nombre + "\";");
           temp = temp.sig;
        }
        ver.write("}");
        
        temp= inicio;
        ver.write("{rank=source;");
        ver.write("\"" + temp.nombre + "\";");
        while (temp != null) {
            ver.write("\"" + temp.nombre + "\";");
           temp = temp.sig;
        }
        ver.write("}");
        

         tem2= aux.inicio;
        ver.write("{rank=same;");
        ver.write("\"" + tem2.nombre + "\";");
        while (tem2 != null) {
            ver.write("\"" + tem2.nombre + "\";");
           tem2 = tem2.sig;
        }
        ver.write("}");
        
        
//         tmpM = aux.listaM.inicio;
//        ver.write("{rank=source;");
//        ver.write("\"" + aux.nombre + "\";");
//        while (tmpM != null) {
//            ver.write("\"" + tmpM.nombre + "\";");
//            tmpM = tmpM.siguiente;
//        }
//        ver.write("}");

     // ver.write(j.nombre + "[shape=box,color=blue, style=filled]");
      //ver.write(j.nombre + " -> " + nuevo123.nombre_jugador + nuevo123.cantidad + ";"); 
       
  
 
 
    
    
      
        ver.write("}");
        ver.close();
        Runtime.getRuntime().exec("dot -Tpng lista2.dot -o lista2.png");

        Runtime.getRuntime().exec("eog lista2.png");

        try {

            //java.io.File out = new java.io.File(archivo);
            //gv.writeGraphToFile(gv.getGraph( gv.getDotSource(), formato), out);
            return 0;
        } catch (Exception e) {
            return -3;
        }

    }


  
}
