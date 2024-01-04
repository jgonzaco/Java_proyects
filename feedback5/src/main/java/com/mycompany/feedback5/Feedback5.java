/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.feedback5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author fjgon
 */
public class Feedback5 {

    public static void main(String[] args) {
        try{
        String url = "jdbc:mysql://localhost:3307/coches";    
        Connection con= DriverManager.getConnection(url,"admin_coches","coches2023DAW");
        System.out.println("Conexión establecida correctamente");
        String tipo_motor = JOptionPane.showInputDialog("Introduce el tipo de motor(D,G,E o H)");
        String anio_lanzamiento = JOptionPane.showInputDialog("Introduce el año de lanzamiento");
        char motorType = tipo_motor.charAt(0);
        String sqlInjection = "SELECT * FROM cochecitos WHERE tipo_motor='"+motorType+ "' AND anio_lanzamiento='"+anio_lanzamiento+"';";
        PreparedStatement sentenciaSQLP = con.prepareStatement(sqlInjection);
        ResultSet resultado = sentenciaSQLP.executeQuery();
        while(resultado.next()){
            String marca = resultado.getString(1);
            String modelo = resultado.getString(2);
            char motor = resultado.getString(3).charAt(0);
            String anio = resultado.getString(4);
            System.out.println("Marca:"+ marca +",Modelo:" + modelo + ",Motor:" + motor + ",Año:" + anio);
        }
        }catch(SQLException sql){
            sql.printStackTrace();
        }
    }
}
