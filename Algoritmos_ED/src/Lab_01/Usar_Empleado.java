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
public class Usar_Empleado {
    
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Michael Pulgar");
        Empleado empleado2 = new Empleado("Esteban Contreras");
        Empleado empleado3 = new Empleado("Roberto Valdes");
        empleado1.cambiar_seccion("RR.HH");
        
        System.out.println(empleado1.dime_datos());
        System.out.println(empleado2.dime_datos());
        System.out.println(empleado3.dime_datos());
        
    }
}
