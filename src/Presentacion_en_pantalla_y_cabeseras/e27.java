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
public class e27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("introducir numero: ");
        n = sc.nextInt();
        
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);
        }
    }
    
}
