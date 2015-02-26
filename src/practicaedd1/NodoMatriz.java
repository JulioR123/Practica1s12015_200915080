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
public class NodoMatriz {
    
    NodoMatriz arriba;
    NodoMatriz abajo;
    NodoMatriz izq;
    NodoMatriz der;
    int x;
    int y;
   

    public NodoMatriz() {
      arriba=abajo=izq=der=null;
    
    }

    public NodoMatriz( int x, int y) {
        this.arriba = null;
        this.abajo = null;
        this.izq = null;
        this.der = null;
        this.x = x;
        this.y = y;
    }
    
    }
