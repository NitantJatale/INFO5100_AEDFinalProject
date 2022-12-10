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
public class ComplaintRegister {
    
    private String complaineeUsername;
    private String distressReporterName;
    private String firstRespondentName;
    private String natureAbuse;
    private String description;
    private String childName;
    private String actions;
    private String parentName;
    private String status;
    private String insertDT;

    public ComplaintRegister(String complaineeUsername, String distressReporterName, String firstRespondentName, String natureAbuse, String description, String childName, String actions, String parentName, String status, String insertDT) {
        this.complaineeUsername = complaineeUsername;
        this.distressReporterName = distressReporterName;
        this.firstRespondentName = firstRespondentName;
        this.natureAbuse = natureAbuse;
        this.description = description;
        this.childName = childName;
        this.actions = actions;
        this.parentName = parentName;
        this.status = status;
        this.insertDT = insertDT;
    }

    public void setComplaineeUsername(String complaineeUsername) {
        this.complaineeUsername = complaineeUsername;
    }

    public void setDistressReporterName(String distressReporterName) {
        this.distressReporterName = distressReporterName;
    }

    public void setFirstRespondentName(String firstRespondentName) {
        this.firstRespondentName = firstRespondentName;
    }

    public void setNatureAbuse(String natureAbuse) {
        this.natureAbuse = natureAbuse;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setInsertDT(String insertDT) {
        this.insertDT = insertDT;
    }

    public String getComplaineeUsername() {
        return complaineeUsername;
    }

    public String getDistressReporterName() {
        return distressReporterName;
    }

    public String getFirstRespondentName() {
        return firstRespondentName;
    }

    public String getNatureAbuse() {
        return natureAbuse;
    }

    public String getDescription() {
        return description;
    }

    public String getChildName() {
        return childName;
    }

    public String getActions() {
        return actions;
    }

    public String getParentName() {
        return parentName;
    }

    public String getStatus() {
        return status;
    }

    public String getInsertDT() {
        return insertDT;
    }

    
}
