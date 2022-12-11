/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelCommunityCareProvider;

/**
 *
 * @author nitan
 */
public class CPSOfficer {
    Integer verificationID;
    Integer complaintID;
    String lawyerUsername;
    String cpsUsername;
    String caseDescription;
    String forwardTo;

    public CPSOfficer(Integer verificationID, Integer complaintID, String lawyerUsername, String cpsUsername, String caseDescription, String forwardTo) {
        this.verificationID = verificationID;
        this.complaintID = complaintID;
        this.lawyerUsername = lawyerUsername;
        this.cpsUsername = cpsUsername;
        this.caseDescription = caseDescription;
        this.forwardTo = forwardTo;
    }

    public void setVerificationID(Integer verificationID) {
        this.verificationID = verificationID;
    }

    public void setComplaintID(Integer complaintID) {
        this.complaintID = complaintID;
    }

    public void setLawyerUsername(String lawyerUsername) {
        this.lawyerUsername = lawyerUsername;
    }

    public void setCpsUsername(String cpsUsername) {
        this.cpsUsername = cpsUsername;
    }

    public void setCaseDescription(String caseDescription) {
        this.caseDescription = caseDescription;
    }

    public void setForwardTo(String forwardTo) {
        this.forwardTo = forwardTo;
    }

    public Integer getVerificationID() {
        return verificationID;
    }

    public Integer getComplaintID() {
        return complaintID;
    }

    public String getLawyerUsername() {
        return lawyerUsername;
    }

    public String getCpsUsername() {
        return cpsUsername;
    }

    public String getCaseDescription() {
        return caseDescription;
    }

    public String getForwardTo() {
        return forwardTo;
    }
    
    
}
