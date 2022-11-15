/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea4;

import vehiculo.Vehiculo;

/**
 *
 * @author Rafael Alejandro
 */
public class automovil extends Vehiculo{
    
    public automovil(){
        
    }
    
    public automovil(int gas,int ele){
        if (ele == 1){
        System.out.println("Gasolina");
        this.encenderAutomovil(gas);
        this.avanzaAutomovil(gas);
        System.out.println("     ");
        }
        else{
         System.out.println("Electrico");
         this.encenderAutomovil(gas);
         this.avanzaAutomovil(gas);
         System.out.println("     ");
        }
    }
    
    private void encenderAutomovil(int gas){
        if (gas > 1)
            System.out.println("Automovil encendido");
        else
              System.out.println("No y falta combustible");
    }
    
        private void avanzaAutomovil(int gas){
        if (gas > 1 && gas < 10)
            System.out.println("Nivel bajo de combustible");
        else
              System.out.println("No y falta combustible");
    }
}
