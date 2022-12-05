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
/**
 *
 * @author nitan
 */
public class DatabaseConnection {
    
    private static Statement statement;

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

    
}




