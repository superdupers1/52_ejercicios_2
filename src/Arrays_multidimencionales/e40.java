/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays_multidimencionales;

/**
 *
 * @author Cesar
 */
public class e40 {
    
    public static void main(String[] args) {
        int[][][] numeros = new int[3][4][5];
        int contador=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    contador++;
                    numeros[i][j][k] = contador;
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPagina "+(i+1));
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(numeros[i][j][k]+" ");
                }
                System.out.println("");
            }
        }
    }


}
