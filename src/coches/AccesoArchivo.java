/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coches;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Javi
 */
public abstract class AccesoArchivo {
    
    //PARA AGREGAR AUTOMÁTICAMENTE LOS IMPORTS EN NETBEANS
    //PODEMOS USAR EL ATAJO DE TECLADO SHIFT + [TECLA DE SISTEMA] + I
    
     public static void grabarDatosEnArchivo(ArrayList<Coche> array) 
            //Necesitamos lanzar estas excepciones 
            throws FileNotFoundException, IOException
    
     { 
         //Creamos un archivo
        File f = new File("datos.csv");
        
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        
        //Recorremos toda la colección
        for (Coche c : array) {
            
            String str = new String();
            
            //OJO! Todo esto es una sola línea
            str += c.getId();  //strVector[0]
            str += ";";
            str += c.getMarca();  //strVector[1]
            str += ";";
            str += c.getMatricula();  //strVector[2]
            str += ";";
            str += c.getModelo();    //strVector[3]
            str += ";";
            str += c.getTipo();      //strVector[4]
            str += ";";
            str += Integer.toString(c.getMasa()); //strVector[5]
            str += "\n";
            
            //Grabamos la string creada
            bw.write(str);
            
        }
        
        //OJO!!! ES MUY IMPORTANTE CERRAR LOS FLUJOS
        bw.close();
        fw.close();
        
    }
     
     /**
     * Método que lee los datos desde el archivo y los 
     * graba en la caché del sistema 
     */
    public static void leerDatosDesdeArchivo() 
            //Necesitamos lanzar estas excepciones 
            throws FileNotFoundException, IOException{
             
        File f = new File("datos.csv");
        
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        
        //String para recuperar los datos del archivo
        String str;

        while ((str = br.readLine()) != null)
        {
           //Vector o array para dividir los datos
           String[] strVector;
           
           //"Partimos" los datos separados por el carácter ;
           //en el archivo
           strVector = str.split(";");
           
           //Creamos un objeto coche para
           //setearlo con los valores que recuperemos
           //del archivo
           Coche c = new Coche(); 
           
           //Seteamos valores
           c.setId(strVector[0]);
           c.setMarca(strVector[1]);
           c.setMatricula(strVector[2]);
           c.setModelo(strVector[3]);
           c.setTipo(strVector[4]);
           c.setMasa(Integer.parseInt(strVector[5]));
            
           //Añadimos al arrayList
           Main.arrayListCoche.add(c);
        }
        
        //IMPORTANTE CERRAR LOS FLUJOS
        br.close();
        fr.close();
        
    }
    
}
