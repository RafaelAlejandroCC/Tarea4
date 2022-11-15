/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea4;

/**
 *
 * @author Rafael Alejandro
 */
public class Tren {
    
    public Tren(){
        
    }
    
    public Tren(int gas,int ele){
        if (ele == 1){
        System.out.println("Gasolina");
        this.encenderTren(gas);
        this.avanzaTren(gas);
        System.out.println("     ");
        }
        else{
         System.out.println("Electrico");
         this.encenderTren(gas);
         this.avanzaTren(gas);
         System.out.println("     ");
        }
    }
    
    private void encenderTren(int gas){
        if (gas > 1)
            System.out.println("Tren encendido");
        else
              System.out.println("No y falta gasolina");
    }
    
        private void avanzaTren(int gas){
        if (gas > 1 && gas < 10)
            System.out.println("Nivel bajo de gasolina");
        else
              System.out.println("No y falta gasolina");
    }
    
}




