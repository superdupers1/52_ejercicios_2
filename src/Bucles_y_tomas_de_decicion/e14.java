/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles_y_tomas_de_decicion;

import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class e14 {
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);  
        int may=0,men=0;  
        System.out.println("Ingresa el numero 1:");  
        int A = sc.nextInt();  
        System.out.println("Ingresa el numero 2:");  
        int B = sc.nextInt();  
        System.out.println("Ingresa el numero 3:");  
        int C = sc.nextInt();  
        System.out.println("Ingresa el numero 4:");  
        int D = sc.nextInt();
        System.out.println("Ingresa el numero 5:");  
        int E = sc.nextInt();
        
        
        
        
        if(A > B && A > C && A > D && A > E){  
            may=A;  
        }else{  
            if(B > A && B > C && B > D && B > E){  
                may=B;  
            }else{  
                if(C > A && C > B && C > D && C > E){  
                    may=C;  
                }else {
                    if (D > A && D > B && D > C && D > E) {
                        
                    }else{
                        may=E;
                    }
                } 
                     
            }  
        }  
        
        if(A < B && A < C && A < D && A < E){  
            men=A;  
        }else{  
            if(B < A && B < C && B < D && B < E){  
                men=B;  
            }else{  
                if(C < A && C < B && C < D && C < E){  
                    men=C;  
                }else {
                    if (D < A && D < B && D < C && D < E) {
                        
                    }else{
                        men=E;
                    }
                } 
                     
            }  
        }
        
        
        System.out.print("el numero mayor es : "+may+"\n el numero menor es : "+men);  
     }  
    
}
