/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_01;
import java.util.*;

/**
 *
 * @author MICHAEL
 */
public class Equipo_de_Futbol {
 
    private final String nombre;
    private String pais;
    private Date fecha;
    private boolean entrenamiento;
    
    
    public Equipo_de_Futbol(String nombre, String pais, int anio, int mes, int dia){
        
        this.nombre=nombre;
        this.pais=pais;
        GregorianCalendar calendario = new GregorianCalendar(anio,mes-1,dia);
        fecha=calendario.getTime();
        
    }
    
    public String dime_nombre(){
        
        return nombre;
        
    }
    
    public String dime_pais(){
       
        return pais;
        
    }
    
    public Date dime_fecha(){ //get
        
        return fecha;
        
    }
    
    public void establece_entrenamiento(String entrenamiento){
        
        if(entrenamiento.equalsIgnoreCase("si")){
            this.entrenamiento=true;
        }
        else{
            this.entrenamiento=false;
        }
        
    }
    
     public String dime_entrenamiento(){ //Getter
        
        if(entrenamiento==true){
            return "Dentro de poco empezará el entrenamiento";
        }
        else{
            return "El entrenamiento se suspende por temporal";
        }
    }
    
}
    

