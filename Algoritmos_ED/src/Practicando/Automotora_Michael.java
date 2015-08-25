/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicando;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author MICHAEL
 */
public class Automotora_Michael {
    
 
    
    public static void main(String[] args) {
        
        
        
        Furgon furgon_uno = new Furgon(4,2000,300,500,3,580);
        
        
        System.out.println(furgon_uno.dime_datos_generales());
        furgon_uno.establece_marca("Chevrolet");
        System.out.println(furgon_uno.dime_marca());
        furgon_uno.establece_tipo_vehiculo("Furgón\n");
        System.out.println(furgon_uno.dime_tipo_vehiculo());
        System.out.println(furgon_uno.dime_datos_furgon());
        furgon_uno.establece_color(JOptionPane.showInputDialog("De que color es el Furgón"));
        System.out.println(furgon_uno.dime_color());
        furgon_uno.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        System.out.println(furgon_uno.dime_asientos());
        
    }
}
