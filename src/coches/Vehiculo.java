/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coches;

import java.util.Comparator;

/**
 *
 * @author Javi
 */
//Para implementar automáticamente los métodos compare() y compareTo()
//utilzamos el atajo de teclado ALT + Enter
public class Vehiculo implements Comparable<Object>, Comparator<Object> {
    
    //Java por defecto asume que cuando no hay nada
    //se usa el modificador "private"
    
    String tipo;
    int masa;
    String id;
    
    /**
     * Private: Permite solo el acceso a los usuarios de la misma clase
     * Protected: Permite el acceso a los usuarios de la misma clase 
     * y de las sublclases herederas de ésta
     * Public: Permite el acceso a todos los usuarios
     */
    
    //Es una buena práctica crear un construtor en blanco
    public Vehiculo(){
        
    }
    
    //Para abrir la ventana emergente utilizamos el atajo de teclado
    //CTRL + espacio
    public Vehiculo(String tipo, int masa, String id){
        
        this.tipo = tipo; //Referencia el parámetro al atributo de la clase
        this.masa = masa;
        this.id = id;
    }

    @Override
    public String toString() {      
        
        //1a Opción y más sencilla aunque con más coste
        //return "Vehiculo{" + "tipo=" + tipo + ", masa=" + masa + '}';
        
        //2a opción más compleja pero con menos coste
        StringBuilder sb = new StringBuilder();

        sb.append("Masa: ");
        sb.append(masa);
        sb.append("\n");
        sb.append("Tipo: ");
        sb.append(tipo);
        sb.append("\n");
        sb.append("Id: ");
        sb.append(id);
        
        return sb.toString();
    }

    
    //MÉTODOS GETTERS Y SETTERS   
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Devuelve -1 sí, y solamente sí la masa del objeto comparado es menor 
     * que el objeto que invoca al método, en caso de que la masa del objeto
     * que invoca al método sea menor devuelve 1 y si por contra la masa de los
     * dos objetos son iguales se devuelve 0;
     * @param o
     * @return 
     */
    @Override
    public int compareTo(Object o) {

    //Apunte StackOverFlow:
    //http://stackoverflow.com/questions/420223/what-is-the-difference-between-compare-and-compareto
    
    //El objeto A se compara a sí mismo con el objeto B 
    //pasado como parámetro
    //objetoA.compareTo(ObjetoB)
        
        int resul = 0;
        
        //Si el objeto o es una instancia de la
        //clase Coche entramos en la condición
        if (o instanceof Coche) {
            
            resul = this.masa - ((Coche) o).masa;
            
            //Si el resultado es negatvo, resul es -1
            if (resul < 0) 
            {
                
                resul = -1; 
            }
            //Si el resultado es positivo, resul es 1;
            else if (resul > 0)
            {
               resul = 1;
            }
            
            //Y si el resultado es cero, resul es cero,
            //por tanto es redundante programar una tercera
            //condición.
            
        }
        else
        {
            System.out.println("El objeto no es comparable");
        }
            
        return resul;
    }

    /**
     * Compara la masa de los dos objetos pasados como parámetros,
     * y devuelve -1 sí, y solamente sí la masa del segundo objeto es mayor 
     * que el primero, de lo contrario devuelve 1 sí el la masa del segundo 
     * objeto es menor, en caso de que la masa de los objetos sean iguales 
     * devuelve 0.
     * @param o1
     * @param o2
     * @return 
     */
    @Override
    public int compare(Object o1, Object o2) {
        
        int resul = 0;
        
        if (o1 instanceof Coche 
                && 
            o2 instanceof Coche) 
        {
            resul = ((Coche) o1).masa - (((Coche) o2).masa);
            
            //Si el resultado es negatvo, resul es -1
            if (resul < 0) 
            {  
                resul = -1; 
            }
            //Si el resultado es positivo, resul es 1;
            else if (resul > 0)
            {
               resul = 1;
            }
            
            //Y si el resultado es cero, resul es cero,
            //por tanto es redundante programar una tercera
            //condición.
                
        }
        else
        {
            System.out.println("Los objetos no son comparables");
        }
        
        return resul;
        
    }

}
