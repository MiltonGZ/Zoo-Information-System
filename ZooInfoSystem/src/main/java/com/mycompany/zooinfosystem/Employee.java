/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zooinfosystem;

/**
 *
 * @author MiltonGZ
 */
public class Employee {
    private int empId;
    private String eName;
    private String driversLicense;
    private int dob;
    private int phoneNumber;

    public Employee(int empId, String eName, String driversLicense, int dob, int phoneNumber) {
        this.empId = empId;
        this.eName = eName;
        this.driversLicense = driversLicense;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
    }
    
    
}
