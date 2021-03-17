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
import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Are you an employee or customer?");
            System.out.println(" 1 - Employee");
            System.out.println(" 2 - Customer");
            System.out.println(" 3 - stop");
            int empOrCust = Integer.valueOf(scanner.nextLine());
            switch (empOrCust) {
                case 1:
                    if(empOrCust==1){
                    }
                case 2:
                    if(empOrCust==2){
                    }
                case 3:
                    if(empOrCust==3){
                    }
                default:
                    break;
            }
            
            
        }
    }
    public void customerMenu(){
        
    }
    public void empMenu(){
        
    }
    
}
