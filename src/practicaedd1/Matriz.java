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
public class Matriz {
    NodoMatriz primero;
    NodoMatriz ultimo;

    public Matriz() {
      primero = null;
    }
    
    public boolean vacio(){
    return primero==null;
    }
    
   
    public void dibTablero(int n, int m){
      NodoMatriz nuevo = new  NodoMatriz(n, m);
    
    for (int i=1;i<=n;i++)
    {
      if(primero==null)
             {
              primero = nuevo;
              ultimo = nuevo;
               
               NodoMatriz aux = nuevo;
               for (int j=0;j<m;j++)
               { 
               if(aux.abajo==null)
               {
                 NodoMatriz otro = new NodoMatriz(n,m);
                 aux.abajo = otro;
                 otro.arriba=aux;
                 aux=otro;
                 
               }
               } 
               
             }else
              {
                  ultimo.der = nuevo;
                  nuevo.izq = ultimo;
                  ultimo=nuevo;
                 
              NodoMatriz aux = nuevo;
              for (int j=0;j<m;j++)
              { 
              if(aux.abajo==null)
              {
                 NodoMatriz nuevo2 = new NodoMatriz(n,m);
                 aux.abajo = nuevo2;
                 nuevo2.arriba=aux;
                 aux=nuevo2;
                 //System.out.println("2");
              }
              } 
              }
           }   
        
        
        
    }
    
   
    
             
        
        
    
   public int graficar() throws IOException {
         
  NodoMatriz temp;
  temp = primero;

     
       
        File archivo = new File("lista2.dot");
        BufferedWriter ver;
        ver = new BufferedWriter(new FileWriter(archivo));
        ver.write("digraph G {  ");
        
        
       
         
        // ver.write(temp.nombre + " -> " + temp.sig.nombre + ";"); 
        // ver.write(temp.nombre + "[shape=box,color=blue, style=filled]");
         //ver.write(temp.sig.nombre + "[shape=box,color=blue, style=filled]");
       
      
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
