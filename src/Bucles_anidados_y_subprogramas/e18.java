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
public class e18 {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.print("introdusca una frase :");
        frase = sc.nextLine();
        frase = frase.toLowerCase();
        int cont=0;
        for(int i=0; i<frase.length(); i++){
            if (frase.charAt(i) == 'a') {
                cont = cont+1;
            }
        } 
        System.out.println("\nla letra 'A' se repite "+cont+" veces");
        
    }
    
}
