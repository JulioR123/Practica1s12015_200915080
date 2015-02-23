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
public class ListaCampo_Zombie {
    
     
      NodoCampo_Zombie inicio;
        NodoCampo_Zombie ultimo;
         NodoCampo_Zombie nod;

    int tamaño;
    int cont;

    public  ListaCampo_Zombie(){
        inicio = null;
        ultimo = null;
        nod=null;
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
    
     
  
   
   public NodoCampo_Zombie datosZ(int cantidad, String campos){
   
     nod   = new  NodoCampo_Zombie(campos, cantidad);
      // System.out.println(nod.cantidad+nod.nombreJugadorZom);
   return nod;
   
   }
    
    
    
    public NodoCampo_Zombie Agregar_InicioZ(String nombre){
        cont++;
       NodoCampo_Zombie nuevo = new NodoCampo_Zombie(nombre);
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
    
     public void recorrer() {
        NodoCampo_Zombie temp;
        temp = inicio;
        while (temp != null) {
            System.out.println("Planta: " + temp.nombre);
            temp = temp.sig;

        }

    }
    
}
