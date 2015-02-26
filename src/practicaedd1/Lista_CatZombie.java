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
    ListaZomTipoPila pilaZom= new ListaZomTipoPila();
    
      int id=1;
    int tamaño;
   // int cont;

    public Lista_CatZombie(){
        inicio = null;
        ultimo = null;
        tamaño = 0;
        
    //    cont=0;
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
       
        // cont++;
        NodCat_Zombie nuevo = new NodCat_Zombie(id,ruta, nombre, puntos, Tip_Ataque);
        if(Vacio()){
            inicio = nuevo;
            ultimo = nuevo;
            //tamaño++;
              
            return inicio;
        }
        else{
            nuevo.sig = inicio;
            inicio = nuevo;
            //tamaño++; 
            id++;
             
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
  
  
  public void borrarPrimero(){
      inicio = inicio.sig;
  
  }
  
  public NodCat_Zombie  retornarPrimero(){
  
  return inicio;
  
  }
  
 public void Eliminar_Nodo(int indice){
        NodCat_Zombie actual = inicio;
        if(indice == 0){
            inicio = inicio.sig;
        }
        else{
            NodCat_Zombie siguiente = inicio.sig;
            for(int i = 1;i<indice;i++){
                actual = siguiente;
                siguiente = siguiente.sig;
            }

            if(siguiente == ultimo){
                ultimo = actual;
            }
            actual.sig = siguiente.sig;
        }
        id--;
        tamaño--;
    }
 
 public NodCat_Zombie buscar(int id){
  
      NodCat_Zombie actual = inicio;
      while(actual.sig!=null){
      if(actual.clave==id){
          break;
      }else{
          System.err.println("entro");
          actual=actual.sig;
      }
      }
      System.out.println(actual.nombre);
  return actual;
  }
  
   public NodCat_Zombie Modificar(int clave, String ruta, String nombre, int puntos , String ataque) {
    
       NodCat_Zombie actual = buscar(clave);
       
       if(actual!=null){
           System.err.println("entro a modificar");
       actual.rutaImagenZ=ruta;
       actual.nombre=nombre;
       actual.puntos=puntos;
       actual.Tipo_ataque=ataque;
      
       }
       
return actual;
     
    }
    
}
