/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicando;

/**
 *
 * @author MICHAEL
 */
public class Jefatura extends Empleado{
    
    private double incentivo;
    
    public Jefatura(String nombre, int sueldo, int anio, int mes, int dia){
        
        super(nombre,sueldo, anio,mes,dia);
        
    }
    
    public void establece_incentivo(double b){
        
        incentivo=b;
        
    }
    
    public double dime_sueldo(){
        
       double sueldo_jefe=super.dime_sueldo();
       
        return sueldo_jefe + incentivo;
    }
}
