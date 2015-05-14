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
public class e15 {
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
        
        int cont=0;
        int sum_impar=0;
        int cont_par=0;
        for (int i = men; i <= may; i++) {
            System.out.print(i+"-");
            cont= cont+1;
            
            if (i%2==0) {
                cont_par = cont_par+1;
            }else{
            sum_impar = sum_impar+i;
            }
        }
        
        System.out.print("en total son: "+cont);
        System.out.print("\nen total los pares son: "+cont_par);
        System.out.print("\nla suma de los impares es: "+sum_impar);
        
        
        
    }
}
