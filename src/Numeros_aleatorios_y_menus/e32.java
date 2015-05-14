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
public class e32 {

    public static void main(String[] args) {
        int n1, menu=10;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingresa un numero");
        n1 = sc.nextInt();
        
        while (menu > 0){
            System.out.println("\n\n\nMenu");
            System.out.println("1 comprobar si es primo");
            System.out.println("2 encontrar factorial");
            System.out.println("3 tabla de multiplicar");
            System.out.println("0 salir");
            
            System.out.println("selecciona una opcion");
            menu = sc.nextInt();
            
            switch (menu){
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                case 1:
                    int no_primo =0;
                    for (int i = 2; i < n1; i++) {
                        if (n1%i == 0){
                            no_primo = 1;
                        }
                    }
                    if (no_primo == 1){
                        System.out.println("el numero no es primo");
                    }else{
                        System.out.println("el numero es primo");
                    }
                    break;
                case 2:
                    int factorial=1;
                    for (int i = 1; i <= n1; i++) {
                        factorial *=i;
                    }
                    System.out.println("la respuesta es: "+factorial);
                    break;
                case 3:
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(n1+"x"+i+"="+(n1*i));
                    }
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }
    }
    
}

    

