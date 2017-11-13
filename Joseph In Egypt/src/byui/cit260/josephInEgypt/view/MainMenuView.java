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
public class MainMenuView extends View {

    public MainMenuView() {
    }
    
    
    
    //Main Menu assigned to THE_MENU
    private String THE_MENU = "\n**********"
        + "\n1 - Start New Game           *" 
        + "\n2 - Load a Saved Game        *"
        + "\n3 - Get Help on How to Play  *"
        + "\n4 - Save this Game           *"
        + "\n5 - Quit                     *"
        + "\n******************************"; 
       
    //Scope of Scanner Keyboard? Ask why class scope didnt work
    //MAX references w.7 slide 19 -- total number of options
    Scanner keyboard = new Scanner(System.in);
     private static final int MAX = 5;
     
     
    

     //page 44 of week 7 team assignment 
    @Override
    public int doAction(int option) {
        //switch selector statement
         switch(option){
            case 1: startNew(); //each case defined below
                break;
            case 2: startSaved();
                break;
            case 3: displayHelpView();
                break;
            case 4: saveGame();
                break;
            case 5: quit();
                break;
            case 6: System.out.println("not valid");//temporary MAX fix
        }
        return option;
        
    }
        
    //page 45 from team assignment w.7
    
    private void startNew() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void startSaved() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpView() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
        
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void quit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
            
        
    
    
    
    
    
    

   
    

