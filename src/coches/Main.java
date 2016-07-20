/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coches;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Javi
 */
public class Main {
 
    static ArrayList<Coche> arrayListCoche = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
               
        //He añadido un último campo a modo de ID
       Coche c1 = new Coche("1111AAA", "Ford", "Focus", "Utilitario"
                , 1900, "A01");
       Coche c2 = new Coche("2222BBB", "Opel", "Tigra", "Deportivo"
                , 1900, "B02");
       Coche c3 = new Coche("3333CCC", "Audi", "A3", "Utilitario"
                , 1900, "C03");
       Coche c4 = new Coche("4444DDD", "Toyota", "RAV4", "Todoterreno"
                , 1900, "D04");
       Coche c5 = new Coche("5555EEE", "Renault", "Twingo", "Utilitario"
                , 1900, "E05");
       
       //llamamos al método que guarda los vehículos
        guardarvehiculo(c1);
        guardarvehiculo(c2);
        guardarvehiculo(c3);
        guardarvehiculo(c4);
        guardarvehiculo(c5);
       
        //NOTA: Conviene que vayáis estudiando el código
        //comentado y descomentando las llamadas a los
        //siguientes métodos según las pruebas que vayáis
        //haciendo
        
        //mostramos vehículos por pantalla
        imprimirVehiculosPorPantalla();
        
        //borramos un objeto, por el correspondiente al ID: D04
        buscarYBorrarVehiculos("D04");
        
        //mostramos vehículos por pantalla para comprobar que se
        //ha borrado correctamente
        imprimirVehiculosPorPantalla();
       
        //grabamos datos en archivo
        AccesoArchivo.grabarDatosEnArchivo(arrayListCoche);
        
        //leemos datos desde archivo
        AccesoArchivo.leerDatosDesdeArchivo();
        
        //mostramos vehículos por pantalla
        imprimirVehiculosPorPantalla();
        

        //APUNTES DE OTRAS SESIONES:
        //La clase Object es la padre de todas las clases
        //Se heredan dos métodos, el método equals()
        //y el método toString()
        
    }
    
    /**
     * Método que guarda un objeto vehículo en el arrayList 
     * de vehículos
     * @param c 
     */
    public static void guardarvehiculo(Coche c)
    {
        arrayListCoche.add(c);
    }
    
    /**
     * Método que muestra los vehículos almacenados en el sistema
     */
    public static void imprimirVehiculosPorPantalla()
    {      
        //Es más "académico" utilizar un bucle for con un iterator
        
        //1a Parte del bucle -->Inicilizar un objeto Iterator de la 
        //clase de la colección
        //2a Parte del bucle -->Condición de existencia de 
        //un siguiente elemento (iterator.hasNext())
        for (Iterator<Coche> iterator = arrayListCoche.iterator(); 
             iterator.hasNext();) {
            
            Coche c = iterator.next();
            
            System.out.println(c.toString());
            
        }
        
        //También podemos utilizar un bucle for-each estándar
        
        //for-each --> Para - Cada
        /* Para cada objeto de la colección
        {
            //Lógica del bucle
            
        }
        */
        
        /*for (Coche c : arrayListCoche) {
            
            System.out.println(c.toString());
            
        }*/
    }
    
    /**
     * Método que busca un objeto de la clase vehículo y lo borra
     * del arrayList de vehículos
     * @param vehiculoABorrar 
     */
    public static void buscarYBorrarVehiculos(String id)
    {
        boolean borrado = false;
        
        //Estructura for-each
        for (Coche c: arrayListCoche) {
             
            //Entra si encontramos el vehículo a borrar
            if (c.id.equals(id)) {
                
                //borra el objeto de la colección
                arrayListCoche.remove(c); 
                System.out.println("El objeto con id " + c.id + 
                        " ha sido borado");
                
                //setamos la variable de control de borrado a true
                borrado = true;
            }
        }
        
        if (!borrado) {
            
            //TODO: Programar una excepción propia
            System.out.println("No se ha encontrado ningún objeto "
                        + "con esa ID.");
            
        }
        
    }
    
}
