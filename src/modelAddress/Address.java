/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelAddress;

/**
 *
 * @author nitan
 */
public class Address extends City{
    private String address;
    private Integer zipCode;
    private String state;

    public Address(String address, String city, Integer zipCode, String state) {
        super(city);
        this.address = address;
        this.zipCode = zipCode;
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public String getState() {
        return state;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public void setState(String state) {
        this.state = state;
    }

}
