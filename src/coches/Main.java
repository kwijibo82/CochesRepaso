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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo v = new Vehiculo("deTierra", 1500);
        
        v.setMasa(2200);
        v.setTipo("Coche");
        
        //System.out.println(v.toString());
        
        Coche c = new Coche("1111AAA", "Ford", "Focus", "Utilitario"
                , 1900);
        
        
        //sout + tab "printa" directamente System.out.println("");
        System.out.println(c.toString());
        
        //La clase Object es la padre de todas las clases
        //Se heredan dos métodos, el método equals()
        //y el método toString()
        
    }
    
}
