/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_01;

/**
 *
 * @author MICHAEL
 */
public class Dirigir_club {
    
    public static void main(String[] args) {
        
        Equipo_de_Futbol club = new Equipo_de_Futbol("Barcelona","España",1899,11,29);
        System.out.println("Nombre Club: "+club.dime_nombre()+"\nPais de origen: "+club.dime_pais()+"\nFundación: "+club.dime_fecha()+"\n");
        Futbolista jugador = new Futbolista ("Claudio Bravo","Chile",1983,4,13,"Arquero");
        System.out.println("Nombre Jugador: "+jugador.dime_nombre()+"\nPais de origen: "+jugador.dime_pais()+"\n"
                + "Nacimiento: "+jugador.dime_fecha()+"\nPosición: "+jugador.dime_posicion());
        
        
        
    }
        
    
}
