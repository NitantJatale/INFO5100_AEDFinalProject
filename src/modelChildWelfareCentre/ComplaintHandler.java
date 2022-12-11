/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelChildWelfareCentre;

/**
 *
 * @author nitan
 */
public class ComplaintHandler {
    private String complaintID;
    private String vOUsername;
    private String vOName;
    private String date;

    public ComplaintHandler(String complaintID, String vOUsername, String vOName, String date) {
        this.complaintID = complaintID;
        this.vOUsername = vOUsername;
        this.vOName = vOName;
        this.date = date;
    }

    public void setComplaintID(String complaintID) {
        this.complaintID = complaintID;
    }

    public void setvOUsername(String vOUsername) {
        this.vOUsername = vOUsername;
    }

    public void setvOName(String vOName) {
        this.vOName = vOName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getComplaintID() {
        return complaintID;
    }

    public String getvOUsername() {
        return vOUsername;
    }

    public String getvOName() {
        return vOName;
    }

    public String getDate() {
        return date;
    }
    
}
