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
public class e8 {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        String letra;
        System.out.println("introduse una letra solo se puede el caracter s/n");
        letra = sc.nextLine();
        while (!(letra.equals("s") || letra.equals("n"))) {
            System.out.println("caracter invalido favor de introdusir s/n");
            letra = sc.nextLine();
        }
        
        System.out.println("gracias por su respuesta correcta");
        
    }
    
}
