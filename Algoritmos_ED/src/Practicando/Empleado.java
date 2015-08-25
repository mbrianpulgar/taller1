/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicando;
import java.util.*;

/**
 *
 * @author MICHAEL
 */
public class Empleado {
    
    private String nombre;
    private double sueldo;
    private Date alta_contrato;
    private static int IdSiguiente;
    private int Id;
    
    public Empleado(String nombre, double sueldo, int anio, int mes, int dia){
        
        this.nombre=nombre;
        this.sueldo=sueldo;
        GregorianCalendar calendario = new GregorianCalendar(anio,mes-1,dia);
        alta_contrato=calendario.getTime();
        ++IdSiguiente;
        Id=IdSiguiente;
        
    }
    
    public Empleado(String nombre){ // sobrecarga de constructor
        
        this(nombre,10000,1992,3,12);
        
    }
    
    public String dime_nombre(){ //get
        
        return nombre + "\nId: "+ Id;
        
    }
    
    public double dime_sueldo(){ //get
        
        return sueldo;
        
    }
    
    public Date dime_fecha_contrato(){ //get
        
        return alta_contrato;
        
    }
    
    public void subir_sueldo(double porcentaje){ //set
        
        double aumento = sueldo*porcentaje/100;
        sueldo+=aumento;
    }
    
}
