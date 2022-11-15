/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea4;

/**
 *
 * @author Rafael Alejandro
 */
public class Avion {
    
    public Avion(){
        
    }
    
    public Avion(int gas,int ele){
        if (ele == 1){
        System.out.println("Gasolina");
        this.encenderAvion(gas);
        this.avanzaAvion(gas);
        System.out.println("     ");
        }
        else{
         System.out.println("Electrico");
         this.encenderAvion(gas);
         this.avanzaAvion(gas);
         System.out.println("     ");
        }
    }
    
    private void encenderAvion(int gas){
        if (gas > 1)
            System.out.println("Avion encendido");
        else
              System.out.println("No y falta gasolina");
    }
    
        private void avanzaAvion(int gas){
        if (gas > 1 && gas < 10)
            System.out.println("Nivel bajo de gasolina");
        else
              System.out.println("No y falta gasolina");
    }
    
}
