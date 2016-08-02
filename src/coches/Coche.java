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

//JAVA NO ACEPTA MULTI HERENCIA!!!!
public class Coche extends Vehiculo implements Gps, Audio {
    //Con el atajo de teclado ALT + Enter implemento las
    //métodos de las interficies
    
    String matricula;
    String marca;
    String modelo;

    public Coche(String matricula, String marca, 
            String modelo, String tipo, int masa, String id) {
        
        //El constructor super está llamando a la clase padre
        //y pasándole los parámetros String tipo y int masa
        super(tipo, masa, id);
        
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Coche() {
        super();
        
    }

    
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Vehiculo id:");
        sb.append(id);
        sb.append("\n---------------\n");
        sb.append("Matricula: ");
        sb.append(matricula);
        sb.append("\n");
        sb.append("Marca: ");
        sb.append(marca);
        sb.append("\n");
        sb.append("Modelo: ");
        sb.append(modelo);
        sb.append("\n");
        
        sb.append("HEREDADOS DE OBJECT");
        sb.append("\n");
        
        sb.append("Tipo: ");
        sb.append(tipo);
        sb.append("\n");
        sb.append("Masa: ");
        sb.append(masa);
        
        sb.append("\n---------------\n");
        
        return sb.toString();
        
    }

    //MÉTODOS GETTERS Y SETTERS
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //CUANDO SE IMPLEMENTA UNA INTERFICIE SE TIENEN
    //QUE IMPLEMENTAR OBLIGATORIAMENTE TODOS SU
    //MÉTODOS
    
    @Override
    public void localizarPosicion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarCaminoCorto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean traficOptimo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarEmisora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void subirVolumen() {
        
    }

    @Override
    public void bajarVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 

    
}
