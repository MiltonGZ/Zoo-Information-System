/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zooinfosystem;
import java.util.ArrayList;

/**
 *
 * @author MiltonGZ
 */
public class Customer {
    private int custId;
    private String custName;
    private String custAddress;
    private ArrayList<Ticket> purchases;
    private int cardNumber;

    public Customer(int custId, String custName, String custAddress, int cardNumber) {
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
        this.purchases = new ArrayList<>();
        this.cardNumber = cardNumber;
    }
    public void addTicket(){
        this.purchases.add(new Ticket(1, 1, "a"));
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public ArrayList<Ticket> getPurchases() {
        return purchases;
    }

    public void setPurchases(ArrayList<Ticket> purchases) {
        this.purchases = purchases;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    
}
