/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelChildWelfareCentre;

/**
 *
 * @author nitan
 */
public class CaseVerification {
    
    private String verificationOfficerUsername;
    private Integer complaintID;
    private String level;
    private String visitDescription;
    private String legitimateFlag;
    private String cpsOfficerUsername;
    private String InsertDT;

    public CaseVerification(String verificationOfficerUsername, Integer complaintID, String level, String visitDescription, String legitimateFlag, String cpsOfficerUsername, String InsertDT) {
        this.verificationOfficerUsername = verificationOfficerUsername;
        this.complaintID = complaintID;
        this.level = level;
        this.visitDescription = visitDescription;
        this.legitimateFlag = legitimateFlag;
        this.cpsOfficerUsername = cpsOfficerUsername;
        this.InsertDT = InsertDT;
    }

    public void setVerificationOfficerUsername(String verificationOfficerUsername) {
        this.verificationOfficerUsername = verificationOfficerUsername;
    }

    public void setComplaintID(Integer complaintID) {
        this.complaintID = complaintID;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setVisitDescription(String visitDescription) {
        this.visitDescription = visitDescription;
    }

    public void setLegitimateFlag(String legitimateFlag) {
        this.legitimateFlag = legitimateFlag;
    }

    public void setCpsOfficerUsername(String cpsOfficerUsername) {
        this.cpsOfficerUsername = cpsOfficerUsername;
    }

    public void setInsertDT(String InsertDT) {
        this.InsertDT = InsertDT;
    }

    public String getVerificationOfficerUsername() {
        return verificationOfficerUsername;
    }

    public Integer getComplaintID() {
        return complaintID;
    }

    public String getLevel() {
        return level;
    }

    public String getVisitDescription() {
        return visitDescription;
    }

    public String getLegitimateFlag() {
        return legitimateFlag;
    }

    public String getCpsOfficerUsername() {
        return cpsOfficerUsername;
    }

    public String getInsertDT() {
        return InsertDT;
    }
    
}
