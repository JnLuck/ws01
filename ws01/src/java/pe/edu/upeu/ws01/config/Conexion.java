/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.ws01.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Jhoselyn
 */
public class Conexion {
    private static final String URL ="jdbc:mysql://localhost:3306/dbsoap";
    private static final String DRIVER ="com.mysql.cj.jdbc.Driver";
    private static final String PASS ="654321";
    private static final String USER ="root";
    private static Connection cx = null;
    public static Connection getConex(){
        try{
            Class.forName(DRIVER);
            if(cx==null){
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        }catch (ClassNotFoundException | SQLException e){
           System.out.println("Error:"+e);
        }
        return cx;
    }
}
