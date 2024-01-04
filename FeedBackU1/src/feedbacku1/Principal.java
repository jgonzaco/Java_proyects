/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feedbacku1;

import java.util.Scanner;

/**
 *
 * @author fjgon
 */
public class Principal {
   
    /*
    EJERCICIO 1: Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente
    Mostrar lo que se debe  abonar el comprador teniendo en cuenta una rebaja de un 20%
    */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    //1. ENTRADA DE DATOS
    
    System.out.println("Introduzca el precio del artículo: ");
    double articulo = teclado.nextDouble();
    System.out.println("Introduzca la cantidad de productos que se va a llevar: ");
    int cantidad = teclado.nextInt();
    
    
    //2. ALGORITMO
    double precioTotal = articulo * cantidad * 0.8;
    
  
    
    
    //3. SALIDA DE DATOS
    
    System.out.println("Su precio final es: "+precioTotal +"€");
    }
    
}
