/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles_y_tomas_de_decicion;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Cesar
 */
public class e7 {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("introduca tantas fraces quiera: ");
        frase = sc.nextLine();
        StringTokenizer st = new StringTokenizer(frase);
       System.out.println("Número de palabras: " + st.countTokens());
    }
    
}
