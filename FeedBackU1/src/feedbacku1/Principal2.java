/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feedbacku1;

import java.util.Scanner;

/**
 *
 * @author fjgon
 */
/*
EJERCICIO 2: Escribir un programa que lea los valores inicial y final de un bucle for que recorra los números entre esos dos,
indicando para cada uno de ellos si es divisible por 5 o no.
*/
public class Principal2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
      
        //1. ENTRADA DE DATOS
        System.out.println("Introduzca el primer número de la serie: ");
        int numero1 = teclado.nextInt();
        
        System.out.println("Introduzca el segundo número de la serie: ");
        int numero2 = teclado.nextInt();
        
        //2. ALGORITMO
        if(numero2>numero1){
          for(int i = numero1;i<=numero2;i++){         
            if(i%5==0){
                System.out.println(i +" Es un número divisible por 5");
            }else{
                System.out.println(i +" No es un número divisible por 5");
            }
          }
        }else{
           for(int i = numero1;i>=numero2;i--){ 
               if(i%5==0){
                System.out.println(i +" Es un número divisible por 5");
               }else{
                System.out.println(i +" No es un número divisible por 5");
               }
           } 
        }
        
        
        //3. SALIDA DE DATOS
        System.out.println("Muchas gracias.");
    }
}
