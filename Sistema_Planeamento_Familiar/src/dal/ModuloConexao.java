/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.*;

/**
 *
 * @author valter
 */
public class ModuloConexao {
    
    //Metodo que estabelece a conexao com a base de dados
    
    public static Connection conector (){
        java.sql.Connection conexao = null;
        
        // A linha abaixo chama o driver
        String driver = "com.mysql.jdbc.Driver";
        
        // Armazenar informacoes referentes ao a base de dados
        String url = "jdbc:mysql://localhost:3306/dbprojcotacao";
        String user = "root";
        String password = "";
        
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
        
    }
    
}
