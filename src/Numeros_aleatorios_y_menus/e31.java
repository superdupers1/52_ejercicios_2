/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numeros_aleatorios_y_menus;

import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class e31 {
    
    public static void main(String[] args) {
        int menu=10;
        float n1, n2;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero");
        n1 = sc.nextFloat();
        System.out.println("Ingresa el segundo numero");
        n2 = sc.nextFloat();
        
        while (menu > 0){
            System.out.println("\n\n\nMenu");
            System.out.println("1 sumar");
            System.out.println("2 restar 1ro - 2do");
            System.out.println("3 restar 2do - 1ro");
            System.out.println("4 multiplicar");
            System.out.println("5 dividir 1ro / 2do");
            System.out.println("6 dividir 2do / 1ro");
            System.out.println("0 salir");
            
            System.out.println("selecciona una opcion");
            menu = sc.nextInt();
            
            switch (menu){
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                case 1:
                    System.out.println("la respuesta es: "+(n1+n2));
                    break;
                case 2:
                    System.out.println("la respuesta es: "+(n1-n2));
                    break;
                case 3:
                    System.out.println("la respuesta es: "+(n2-n1));
                    break;
                case 4:
                    System.out.println("la respuesta es: "+(n1*n2));
                    break;
                case 5:
                    System.out.println("la respuesta es: "+(n1/n2));
                    break;
                case 6:
                    System.out.println("la respuesta es: "+(n2/n1));
                    break;
            }
        }
    }
    
}
