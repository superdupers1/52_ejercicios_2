/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles_anidados_y_subprogramas;

/**
 *
 * @author Cesar
 */
public class e21 {
    
    public static void main(String[] args) {
        int tipo = 0, c_par =0, c_impar=0;
        for (int i = 1; i <= 1000; i++) {
            tipo = i%2;
            switch (tipo){
                case 0:
                    c_par += i;
                    break;
                case 1:
                    c_impar += i;
                    break;
            }
            
        }
        System.out.println("suma de pares "+c_par);
        System.out.println("suma de impares "+c_impar);
    }
    
}
