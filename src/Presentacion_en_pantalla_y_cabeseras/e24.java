/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion_en_pantalla_y_cabeseras;

import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class e24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, primo =0;
        System.out.print("introduce un numero ");
        numero = sc.nextInt();
        
        System.out.println(numero);
        
        for (int i = 2; i < numero; i++) {
            if (numero%i == 0){
                primo = 1;
            }
        }
        
        if (primo == 0){
            System.out.println("El numero proporcionado es primo");
        }else{
            System.out.println("El numero proporcionado no es numero primo");
        }
        
    }
}
