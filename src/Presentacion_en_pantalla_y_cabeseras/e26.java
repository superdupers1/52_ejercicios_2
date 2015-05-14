/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion_en_pantalla_y_cabeseras;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class e26 {
    public static void main(String[] args) {
        String frase;
        System.out.println("Insertar frase ");
        Scanner sc = new Scanner(System.in);
        frase = sc.nextLine();
        
        JOptionPane.showMessageDialog(null, frase);
        
        
    }
    
}
