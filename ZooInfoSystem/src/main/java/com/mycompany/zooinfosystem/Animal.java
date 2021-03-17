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
public class Animal {
    
    private int animalId;
    private String animalName;
    private String animalSpecies;
    private String zooLocation;
    private int arrivalDate;
    private int dob;

    public Animal(int animalId, String animalName, String animalSpecies, String zooLocation, int arrivalDate, int dob) {
        this.animalId = animalId;
        this.animalName = animalName;
        this.animalSpecies = animalSpecies;
        this.zooLocation = zooLocation;
        this.arrivalDate = arrivalDate;
        this.dob = dob;
    }
    
}
