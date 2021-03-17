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

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalSpecies() {
        return animalSpecies;
    }

    public void setAnimalSpecies(String animalSpecies) {
        this.animalSpecies = animalSpecies;
    }

    public String getZooLocation() {
        return zooLocation;
    }

    public void setZooLocation(String zooLocation) {
        this.zooLocation = zooLocation;
    }

    public int getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(int arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Animal{" + "animalId=" + animalId + ", animalName=" + animalName + ", animalSpecies=" + animalSpecies + ", zooLocation=" + zooLocation + ", arrivalDate=" + arrivalDate + ", dob=" + dob + '}';
    }
    
    
    
}
