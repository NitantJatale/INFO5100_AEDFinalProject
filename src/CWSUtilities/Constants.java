/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CWSUtilities;

/**
 *
 * @author nitan
 */
public class Constants {
    public static final String EmailRegex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    
    public static final String dbUrl =
                "jdbc:sqlserver://boyce.coe.neu.edu;"
                + "database=project_team17;"
                + "user=INFO6210;"
                + "password=NEUHusky!;"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=30;";
    
    public static final String fromEmail = "childwelfare17@gmail.com";
    public static final String passwordEmail = "maxzxovjllbmwlte";
    
    
    
}
