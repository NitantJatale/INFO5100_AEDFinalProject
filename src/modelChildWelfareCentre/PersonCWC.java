/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelChildWelfareCentre;

import java.util.Date;

/**
 *
 * @author nitan
 */
public class PersonCWC extends modelAddress.Address{
    
    private String firstName;
    private String lastName;
    private String email;
    private long mobile;
    private String username;
    private String password;
    private String role;
    private String date;
    
    
    public PersonCWC(String firstName, String lastName, String email, long mobile,String address, String city, Integer zipCode, String state, String date,String username, String password,String role) {
        super(address, city, zipCode, state);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.date = date;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRole() {
        return role;
    }

    public String getDate() {
        return date;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public long getMobile() {
        return mobile;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
}
