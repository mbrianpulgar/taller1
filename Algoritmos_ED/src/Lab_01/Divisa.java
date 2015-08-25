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
    public class Divisa {
    
        String nombre;
        int factor_cambio;

        public Divisa(){            
            }
        
        public void transformar(String n, int boton){
            this.nombre = n;
            this.factor_cambio = boton;            
            }
    
        void imprimir(){
            System.out.println("El nombre de la divisa es: "+this.nombre);
            System.out.println("El factor de cambio es: "+this.factor_cambio);
            }

       public int convertir(int dinero){            
            int total = dinero * this.factor_cambio;
            return(total);
            }       
    }
