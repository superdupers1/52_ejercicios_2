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
public class e5 {
    public static void main(String[] ar){
        int suma=0;
        for (int i = 0; i < 100; i++) {
             if (i%2==1) {
                 System.out.print(i+"-");
                 suma = suma + 1;
            }
        }
        System.out.println("\nhay : "+suma+" numeros impares");
    }
    
}
