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
public class e10 {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        int numero=0;
        System.out.print("introdusir numero:");
        numero = sc.nextInt();
        if (numero%2==0) {
            System.out.println("\nel numero es par");
        }else{
            System.out.println("\nel numero es impar");
        }
    }
}
