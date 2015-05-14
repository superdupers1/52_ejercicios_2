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
public class e13 {
    public static void main(String[] ar){
    
        int multiplos=0;
        for (int i = 1; i < 100; i++) {
              
            if (i%2==0 || i%3==0) {
                System.out.print(i+"-");
                multiplos= multiplos+1;
            }
        }
        System.out.print("\nmultiplos de 3 y 2 : "+multiplos);
        
    }
    
}
