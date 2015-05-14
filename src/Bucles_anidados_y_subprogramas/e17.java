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
public class e17 {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        int no1=0, no2=0;
        int may=0, men=0;
        
        System.out.print("imtroduca el numero 1: ");
        no1 = sc.nextInt();
        System.out.print("imtroduca el numero 2: ");
        no2 = sc.nextInt();
        
        if (no1>no2) {
            may=no1;
            men=no2;
        }else{
            may= no2;
            men= no1;
        }
        
        
        int sum=0;
        int cont_par=0;
        for (int i = men; i <= may; i++) {
            
            
            if (i%2==0) {
                System.out.print(i+"-");
                cont_par = cont_par+1;
                sum= sum+i;
            }
        }
        
        System.out.print("en total los multiplos de 2 son: "+cont_par);
        
        System.out.print("\nla suma de los multiplos de 2 es: "+sum);
        
        
        
    }
    
}
