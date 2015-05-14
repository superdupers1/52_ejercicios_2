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
public class e25 {
    public static void main(String[] args) {
        int numero, u, d, c, m;
        Scanner sc=new Scanner(System.in);
        String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
        String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  
        String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String Miles[]={"", "M", "MM", "MMM", "MMMM", "MMMMM"};
        
        System.out.println("Ingresa un numero entre el 1 y 5000");
        numero = sc.nextInt();
        

        while (numero>5000){
            System.out.println("el numero proporcionado es mayor de 5000, favor de intruducir un numero menor ");
            numero = sc.nextInt();
        }
        
        u = numero%10;
        d = (numero/10)%10;
        c = (numero/100)%10;
        m = numero/1000;
        
        
        if (numero>=1000){
            System.out.println(Miles[m]+Centena[c]+Decena[d]+Unidad[u]);  
        }else{
            if(numero>=100){           
              System.out.println(Centena[c]+Decena[d]+Unidad[u]);  
            }else{  
                if(numero>=10){  
                    System.out.println(Decena[d]+Unidad[u]);            
                }else{  
                    System.out.println(Unidad[numero]);            
                }            
            }
        }
        
        
    }
    
}
