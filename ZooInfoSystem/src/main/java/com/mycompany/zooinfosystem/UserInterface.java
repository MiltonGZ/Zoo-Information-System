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
    private int empOrCust = 0;
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.empOrCust = empOrCust;
    }
    
    public void start(){
        while(true){
            System.out.println("Are you an employee or customer?");
            System.out.println(" 1 - Employee");
            System.out.println(" 2 - Customer");
            System.out.println(" 3 - Log out");
            //option 4 is a hidden option for managers
            this.empOrCust = Integer.valueOf(scanner.nextLine());
            if(empOrCust==3){
                System.out.println("Come back again!");
                break;
            }else{
                firstMenu();
            }
            
            
            
        }
    }
    public void firstMenu(){
        switch (empOrCust) {
                case 1:
                    if(empOrCust==1){
                        empMenu();
                    }
                case 2:
                    if(empOrCust==2){
                        customerMenu();
                    }
                case 3:
                    if(empOrCust==4){
                        int keyCode = 2021;
                        System.out.println("Enter keycode");
                        int prompt = Integer.valueOf(scanner.nextLine());
                        if(prompt==keyCode){
                            managerMenu();
                        }else{
                            System.out.println("You're not a Manager!");
                            break;
                        }
                    }
            }
    }
    public void customerMenu(){
        System.out.println("What would you like to do?");
    }
    public void empMenu(){
        System.out.println("What would you like to do?");
    }
    public void managerMenu(){
        System.out.println("What would you like to do?");
    }
    
}
