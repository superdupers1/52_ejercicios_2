/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles_y_tomas_de_decicion;

import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class e11 {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        int numero=0,contador=0;
        System.out.print("introdusca numero:");
        numero = sc.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            
            if (i%3==0) {
                System.out.print(i+"-");
                contador = contador+1;
            }
        }System.out.print("hay un total de "+contador+" multiplos de 3");
    }
    
}
