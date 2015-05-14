/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays_multidimencionales;

import java.util.Random;

/**
 *
 * @author Cesar
 */
public class e42 {
    
    
    
    public static void main(String[] args) {
        
        Random rnd = new Random();
        
        int suma =0;
        int fi=12; //meses
        int fj=4; // productos
        int fk=3; // representantes
        int[][][] ventas = new int[fi][fj][fk];
        int[][] total = new int[fi][fj];
        
        for (int i = 0; i < fi; i++) { //meses
            for (int j = 0; j < fj; j++) { //productos
                suma =0;
                for (int k = 0; k < fk; k++) { //representantes
                    ventas[i][j][k] = rnd.nextInt(100);
                    suma += ventas[i][j][k];
                }
                total[i][j]=suma;
            }
        }
        
        System.out.println("Ventas");
        for (int i = 0; i < fi; i++) { //meses
            System.out.print("\n\nMes "+(i+1));
            for (int j = 0; j < fj; j++) { //productos
                System.out.print("\nProducto "+(j+1)+"  ");
                for (int k = 0; k < fk; k++) { //representantes
                    System.out.print(ventas[i][j][k]+" ");
                }
            }
        }

        System.out.println("\n\nTotales de venta de producto por mes");
        for (int i = 0; i < fi; i++) {
            System.out.print("Mes: "+(i+1)+" ");
            for (int j = 0; j < fj; j++) {
                System.out.print(total[i][j]+" ");
            }
            System.out.println("");
        }
        
        
    }

    
}
