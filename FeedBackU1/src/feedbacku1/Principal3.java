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
EJERCICIO 3: REALIZAR UN PROGRAMA QUE CALCULE EL FACTORIAL DE UN NÚMERO POSITIVO (N!).
*/
public class Principal3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        //1. ENTRADA DE DATOS
        System.out.println("Introduzca el número que se quiere calcular el factorial: ");
        int numero = teclado.nextInt();
        int acumulador = 1;
       
        
        //2. ALGORITMO
        for(int i = numero; i>=1;i--){
            acumulador = acumulador * i;
            
        }
        //3. SALIDA DE DATOS
        System.out.println("El factorial es: " + acumulador);
        
    }
    
    
}
