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

    public static final String FosterPersonDelete = "DELETE FROM person_foster WHERE username = ";
    public static final String FosterPerson = "SELECT * FROM person_foster";
    
    public static final String LegalPersonDelete = "DELETE FROM person_legal WHERE username = ";
    public static final String LegalPerson = "SELECT * FROM person_legal";

    public static final String ComplaintSearch = "SELECT * FROM Complaint_Register";
    public static final String complaintHandlerSearch = "SELECT cr.Complaint_ID, cr.Distress_Reporter_Name, cr.First_Respondent_Name, cr.Name_Of_Child, cr.Parent_Full_Name, cr.Nature_of_Abuse, cr.Abuse_Description FROM Complaint_Register cr WHERE cr.complaint_id NOT IN(SELECT ch.Complaint_ID FROM Complaint_Handler ch)";
    public static final String complaintHandlerVO = "SELECT username, firstname, lastname FROM Person_Child_Welfare_Sys WHERE role = 'Case Verfication Officer'";
    
    public static final String complaintVOSearch = "SELECT ch.Complaint_ID, cr.Name_Of_Child, cr.Parent_Full_Name, cr.Nature_of_Abuse, cr.Abuse_Description FROM Complaint_Handler ch JOIN complaint_register cr ON ch.Complaint_ID = cr.complaint_id WHERE ch.Complaint_ID NOT IN (SELECT Complaint_ID FROM Case_Verification_Officer) AND ch.Verification_Officer_UserName = ";
    public static final String complaintVOCPSSearch = "SELECT cvo.Complaint_ID,cvo.Level,cvo.Visit_Description,cvo.Ligitimate_Flag,cvo.CPSOfficer_Username FROM Case_Verification_Officer cvo WHERE cvo.CPSOfficer_Username = 'Not Assigned' and cvo.Ligitimate_Flag = 'Legitimate' and cvo.Verification_Officer_Username = ";
    public static final String complaintVOCPS = "SELECT username, firstname, lastname FROM Person_Child_Welfare_Sys WHERE role = 'Child Protection Service'";
    
    public static final String cpsOfficerAssignSearch = "SELECT cvo.Verification_ID,cvo.complaint_ID,cr.Name_Of_Child,cr.Abuse_Description FROM Case_Verification_Officer cvo JOIN complaint_register cr ON cvo.Complaint_ID = cr.Complaint_ID WHERE cvo.Complaint_ID NOT IN (SELECT Complaint_ID FROM Child_Prtct_Srvc_Offcr) AND cvo.CPSOfficer_Username = ";
    public static final String cpsLawyer = "SELECT username, firstname, lastname FROM Person_Legal WHERE role_name = 'Lawyer'";
    
}
