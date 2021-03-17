/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zooinfosystem;
import java.util.ArrayList;

/**
 *
 * @author Holo
 */
public class Customer {
    private int custId;
    private String custName;
    private String custAddress;
    private ArrayList<Ticket> purchases;
    private int cardNumber;

    public Customer(int custId, String custName, String custAddress, ArrayList<Ticket> purchases, int cardNumber) {
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
        this.purchases = new ArrayList<>();
        this.cardNumber = cardNumber;
    }
    
    
}
