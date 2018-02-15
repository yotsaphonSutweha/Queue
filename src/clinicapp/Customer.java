/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicapp;

/**
 *
 * @author yo
 */
public class Customer {
    private String name;
    private String symptom;
    
    public Customer(String name, String symptom){
       this.name = name;
       this.symptom = symptom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }
    
    public String displayInfo(){
        return name + " " + symptom;
    }
    
}
