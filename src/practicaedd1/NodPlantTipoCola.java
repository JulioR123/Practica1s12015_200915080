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
public class NodPlantTipoCola {
    NodPlantTipoCola sig;
    String ImaRutaPtC;
    String nombrePtC;
    int puntotC;
    String tip_ataque;

    public NodPlantTipoCola() {
    sig = null;
    ImaRutaPtC = "";
    nombrePtC = "";
    puntotC =0;
    tip_ataque="";
    
    
    }

    public NodPlantTipoCola( String ImaRutaPtC, String nombrePtC, int puntotC, String tip_ataque) {
        this.sig = null;
        this.ImaRutaPtC = ImaRutaPtC;
        this.nombrePtC = nombrePtC;
        this.puntotC = puntotC;
        this.tip_ataque = tip_ataque;
    }

    

    public String getImaRutaPtC() {
        return ImaRutaPtC;
    }

    public void setImaRutaPtC(String ImaRutaPtC) {
        this.ImaRutaPtC = ImaRutaPtC;
    }

    public String getNombrePtC() {
        return nombrePtC;
    }

    public void setNombrePtC(String nombrePtC) {
        this.nombrePtC = nombrePtC;
    }

    
    
}
