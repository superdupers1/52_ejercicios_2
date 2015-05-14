/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles_anidados_y_subprogramas;

import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class e20 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int suma=1;
        System.out.println("Ingrese un numero");
        int n=sc.nextInt();

        for(int i=n;i>1;i--){
        suma=suma*i;
        }
        System.out.println("El factorial de "+n+" es "+suma);
} 
    
}
