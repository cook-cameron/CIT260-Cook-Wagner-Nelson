/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import java.util.Scanner;

/**
 *
 * @author cameroncook
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    protected int max;

    public View() {
    }

    public View(String message, int maxMenu) {
        this.displayMessage = message;
        this.max = maxMenu;
    }

    /**
     *
     */
    @Override
    public void display(){
        
         int option;
        
            
        do{
               
                System.out.println(displayMessage);
                option = getUserInput();
                doAction(option); // defined on line 88
            }while(option != max);
            }
     
     //deBRy slide week 7
    /* private static int getMenuOption(){
         
         Scanner keyboard = new Scanner(System.in);
         
         
         int inputValue = 0;
         do {
             System.out.print("Please enter an option");
             inputValue = keyboard.nextInt();
             if(inputValue < 1 || inputValue > MAX){
                 System.out.println("Error: invalid option.");
             }
         }while(inputValue < 1 || inputValue > MAX);
             return inputValue;
         }
     */
     
     //changed getMenuOption to getUserInput to match variables 
     
     
    @Override
     public  int getUserInput(){
         //import scanner
         Scanner keyboard = new Scanner(System.in);
         //input value = 0 
         int inputValue;
         
         do {
             System.out.print("Please enter an option:");
             inputValue = keyboard.nextInt();
             
             if(inputValue < 1 || inputValue > 7){ //need to change to MAX
                 System.out.println("Error, invalid option.");
             }
             
             }
         while(inputValue < 1 || inputValue > 7);//need to change to MAX
         //if number meets criteria return value to pull menu     
         return inputValue;
     }
             
        
    }
    
    
    
    

       
    
    

