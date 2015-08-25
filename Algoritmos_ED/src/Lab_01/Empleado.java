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
public class Empleado {
    
    private final String nombre;
    private String seccion;
    private  int Id;
    private static int Id_siguiente=1;
    
    public Empleado(String nombre){
        
        this.nombre=nombre;
        Id=Id_siguiente;
        Id_siguiente++;
        seccion="Administracion";
        
        
    }
    
    public void cambiar_seccion(String seccion){
        
        this.seccion=seccion;
        
        
    }
    
    public String dime_datos(){
        
         return "Nombre: "+nombre+"\nSección: "+seccion+"\nId :"+Id+"\n";
        
    }
}
