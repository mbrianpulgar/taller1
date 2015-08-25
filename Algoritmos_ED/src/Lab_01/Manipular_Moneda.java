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
public class Manipular_Moneda {
    
    public static void main(String[] args) {
        
        Scanner teclado =  new Scanner(System.in);        
      
        Divisa Dolar = new Divisa();
        Divisa Euro = new Divisa();
        Divisa PesoArgentino = new Divisa();
        
           
        int opcion = 1;
        
        while(opcion < 4){
            String nombre =" ";
            int boton = 0;
            System.out.println("1. Ingrese información del Dolar");
            System.out.println("2. Ingrese informacion del Euro");
            System.out.println("3. Ingrese informacion del Peso Argentino");
            int moneda = teclado.nextInt();
            if (moneda == 1){
                if (Dolar.factor_cambio == 0){
                    nombre = "DOLAR";    
                    System.out.println("Ingrese la moneda de cambio de : Dolar");
                    boton = teclado.nextInt();
                    Dolar.transformar(nombre, boton);
                    opcion++;
                    }
                }
            if (moneda == 2){
                if (Euro.factor_cambio == 0){
                    nombre = "Euro";    
                    System.out.println("Ingrese la moneda de cambio de: Euro");
                    boton = teclado.nextInt();
                    Euro.transformar(nombre, boton);
                    opcion++;
                    }
                }
            if (moneda == 3){
                if (PesoArgentino.factor_cambio == 0){
                    nombre = "PesoArgentino";    
                    System.out.println("Ingrese la moneda de cambio de: Peso Argentino");
                    boton = teclado.nextInt();
                    PesoArgentino.transformar(nombre, boton);
                    opcion++;
                    }
                }                      
            }       

      int opcion2 = 0;
      do{
          
        System.out.println("1.Ver datos ingresados del Dolar");
        System.out.println("2.Ver datos ingresados del Euro");
        System.out.println("3.Ver datos ingresados del Peso Argentino");                        
        System.out.println("4.Salir");   
        opcion2 = teclado.nextInt();
        
        switch(opcion2){
            case 1: Dolar.imprimir(); 
                    break;
            case 2: Euro.imprimir(); 
                    break;                            
            case 3: PesoArgentino.imprimir(); 
                    break;
            }
       }
      while(opcion2 != 4);
        
      int opcion3 = 0;
      int cambio = 0;
      int billetes = 0;
      
      do{
        System.out.println("1. Dolar a Pesos Chilenos");
        System.out.println("2. Euro a Pesos Chilenos");
        System.out.println("3. Peso Argentino a Pesos Chilenos");                        
        System.out.println("4. Salir");                                            
        opcion3 = teclado.nextInt();
        
        switch(opcion3){
            case 1: System.out.println("Ingrese la cantidad de Dolares");
                    billetes = teclado.nextInt();
                    cambio = Dolar.convertir(billetes); 
                    System.out.println("     DATOS FINALES: ");                    
                    System.out.println("DIVISA    : "+Dolar.nombre);                    
                    System.out.println("CAMBIO  : "+Dolar.factor_cambio);                    
                    System.out.println("PESOS CHI  : "+cambio);                    
                    System.out.println("\n");                    
                    break;
            case 2: System.out.println("Ingrese la cantidad de Euros");
                    billetes = teclado.nextInt();
                    cambio = Euro.convertir(billetes); 
                    System.out.println("     DATOS FINALES: ");                    
                    System.out.println("DIVISA    : "+Euro.nombre);                    
                    System.out.println("CAMBIO  : "+Euro.factor_cambio);                    
                    System.out.println("PESOS CHI  : "+cambio);                    
                    System.out.println("\n");                    
                    break;
            case 3: System.out.println("Ingrese la cantidad de Pesos Argentinos");
                    billetes = teclado.nextInt();
                    cambio = PesoArgentino.convertir(billetes); 
                    System.out.println("     DATOS FINALES: ");                    
                    System.out.println("DIVISA    : "+PesoArgentino.nombre);                    
                    System.out.println("CAMBIO  : "+PesoArgentino.factor_cambio);                    
                    System.out.println("PESOS CHI  : "+cambio);                    
                    System.out.println("\n");                    
                    break;
                
            }
       }while(opcion3 != 4);     
      
    }
               
 }
