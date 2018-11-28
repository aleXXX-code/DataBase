/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_HR;

/**
 *
 * @author admin
 */
public class Employee {
    private String first_name;
    private String last_name;
    private int employee_id;
    

    public Employee() {
    }

    public Employee(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    } 

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
    
    public String toString(){
        return first_name+" "+last_name;
}
}
