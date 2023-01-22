/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ankithreddy
 */
public class Person {
    
    int NUID;
    String firstName;
    String lastName;
    String collegeName;
    Contact office;
    Contact personal;
    Address currentAddress;
    Address permanentAddress;
    
    
    public Person() {
        this.firstName = "";
        this.lastName= "";
        this.collegeName="";
        this.office = new Contact();
        this.personal = new Contact();
        this.currentAddress = new Address();
        this.permanentAddress = new Address();
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
     public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNUID() {
        return NUID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setNUID(int NUID) {
        this.NUID = NUID;
    }

   

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public Contact getOffice() {
        return office;
    }

    public Contact getPersonal() {
        return personal;
    }

    public void setOffice(Contact office) {
        this.office = office;
    }

    public void setPersonal(Contact personal) {
        this.personal = personal;
    }
    
    
    
    
    public static void main (String args[]){
        
        Person obj = new Person();
        
        obj.setFirstName("Ankith");
        
        obj.setLastName("reddy");
        
        
        Address cAdd = obj.getCurrentAddress();
        
        cAdd.setStreetName("roxbury");
        
        Address pAdd = obj.getPermanentAddress();
        
        Contact oContact = obj.getOffice();
        
        Contact pContact = obj.getPersonal();
        
        
        
        
        
        
        
    }
}
