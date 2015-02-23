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
public class Lista_CatZombie {
    NodCat_Zombie inicio;
    NodCat_Zombie  ultimo;

    int tamaño;
    int cont;

    public Lista_CatZombie(){
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
    
     public  NodCat_Zombie Agregar_Inicio(String ruta, String nombre, int puntos, String Tip_Ataque){
        cont++;
      NodCat_Zombie nuevo = new NodCat_Zombie(ruta, nombre, puntos, Tip_Ataque);
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
      NodCat_Zombie temp;
    temp = inicio;
    while(temp !=null){
        System.out.println("Zombi: "+temp.nombre);
        temp= temp.sig;
    
    }
        
    
}
    
}
