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
public class Ticket {
    private int ticketID;
    private int purhchaseDate;
    private String ticketType;
    
    public Ticket(int ticketId, int purchaseDate, String ticketType){
        this.ticketID = ticketId;
        this.purhchaseDate = purchaseDate;
        this.ticketType = ticketType;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public int getPurhchaseDate() {
        return purhchaseDate;
    }

    public void setPurhchaseDate(int purhchaseDate) {
        this.purhchaseDate = purhchaseDate;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
    
}
