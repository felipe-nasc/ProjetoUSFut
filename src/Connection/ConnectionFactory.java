/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FelipeCruz
 */
public class ConnectionFactory {

    public static Connection getConexao() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdusfut", "root", "");
            System.out.println("conectado com sucesso!");
            return connection;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados!\nErro: "+ e);
        }
        return null;
    }

    public void getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

