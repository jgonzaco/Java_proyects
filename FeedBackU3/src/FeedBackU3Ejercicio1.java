/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
1 hacer una aplicación que pida por pantalla que se escriba una frase para
almacenarla, después sacar por pantalla la misma frase al revés.
 */
public class FeedBackU3Ejercicio1 {
   public static void main(String[] args){
       Scanner teclado=new Scanner(System.in);
       
       //1.ENTRADA DE DATOS
       System.out.println("Introduzca una frase y la muestro al revés: ");
       String frase=teclado.nextLine();
       System.out.println("Frase dada la vuelta: ");
       
       //2.ALGORITMO
       for(int i=frase.length()-1;i>=0;i--){
        System.out.print(frase.charAt(i));
        }
       System.out.println();
       
       //3.SALIDA DE DATOS
       
       
   } 
}
