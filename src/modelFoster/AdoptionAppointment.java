/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelFoster;

/**
 *
 * @author anirudhajoshi
 */
public class AdoptionAppointment {
    private String username;
    private int Complaint_ID;

    public AdoptionAppointment(String username, int Complaint_ID) {
        this.username = username;
        this.Complaint_ID = Complaint_ID;
    }

    public String getUsername() {
        return username;
    }

    public int getComplaint_ID() {
        return Complaint_ID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setComplaint_ID(int Complaint_ID) {
        this.Complaint_ID = Complaint_ID;
    }
    
    
}
