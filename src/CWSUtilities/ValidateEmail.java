/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CWSUtilities;

import java.util.regex.Pattern;

/**
 *
 * @author nitan
 */
public class ValidateEmail {
    public static boolean isValidEmail(String email)
    {
        String emailRegex = Constants.EmailRegex;
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
}
