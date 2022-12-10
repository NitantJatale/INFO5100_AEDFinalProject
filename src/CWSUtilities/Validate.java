/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CWSUtilities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;

/**
 *
 * @author nitan
 */
public class Validate {
    public static boolean isValidEmail(String email)
    {
        String emailRegex = Constants.EmailRegex;
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
    
    public static int ConvertIntoNumeric(String nVal)
    {
        try
        { 
            return Integer.parseInt(nVal);
        }
        catch(Exception ex) 
        {
            return 0; 
        }
    }
    
    public static Long ConvertIntoLong(String nVal)
    {
        try
        { 
            return Long.valueOf(nVal);
        }
        catch(Exception ex) 
        {
            return 0L; 
        }
    }
    
    public static boolean isValidUsername(String username)
    {
                              
        Pattern pat = Pattern.compile(Constants.usernameRegex);
        if (username == null)
            return false;
        return pat.matcher(username).matches();
    }
    
    public static boolean isValidPassword(String password)
    {
                              
        Pattern pat = Pattern.compile(Constants.passwordRegex);
        if (password == null)
            return false;
        return pat.matcher(password).matches();
    }
    
    public static boolean isUsernameTherePersonCWC(String username)
    {
        boolean ret = true;
        try{
            ResultSet resultSet = null;
            resultSet = DatabaseConnection.getData(Constants.CWCentreAdminHome +"\'"+username+"\'", false);
            if (!resultSet.isBeforeFirst() ) {    
                ret = false;
            }
        }catch(SQLException e){
                System.out.println("Error while Connecting");
                e.printStackTrace();
        } 
        return ret;
    }
}
