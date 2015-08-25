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
public class Cambio_Divisa {
    
    Scanner teclado = new Scanner(System.in);
    int peso_chileno;
    int dolar;
    int peso_argentino;
    int euro;
    int d;
    
    
    public Cambio_Divisa(){
             
}
    
    public void ingresa_cantidad_peso_chileno(){
        
        System.out.println("Ingresa la cantidad a convertir de CLP: ");
        peso_chileno=teclado.nextInt();
        while(peso_chileno<=0){
            System.out.println("Ingrese una cantidad válida, intente otra vez: ");
             peso_chileno=teclado.nextInt();
        }
    }
    
    public void clp_a_dolar(){
        
        dolar=peso_chileno*d;
        
    }
    
}
