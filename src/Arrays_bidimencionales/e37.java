/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays_bidimencionales;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class e37 {
      public static void main(String[] ar){
        
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        
        int[][] array = new int[4][5];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = ran.nextInt(100);
            }
        }
          System.out.println("Matriz normal\n");
          
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j]);
            }System.out.println("");
        }
        
          System.out.println("Matriz trnaspuesta\n");
        for (int i = 3; i >= 0; i--) {
            for (int j = 4; j >= 0; j--) {
                System.out.print(array[i][j]);
            }System.out.println("");
        }
        
    }
    
}
