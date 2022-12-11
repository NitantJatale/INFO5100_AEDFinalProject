/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CWSUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelChildWelfareCentre.PersonCWC;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelChildWelfareCentre.CaseVerification;
import modelChildWelfareCentre.ComplaintHandler;
import modelChildWelfareCentre.ComplaintRegister;
import modelFoster.PersonFoster;
import modelLegal.PersonLegal;

/**
 *
 * @author nitan
 */
public class DatabaseConnection {
    
    private static Statement statement;
    private static Connection connection;

    private static void connectDB() throws SQLException {
        try {
            Connection connection = DriverManager.getConnection(Constants.dbUrl);
            statement = connection.createStatement();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static ResultSet getData(String query, boolean isDml) throws SQLException {
        connectDB();
        ResultSet resultSet = null;
        if (isDml) {
            statement.executeUpdate(query);
            return null;
        }

        resultSet = statement.executeQuery(query);

        return resultSet;
    }
    
    private static void setConnection() throws SQLException {
        try {
            connection = DriverManager.getConnection(Constants.dbUrl);

        } catch (SQLException e) {
            
        }

    }
    
    public static ResultSet storeDataPersonCWC(PersonCWC person){
        
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO Person_Child_Welfare_Sys VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, person.getFirstName());
            ps.setString(2, person.getLastName());
            ps.setString(3, person.getEmail());
            ps.setLong(4, person.getMobile());
            ps.setString(5, person.getAddress());
            ps.setString(6, person.getCity());
            ps.setInt(7, person.getZipCode());
            ps.setString(8, person.getState());
            ps.setString(9, person.getDate());
            ps.setString(10, person.getUsername());
            ps.setString(11, person.getPassword());
            ps.setString(12, person.getRole());
            
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    
    }
    
    public static ResultSet getAdminRolePass(String username, boolean isDml) throws SQLException {
        connectDB();
        String query = "SELECT password,role FROM admin_login WHERE username = "+"\'"+username+"\'";
        ResultSet resultSet = null;
        if (isDml) {
            statement.executeUpdate(query);
            return null;
        }

        resultSet = statement.executeQuery(query);

        return resultSet;
    }
    
    public static ResultSet storeDataPersonLegal(PersonLegal person){
        
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO person_legal VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, person.getFirstName());
            ps.setString(2, person.getLastName());
            ps.setString(3, person.getEmailid());
            ps.setLong(4, person.getMobile());
            ps.setString(5, person.getAddress());
            ps.setString(6, person.getCity());
            ps.setInt(7, person.getZipCode());
            ps.setString(8, person.getState());
            ps.setString(9, person.getUsername());
            ps.setString(10, person.getPassword());
            
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    
    }
    
