/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feedbacku1;

import java.util.Scanner;

/**
18Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado y validados como distintos, 
* el programa debe empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 */
public class Ejercicio18Pdf {
 public static void main(String[] args){
   Scanner teclado = new Scanner(System.in);
   
   //1.ENTRADA DE DATOS
   System.out.println("Introduzca el primer numero: ");
   int numero1=teclado.nextInt();
    System.out.println("Introduzca el segundo numero: ");
   int numero2=teclado.nextInt();
   
   //2.ALGORITMO
   if(numero1!=numero2 && numero1<numero2){ 
      for(int i=numero1; i<numero2; i+=7){
           System.out.println(i);
                 }
   }
   
   //3.SALIDA DE DATOS
   
 }   
}
