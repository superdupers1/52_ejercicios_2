/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numeros_aleatorios_y_menus;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class e28 {
    public static void main(String[] ar){
     Random aleatorios = new Random();
     int numero;
     numero =  aleatorios.nextInt(2); 

     if ( 0 == numero ){
            System.out.println("\nEl resultado es cara.");
     }else{ 
        System.out.println("\nEl resultado es cruz.");
     }    

    }
    
}