    public static ResultSet storeDataPersonFoster(PersonFoster person){
        
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO person_foster VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, person.getFirstName());
            ps.setString(2, person.getLastName());
            ps.setString(3, person.getEmailid());
            ps.setLong(4, person.getMobile());
            ps.setString(5, person.getAddress());
            ps.setString(6, person.getCity());
            ps.setInt(7, person.getZipCode());
            ps.setString(8, person.getState());
            ps.setString(9, person.getUsername());
            ps.setString(10, person.getPassword());
            
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    
    }
    
    
    
    public static ResultSet getPersonCWCRole(String username, boolean isDml) throws SQLException {
        connectDB();
        String query = "SELECT password,role FROM Person_Child_Welfare_Sys WHERE username = "+"\'"+username+"\'";
        ResultSet resultSet = null;
        if (isDml) {
            statement.executeUpdate(query);
            return null;
        }

        resultSet = statement.executeQuery(query);

        return resultSet;
    }
    
    public static ResultSet updatePersonCWC(PersonCWC person){
        
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("Update Person_Child_Welfare_Sys SET firstname =?, lastname =?, mobile =  ?, address = ?, city = ?, zipcode = ?, state = ?, password = ? where username = ?", Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, person.getFirstName());
            ps.setString(2, person.getLastName());
            ps.setLong(3, person.getMobile());
            ps.setString(4, person.getAddress());
            ps.setString(5, person.getCity());
            ps.setInt(6, person.getZipCode());
            ps.setString(7, person.getState());
            ps.setString(8, person.getPassword());
            ps.setString(9, person.getUsername());

            
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    
    }
    
    public static ResultSet getDeletePersonCWC(String username, boolean isDml) throws SQLException {
        connectDB();
        String query = Constants.CWCentrePersonDelete+"\'"+username+"\'";
        ResultSet resultSet = null;
        if (isDml) {
            statement.executeUpdate(query);
            return null;
        }

        resultSet = statement.executeQuery(query);

        return resultSet;
    }
    
    public static ResultSet updatePersonFoster(PersonFoster person){
        
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("Update person_foster SET firstname =?, lastname =?, mobile =  ?, address = ?, city = ?, zip = ?, state = ?, password = ? where username = ?", Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, person.getFirstName());
            ps.setString(2, person.getLastName());
            ps.setLong(3, person.getMobile());
            ps.setString(4, person.getAddress());
            ps.setString(5, person.getCity());
            ps.setInt(6, person.getZipCode());
            ps.setString(7, person.getState());
            ps.setString(8, person.getPassword());
            ps.setString(9, person.getUsername());
            
            

            
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    
    }
    
    public static ResultSet getDeletePersonFoster(String username, boolean isDml) throws SQLException {
        connectDB();
        String query = Constants.FosterPersonDelete+"\'"+username+"\'";
        ResultSet resultSet = null;
        if (isDml) {
            statement.executeUpdate(query);
            return null;
        }

        resultSet = statement.executeQuery(query);

        return resultSet;
    }
    
    public static ResultSet getPersonFosterRole(String username, boolean isDml) throws SQLException {
        connectDB();
        String query = "SELECT password,role_name FROM person_foster WHERE username = "+"\'"+username+"\'";
        ResultSet resultSet = null;
        if (isDml) {
            statement.executeUpdate(query);
            return null;
        }

        resultSet = statement.executeQuery(query);

        return resultSet;
    }
    
    public static ResultSet getPersonLegalRole(String username, boolean isDml) throws SQLException {
        connectDB();
        String query = "SELECT password,role_name FROM person_legal WHERE username = "+"\'"+username+"\'";
        ResultSet resultSet = null;
        if (isDml) {
            statement.executeUpdate(query);
            return null;
        }

        resultSet = statement.executeQuery(query);

        return resultSet;
    }
    
    public static ResultSet storeDataComplaintRegister(ComplaintRegister complaint){
        
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO Complaint_Register VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, complaint.getComplaineeUsername());
            ps.setString(2, complaint.getDistressReporterName());
            ps.setString(3, complaint.getFirstRespondentName());
            ps.setString(4, complaint.getNatureAbuse());
            ps.setString(5, complaint.getDescription());
            ps.setString(6, complaint.getChildName());
            ps.setString(7, complaint.getActions());
            ps.setString(8, complaint.getParentName());
            ps.setString(9, complaint.getStatus());
            ps.setString(10, complaint.getInsertDT());

            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    
    }
    
    public static ResultSet getComplaineeName(String username, boolean isDml) throws SQLException {
        connectDB();
        String query = "SELECT firstname,lastname,emailid FROM Person_Child_Welfare_Sys WHERE username = "+"\'"+username+"\'";
        ResultSet resultSet = null;
        if (isDml) {
            statement.executeUpdate(query);
            return null;
        }

        resultSet = statement.executeQuery(query);

        return resultSet;
    }
    
    public static ResultSet storeDataComplaintHandler(ComplaintHandler complaint){
        
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO Complaint_Handler VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, complaint.getComplaintID());
            ps.setString(2, complaint.getvOUsername());
            ps.setString(3, complaint.getvOName());
            ps.setString(4, complaint.getDate());
            
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    
    }
    
    public static ResultSet getComplaineeEmail(String complaintID) throws SQLException {
        connectDB();
        String query = "SELECT emailid FROM Complaint_register cr JOIN Person_Child_Welfare_Sys pcws ON cr.Complainee_UserName = pcws.username WHERE cr.complaint_id = "+"\'"+complaintID+"\'";
        ResultSet resultSet = null;
        resultSet = statement.executeQuery(query);

        return resultSet;
    }
    
    public static ResultSet updateSetStatus(String complaintID, String statusupdate){
        
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("Update Complaint_Register SET First_Respondent_Name = 'Complaint Handler', Actions = 'Taken' ,status =? where complaint_id = ?", Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, statusupdate);
            ps.setString(2, complaintID);
            
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    
    }
    
    public static ResultSet getComplainVO(String username) throws SQLException {
        connectDB();
        String query = Constants.complaintVOSearch+"\'"+username+"\'";
        ResultSet resultSet = null;
        resultSet = statement.executeQuery(query);

        return resultSet;
    }
    
    public static ResultSet storeDataCaseVerification(CaseVerification case1){
        
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO Case_Verification_Officer VALUES (?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, case1.getVerificationOfficerUsername());
            ps.setInt(2, case1.getComplaintID());
            ps.setString(3, case1.getLevel());
            ps.setString(4, case1.getVisitDescription());
            ps.setString(5, case1.getLegitimateFlag());
            ps.setString(6, case1.getCpsOfficerUsername());
            ps.setString(7, case1.getInsertDT());
            
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    
    }
    
        public static ResultSet getComplainVOCPSAssign(String username) throws SQLException {
        connectDB();
        String query = Constants.complaintVOCPSSearch+"\'"+username+"\'";
        ResultSet resultSet = null;
        resultSet = statement.executeQuery(query);

        return resultSet;
    }
        
    public static ResultSet updateCaseVerification(CaseVerification case1){
        
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("Update Case_Verification_Officer SET CPSOfficer_Username = ?,INSRT_DT = ? where complaint_id = ?", Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, case1.getCpsOfficerUsername());
            ps.setString(2, case1.getInsertDT());
            ps.setInt(3, case1.getComplaintID());
            
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    
    }
        
        
}




