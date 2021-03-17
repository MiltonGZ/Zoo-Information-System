/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zooinfosystem;

/**
 *
 * @author Holo
 */
public class Ticket {
    private int ticketID;
    private int purhchaseDate;
    private String ticketType;
    
    public Ticket(int ticketId, int purchaseDate, String ticketType){
        this.ticketID = ticketId;
        this.purhchaseDate = purchaseDate;
        this.ticketType = ticketType;
    }
}
