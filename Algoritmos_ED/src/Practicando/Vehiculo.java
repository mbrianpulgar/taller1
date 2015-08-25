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
public class Vehiculo {
    
    private String marca;
    private String tipo;
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero,climatizador;
    
    
    public Vehiculo( int ruedas, int largo, int ancho, int peso_plataforma){ // Constructor
        
             
        this.ruedas=ruedas;
        this.largo=largo;
        this.ancho=ancho;
        this.peso_plataforma=peso_plataforma;
              
    }
    
    public String dime_datos_generales(){ //Metodo Getter
        
         return "DATOS GENERALES:\nRuedas: "+ruedas+"\n"
                 + "Largo: "+ largo/1000+" mt\nAncho: "+ancho+" cm\n"
                 + "Peso plataforma: "+peso_plataforma+" kg";
        
    }
    
    public void establece_color(String color){ //Metodo Setter
        
       this.color=color;
        
    }
    
    public void establece_tipo_vehiculo(String tipo){
        
        this.tipo=tipo;
        
    }
    
    public void establece_marca(String marca){
        
        this.marca=marca;
    }
    
    public String dime_marca(){
        
        return "Marca del Vehiculo : "+marca;
        
    }
    
    public String dime_tipo_vehiculo(){
        
        return "Tipo del vehiculo : "+tipo;
        
    }
       
    public String dime_color(){ //Metodo Getter
        
        return "Color del Vehiculo : "+color;
        
    }
    
    public void configura_asientos(String asientos_cuero){ // Setter
        
        if(asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero=true;
        }
        else{
            this.asientos_cuero=false;
        }
    }
    
    public String dime_asientos(){ //Getter
        
        if(asientos_cuero==true){
            return "El Vehiculo tiene asientos de cuero";
        }
        else{
            return "El Vehiculo no tiene asientos de cuero";
        }
    }
    
}
