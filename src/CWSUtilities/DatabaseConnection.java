/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CWSUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelChildWelfareCentre.PersonCWC;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nitan
 */
public class DatabaseConnection {
    
    private static Statement statement;
    private static Connection connection;

    private static void connectDB() throws SQLException {
        try {
            Connection connection = DriverManager.getConnection(Constants.dbUrl);
            statement = connection.createStatement();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static ResultSet getData(String query, boolean isDml) throws SQLException {
        connectDB();
        ResultSet resultSet = null;
        if (isDml) {
            statement.executeUpdate(query);
            return null;
        }

        resultSet = statement.executeQuery(query);

        return resultSet;
    }
    
    private static void setConnection() throws SQLException {
        try {
            connection = DriverManager.getConnection(Constants.dbUrl);

        } catch (SQLException e) {
            
        }

    }
    
    public static ResultSet storeDataPersonCWC(PersonCWC person){
        
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO Person_Child_Welfare_Sys VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, person.getFirstName());
            ps.setString(2, person.getLastName());
            ps.setString(3, person.getEmail());
            ps.setLong(4, person.getMobile());
            ps.setString(5, person.getAddress());
            ps.setString(6, person.getCity());
            ps.setInt(7, person.getZipCode());
            ps.setString(8, person.getState());
            ps.setString(9, person.getDate());
            ps.setString(10, person.getUsername());
            ps.setString(11, person.getPassword());
            ps.setString(12, person.getRole());
            
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    
    }
    
    public static ResultSet getAdminRolePass(String username, boolean isDml) throws SQLException {
        connectDB();
        String query = "SELECT password,role FROM admin_login WHERE username = "+"\'"+username+"\'";
        ResultSet resultSet = null;
        if (isDml) {
            statement.executeUpdate(query);
            return null;
        }

        resultSet = statement.executeQuery(query);

        return resultSet;
    }
  
}




