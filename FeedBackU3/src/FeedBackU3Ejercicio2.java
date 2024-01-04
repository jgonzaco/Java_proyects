/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.util.Arrays;

/**
b) Hacer una aplicación que pida al usuario introducir 10 palabras y almacenarlas en un array por palabra. 
Después se pide que sacar por pantalla las 10 palabras ordenadas alfabéticamente y por longitud en orden ascendente.
 */
public class FeedBackU3Ejercicio2 {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        
        //1.ENTRADA DE DATOS
        System.out.println("Introduce 10 palabras y saldrán ordenadas alfabéticamente: ");
        String[] palabra=new String[10];
        int contador=0;
        
        
        //2.ALGORITMO
       while(contador<10){ //Hacemos un tope de llegar hasta 10 palabras.
        palabra[contador]=teclado.nextLine();
        contador++;
                }
      System.out.println("Ordenamos las palabras alfabeticamente: ");
       for(int i=0;i<palabra.length;i++){ 
        System.out.print(palabra[i]+" ");
       }
       Arrays.sort(palabra); // ORDENAMOS ALFABETICAMENTE
       
       System.out.println();
       System.out.println("Ordenamos las palabras por longitud: ");
       for(int i=0;i<palabra.length-1;i++){// ORDENAMOS POR LONGITUD
           for(int j=i+1;j<palabra.length;j++){
             if(palabra[i].length()>palabra[j].length()){
                 String cambio=palabra[i];
                 palabra[i]=palabra[j];
                 palabra[j]=cambio;
             }  
           }
       }
       for(int i=0;i<palabra.length;i++){
           System.out.print(palabra[i]+" ");
       } 

       
        //3.SALIDA DE DATOS
        
        
        
    }
}
