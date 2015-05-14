/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles_anidados_y_subprogramas;

import javax.swing.JFrame; 

public class Frame{ 

public static void creaFrame() {//Metodo que agrega un muestra un Frame con reloj incluido 
e19 reloj = new e19(0, 0, 0, 0);//Instancia de nuestra clase Reloj 
//(0,0,0,0 ya que el layout es x defecto) 
//Sino aquí es donde dan locación y tamaño 
reloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);//Centrado del texto 
reloj.setFont(new java.awt.Font("Arial", 1, 18));//tipo de letra y tamaño 
JFrame ventana = new JFrame();//Instancia de la clase JFrame 
ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Botón de cerrar 
ventana.setBounds(0, 0, 200, 100);//Tamaño 
ventana.getContentPane().add(reloj);//Agregado del reloj 
ventana.setLocationRelativeTo(null);//Lo centramos en la pantalla 
ventana.setVisible(true);//Lo hacemos visible 

} 

public static void main(String[] args) { 
creaFrame();//Llamada al método que muestra un jFrame 

} 
} 