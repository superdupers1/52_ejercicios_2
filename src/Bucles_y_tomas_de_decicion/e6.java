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
public class e6 {
    public static void main(String[] ar){
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("introdusca un numero: ");
        numero = sc.nextInt();
        
        for (int i = 0; i < numero; i++) {
            System.out.print((i+1)+"-");
        }
    }
    
}
