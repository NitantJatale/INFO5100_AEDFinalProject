/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelFoster;

/**
 *
 * @author anirudhajoshi
 */
public class FosterDetails {
    private String caseid;
    private String casedesc;
    private String fosterfamily;

    public FosterDetails(String caseid, String casedesc, String fosterfamily) {
        this.caseid = caseid;
        this.casedesc = casedesc;
        this.fosterfamily = fosterfamily;
    }

    public String getCaseid() {
        return caseid;
    }

    public String getCasedesc() {
        return casedesc;
    }

    public String getFosterfamily() {
        return fosterfamily;
    }

    public void setCaseid(String caseid) {
        this.caseid = caseid;
    }

    public void setCasedesc(String casedesc) {
        this.casedesc = casedesc;
    }

    public void setFosterfamily(String fosterfamily) {
        this.fosterfamily = fosterfamily;
    }
    
    
}
