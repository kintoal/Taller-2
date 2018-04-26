/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller2;
import becker.robots.*;


public class Persona {
    
   private int calle;
   private int avenida; 
   private Thing objeto; 

    public Persona(int calle, int avenida, Thing objeto) {
        this.calle = calle;
        this.avenida = avenida;
    }

    public int getCalle() {
        return calle;
    }

    public void setCalle(int calle) {
        this.calle = calle;
    }

    public int getAvenida() {
        return avenida;
    }

    public void setAvenida(int avenida) {
        this.avenida = avenida;
    }

    public Thing getObjeto() {
        return objeto;
    }

    public void setObjeto(Thing objeto) {
        this.objeto = objeto;
    }
    
   
   
}
