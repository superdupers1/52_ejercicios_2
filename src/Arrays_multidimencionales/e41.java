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
public class e41 {

    public static void main(String[] args) {
        int[][][] nota = new int[5][10][20];
        float[][] media = new float[5][10];
        float record =0;
        int suma =0, mejor_centro=0;
        int fi=5; //centros
        int fj=10; // cursos 
        int fk=20; // alumnos
        
        Random rnd = new Random();
        
        for (int i = 0; i < fi; i++) { //centro
            for (int j = 0; j < fj; j++) { //curso
                suma =0;
                for (int k = 0; k < fk; k++) { //alumnos
                    nota[i][j][k] = rnd.nextInt(100);
                    suma += nota[i][j][k];
                }
                media[i][j]=suma/fk;
                if (media[i][j]>record){
                    mejor_centro=i+1;
                    record=media[i][j];
                }
            }
        }
        
        for (int i = 0; i < fi; i++) {
            System.out.println("\nCentro "+(i+1));
            for (int j = 0; j < fj; j++) {
                System.out.print("Curso "+(j+1)+": ");
                for (int k = 0; k < fk; k++) {
                    System.out.print(nota[i][j][k]+" ");
                }
                System.out.print(" Media: "+media[i][j]+"\n");
            }
        }
        
        
        System.out.println("\nEl centro con el curso con media mas alta es: "+mejor_centro);
        System.out.println("La media mas alta es: "+record);
    }

    
    
}
