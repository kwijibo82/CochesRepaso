/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coches;

/**
 *
 * @author Javi
 */
public abstract class Seguridad {
    
    //"FÓRMULA" CONSTANTES
    //static + final + [tipo] + nombre
    
    //Ejemplo en C
    //#define MAX_VELOCIDAD 100;
    
    static final float MAX_VELOCITY = 100;
    
    //LAS CLASES ABSTRACTAS NO PUEDEN INSTANCIAR
    //OBJETOS
    
    //Recordad que por defecto el modificador de acceso es private
    boolean alertaVelocidad;
    boolean estadoAirbags;
    boolean estadoCinturones;
      
    
    //Las cabeceras salen en negrita ya que entran en Javadoc
    //como nueva documentación
    
    /**
     * Determina si se ha traspasado la velocidad máxima
     * @param velocidad
     * @return 
     */
    public boolean velocidadMaxima(int velocidad) {
        
        alertaVelocidad = false;
        
        if (velocidad > 100) {
            
            alertaVelocidad = true;
            
        }
        
        return alertaVelocidad;
    }
    
}
    
    
    