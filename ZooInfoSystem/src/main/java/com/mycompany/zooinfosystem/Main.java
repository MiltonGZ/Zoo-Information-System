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
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Zoo's Name:");
        String zooName = scanner.nextLine();
        System.out.println("Welcome to " + zooName);
        Zoo newZoo = new Zoo(zooName);
        UserInterface ui = new UserInterface(scanner);
        ui.start();
    }
}