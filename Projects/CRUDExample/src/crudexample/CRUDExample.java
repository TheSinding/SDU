/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudexample;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author thesinding
 */
public class CRUDExample {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        int c;
        // TODO code application logic here
        HashMap<String,Integer> db = new HashMap<>();
           
        CRUD dbCon = new CRUD(db);
        
        System.out.println("Welcome to the Hash master 2000 v0.1.2021312 build version 201231423141, copyright goes to the hansome man!");
        System.out.println("Enter a command (number)");
        System.out.println("------------------------");
        System.out.println("1 - Create / add an entry to the database");
        System.out.println("2 - Read an entry");
        System.out.println("3 - Update an entry");
        System.out.println("4 - Delete an entry");
        System.out.println();

        System.out.println("9 - Quit");

        while(true){
            Scanner s = new Scanner(System.in);

            System.out.print("> ");
            c = Integer.parseInt(s.nextLine());
            int readValue, value;
            String key;
            switch(c){
                case 1:
                    System.out.print("Enter key > ");
                    key = s.nextLine();
                    System.out.print("Enter value > ");
                    value = Integer.parseInt(s.nextLine()); 

                    dbCon.createEntry(key, value);
                    readValue = (int) dbCon.readEntry(key);
                    if(readValue != -1){
                        System.out.println("Key: " + key + " - " + readValue);
                    } else {
                        System.out.println("Something went wrong");
                    }
                    break;
                case 2:
                    System.out.print("Enter key > ");
                    key = s.nextLine();
                    readValue = (int) dbCon.readEntry(key);
                    if(readValue != -1){
                        System.out.println("Key: " + key + " - " + readValue);
                    } else {
                        System.out.println("Something went wrong");
                    }
                    break;
                case 3:
                    System.out.print("Enter key > ");
                    key = s.nextLine();
                    int oldValue = (int) dbCon.readEntry(key);
                    System.out.print("Enter new value > ");
                    value = Integer.parseInt(s.nextLine()); 

                    dbCon.updateEntry(key, value);
                    readValue = (int) dbCon.readEntry(key);
                    if(readValue != -1){
                        System.out.println("Key: " + key + " has been updated! \nOld value: "+oldValue + "\nNew value: " + readValue);
                    } else {
                        System.out.println("Something went wrong");
                    }
                    break;
                    
                case 4:
                    System.out.print("Enter key > ");
                    key = s.nextLine();
                    System.out.println("Are you sure! (y/n)");
                    System.out.print("> ");
                    String a = s.nextLine();
                    if(a.equals("y")){
                        if(dbCon.deleteEntry(key)){
                            System.out.println("Success! Key deleted!");
                        }    
                    } else {
                        System.out.println("Aborting!...");
                    }
                    break;
                case 9:
                    System.out.println("Bye");
                    System.exit(0);
            }
        }
        

    }
}

