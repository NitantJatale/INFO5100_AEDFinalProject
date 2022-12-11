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
    
    public static final String LawyerCases = "SELECT Case_ID, Complaint_ID, Case_Description, Verdict FROM Child_Prtct_Srvc WHERE Lawyer_Username = ";
    
    public static final String JudgeCases = "SELECT Case_ID, Complaint_ID, Case_Description, Lawyer_Username, Verdict FROM Child_Prtct_Srvc";
    public static final String SubmitVerdict1 = "UPDATE Child_Prtct_Srvc SET Verdict=";
    public static final String SubmitVerdict2 = "WHERE Case_ID=";
    
    public static final String FosterCareDetails = "SELECT * FROM Foster_Care";
    public static final String FosterCareUpdate1 = "UPDATE Foster_Care SET Foster_Visit_Description=";
    public static final String FosterCareUpdate2 = ",Foster_Rating=";
    public static final String FosterCareUpdate3 = ",Foster_Status=";
    public static final String FosterCareUpdate4 = "WHERE Foster_ID=";
    public static final String FosteramilyComboQuery = "SELECT DISTINCT Foster_Family_Name FROM Foster_Care";
    
    
    public static final String ChildProtectFoster = "SELECT Case_ID, Case_Description FROM Child_Prtct WHERE Forward_To= 'Foster'";
    public static final String AdoptionRequest = "SELECT A.Name_Of_Child, A.Parent_Full_Name, B.City, B.State, A.Complaint_ID  FROM Complaint_Register A JOIN Person_Child_Welfare_Sys B on A.Complainee_UserName = B.Username where A.Complaint_ID in (SELECT Complaint_ID FROM Child_Prtct_Srvc_Offcr where Forward_To='Adoption')";
    
    public static final String ComplaintSearch = "SELECT * FROM Complaint_Register";
    public static final String complaintHandlerSearch = "SELECT cr.Complaint_ID, cr.Distress_Reporter_Name, cr.First_Respondent_Name, cr.Name_Of_Child, cr.Parent_Full_Name, cr.Nature_of_Abuse, cr.Abuse_Description FROM Complaint_Register cr WHERE cr.complaint_id NOT IN(SELECT ch.Complaint_ID FROM Complaint_Handler ch)";
    public static final String complaintHandlerVO = "SELECT username, firstname, lastname FROM Person_Child_Welfare_Sys WHERE role = 'Case Verfication Officer'";
    
    public static final String complaintVOSearch = "SELECT ch.Complaint_ID, cr.Name_Of_Child, cr.Parent_Full_Name, cr.Nature_of_Abuse, cr.Abuse_Description FROM Complaint_Handler ch JOIN complaint_register cr ON ch.Complaint_ID = cr.complaint_id WHERE ch.Complaint_ID NOT IN (SELECT Complaint_ID FROM Case_Verification_Officer) AND ch.Verification_Officer_UserName = ";
    public static final String complaintVOCPSSearch = "SELECT cvo.Complaint_ID,cvo.Level,cvo.Visit_Description,cvo.Ligitimate_Flag,cvo.CPSOfficer_Username FROM Case_Verification_Officer cvo WHERE cvo.CPSOfficer_Username = 'Not Assigned' and cvo.Ligitimate_Flag = 'Legitimate' and cvo.Verification_Officer_Username = ";
    public static final String complaintVOCPS = "SELECT username, firstname, lastname FROM Person_Child_Welfare_Sys WHERE role = 'Child Protection Service'";
    
    
}
