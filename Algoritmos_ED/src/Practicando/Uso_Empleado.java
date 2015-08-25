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
public class Uso_Empleado {
    
    public static void main(String[] args) {
       /* 
        Empleado empleado1= new Empleado("Michael", 85000, 1990, 12, 17);
        Empleado empleado2= new Empleado("Esteban", 80000, 1995, 6, 02);
        Empleado empleado3= new Empleado("Roberto", 50000, 2000, 03, 10);
        
        empleado1.subir_sueldo(5);
        empleado2.subir_sueldo(5);
        empleado3.subir_sueldo(5);
        
        System.out.println("Nombre: "+empleado1.dime_nombre()+" Sueldo: "+empleado1.dime_sueldo()
        +" Fecha contrato: "+empleado1.dime_fecha_contrato());
               */
        
        Jefatura  jefe_RRHH= new Jefatura("Rene Galarce",100000,1999,12,3);
        jefe_RRHH.establece_incentivo(2570);
        
        
        Empleado [] mis_empleados= new Empleado [7];
        
        mis_empleados[0]= new Empleado("Michael Pulgar", 50000, 2012, 12, 10);
        mis_empleados[1]= new Empleado("Esteban Contreras", 30000, 2014, 03, 23);
        mis_empleados[2]= new Empleado("Roberto Valdes", 20000, 2002, 02, 05);
        mis_empleados[3]= new Empleado("Nicolas Gerrero");
        mis_empleados[4]= jefe_RRHH;//Polimorfismo, principio de sustitucion
        mis_empleados[5]=new Jefatura("Camila Palacios", 50000, 2001, 02, 05);
        mis_empleados[6]=new Jefatura("Fernando Lillo",70000,1990,3,02);
        
        for(Empleado e: mis_empleados){
            
            e.subir_sueldo(5);
        }
        
        for(Empleado e: mis_empleados){
            
            System.out.println("Nombre: "+e.dime_nombre()+"\nSueldo: "+e.dime_sueldo()+"\nFecha contrato: "+e.dime_fecha_contrato()+"\n");
        }
        
    }
    
}
