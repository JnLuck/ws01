/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.ws01.test;

import pe.edu.upeu.ws01.config.Conexion;

/**
 *
 * @author Jhoselyn
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
            if(Conexion.getConex()!=null){
                System.out.println("Conectado");
            }else{
                System.out.println("No conectado");
            }
    }
    
}
