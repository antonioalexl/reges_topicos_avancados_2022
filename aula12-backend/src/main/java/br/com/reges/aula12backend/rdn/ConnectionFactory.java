/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.reges.aula12backend.rdn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alex.lopes
 */
public class ConnectionFactory {
    
    private String URL = "jdbc:mysql://localhost:3306/db_supermercado_reges";    
    private String USER = "root";    
    private String PASSWORD = "123456";
    
    public Connection getConnection()
    {
        try{
        
            return DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);
            
        }
        catch(SQLException ex){
        
         /*   System.out.println(ex);
            return null;*/
             throw new RuntimeException(ex);
        }
    }

    
    
    /* public Connection getConnection() {
        
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }*/
    
    
    
     
    
    
}
