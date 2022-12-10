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
                + "database=child_welfare17;"
                + "user=INFO6210;"
                + "password=NEUHusky!;"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=30;";
    
    
    public static final String fromEmail = "childwelfare17@gmail.com";
    public static final String passwordEmail = "maxzxovjllbmwlte";
    
    public static final String usernameRegex = "^[a-z0-9]";
    public static final String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";
    
    public static final String CWCentreAdminHome = "SELECT * FROM Person_Child_Welfare_Sys WHERE username = ";
    public static final String CWCentrePerson = "SELECT * FROM Person_Child_Welfare_Sys";
    public static final String CWCentrePersonDelete = "DELETE FROM Person_Child_Welfare_Sys WHERE username = ";
    
    public static final String ComplaintSearch = "SELECT * FROM Complaint_Register";
    
}
