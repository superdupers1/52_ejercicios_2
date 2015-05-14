/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles_y_tomas_de_decicion;

/**
 *
 * @author Cesar
 */
public class e12 {
    public static void main(String[] ar){
        int impares=0;
        int pares=0;
        for (int i = 0; i < 100; i++) {
            System.out.print((i+1)+"-");  
            if (i%2==0) {
                pares= pares+1;
            }else{
                impares= impares+1;
            }
        }
        System.out.print("\nla suma de los pares es : "+pares);
        System.out.print("\nla suma de los impares es : "+impares);
    }
    
}
