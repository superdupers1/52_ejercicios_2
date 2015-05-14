/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numeros_aleatorios_y_menus;

import java.util.Random;

/**
 *
 * @author Cesar
 */
public class e29 {
    public static void main(String[] ar){
        Random aleatorio = new Random();
        int dado1=0;
        int dado2=0;
        int cont=0;
        
        
        for (int i = 0; i < 100; i++) {
        dado1 =  aleatorio.nextInt(6);
        dado2 = aleatorio.nextInt(6);    
        if (dado1+dado2 == 10) {
            cont = cont+1;
        }
        }
        
        
        
        System.out.print("el numero 10 se repitio "+cont+" veces");
        
    }
    
}
