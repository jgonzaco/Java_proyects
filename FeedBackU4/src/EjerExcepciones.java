/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
Codifica una nueva excepción Java que se lance cuando un número de teléfono sea erróneo, 
* considerando que es erróneo si no empieza por 6, 7 o 9 o si no tiene 9 dígitos.
Haz un programa que pida al usuario un número de teléfono y que lance la nueva excepción creada cuando corresponda.

 */
public class EjerExcepciones {
    
    public static void verificar(String telefono) throws Exception{
        if ((telefono.charAt(0) != '9') && (telefono.charAt(0) != '6') && (telefono.charAt(0) != '7')) {
            throw new Exception("El numero introducido no empieza por un caracter adecuado");
        }else if (telefono.length() != 9) {
            throw new Exception("El numero introducido no tiene 9 dígitos");
        }else{
            System.out.println("El número es correcto");       
        }
    }

    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduzca un número de teléfono: ");
            String telefono = teclado.next();        
            verificar(telefono);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    

}
}
