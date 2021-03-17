package com.mycompany.zooinfosystem;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MiltonGZ
 */
public class Zoo {
    private ArrayList<Animal> animals;
    private ArrayList<Customer> customers;
    private ArrayList<Employee> employees;
    private String zooName;
    
    public Zoo(String zooName){
        this.zooName = zooName;
    }
    public void addAnimal(){
        this.animals.add(new Animal(1, "a", "b", "c", 2, 3));
    }
    public void addCustomer(){
        this.customers.add(new Customer(1, "a", "b", 2));
    }
    public void addEmployee(){
        this.employees.add(new Employee(1, "a", "b", 2, 3));
    }
}
