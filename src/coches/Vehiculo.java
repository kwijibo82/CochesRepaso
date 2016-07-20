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
public class Vehiculo {
    
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
    
    
    
}
