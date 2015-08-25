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
public class Furgon extends Vehiculo {
    
    private int capacidad_carga;
    private int asientos_extra;
    
    public Furgon( int ruedas, int largo, int ancho, int peso_plataforma,int asientos_extra, int capacidad_carga){
        
        super(ruedas,largo,ancho,peso_plataforma);
        
        this.capacidad_carga=capacidad_carga;
        this.asientos_extra=asientos_extra;
        
    }
    
    public String dime_datos_furgon(){
        
        return "DATOS EXCLUSIVOS :\nCapacidad de carga: "+capacidad_carga+"\nAsientos extra: "+asientos_extra;
        
    }
}
