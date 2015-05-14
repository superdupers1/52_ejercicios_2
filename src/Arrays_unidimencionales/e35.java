/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays_unidimencionales;

import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class e35 {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        
        float[] calificaciones = new float[10];
        float sum=0;
        for (int i = 0; i < 10; i++) {
            System.out.print("ingresar calificacion"+(i+1)+": ");
            calificaciones[i] = sc.nextFloat();
            
        }
        int num=0;
        System.out.print("\nnumero de calificacion que desa consultar: ");
        num = sc.nextInt();
        System.out.print("\nla calificacion de la materia "+num+" es: "+calificaciones[(num-1)]);
    }
}
