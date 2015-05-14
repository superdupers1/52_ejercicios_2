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
public class e38 {
    public static void main(String[] ar){
        
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        
        int[][] array = new int[4][5];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = ran.nextInt(10);
            }
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.print("materia "+(i+1)+":   ");
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j]+" ");
            }System.out.println("");
        }
        
        
    }
    
}
