/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelFoster;

/**
 *
 * @author anirudhajoshi
 */
public class PersonFoster extends modelAddress.Address{
    private String firstname;
    private String lastname;
    private String emailid;
    private long mobile;
    private String username;
    private String password;
    private String role;
    
    public PersonFoster(String firstname, String lastname, String emailid, long mobile,String address, String city, Integer zipCode, String state, String username, String password, String role) {
        super(address, city, zipCode, state);
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailid = emailid;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getEmailid() {
        return emailid;
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
    public String getRole() {
        return role;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
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
    public void setRole(String role) {
        this.role = role;
    }
}
