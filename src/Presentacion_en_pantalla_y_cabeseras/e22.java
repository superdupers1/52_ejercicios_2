/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion_en_pantalla_y_cabeseras;

import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class e22 {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.print("introdusca una frase :");
        frase = sc.nextLine();
     
        String espacio="";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print(frase);
                espacio = espacio + "    ";
            }System.out.print("\n"+espacio);
        }
        
        
    }    
}
