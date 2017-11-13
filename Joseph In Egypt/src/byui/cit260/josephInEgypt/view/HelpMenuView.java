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
public class HelpMenuView extends View{

    public HelpMenuView() {
    }
    
        private String THE_MENU = "\n********************************"
        + "\n1 - What are the goals of the game?                    *" 
        + "\n2 - Who is Joseph of Egypt?                            *"
        + "\n3 - How do i view the map?                             *"
        + "\n4 - How do i move to another location?                 *"
        + "\n5 - How do i display whats in the Pharaoh's storehouse?*"
        + "\n6 - Back to the Main Menu                              *"        
        + "\n********************************************************"; 
       
    //Scope of Scanner Keyboard? Ask why class scope didnt work
    //MAX references w.7 slide 19 -- total number of options
    Scanner keyboard = new Scanner(System.in);
     
     




    
        @Override
    public int doAction(int option) {
        
        switch(option){
            case 1: 
                System.out.println("The goals of game are...");
                break;
            case 2: 
                System.out.println("Joseph of Egypt is...");
                break;
            case 3: 
                System.out.println("To view the map of Egypt...");
                break;
            case 4: 
                System.out.println("To move to another location...");
                break;
            case 5: 
                System.out.println("To see a list of resources...");
                break;
            case 6: 
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
                break;
        }
        return option;
        
    }

    @Override
    public String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
