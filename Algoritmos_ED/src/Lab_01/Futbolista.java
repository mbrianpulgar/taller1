/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_01;

/**
 *
 * @author MICHAEL
 */
public class Futbolista extends Equipo_de_Futbol {
    
    String posicion;
    
    public Futbolista(String nombre, String pais, int anio, int mes, int dia, String posicion){
        
        super(nombre,pais,anio,mes,dia);
        
        this.posicion=posicion;
        
    }
    
    public String dime_posicion(){
        
        return posicion;
        
    }
    
  
    
    
}
