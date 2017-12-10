/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

/**
 *
 * @author cameroncook
 */
public class MainMenuView extends View {
    
    private static final int MAX =5;
          //Main Menu assigned to THE_MENU
    private static final String THE_MENU = "\n******************************"
        + "\n1 - Start New Game           *" 
        + "\n2 - Load a Saved Game        *"
        + "\n3 - Get Help on How to Play  *"
        + "\n4 - Save this Game           *"
        + "\n5 - Quit                     *"
        + "\n******************************"; 

    

    public MainMenuView(){
        super(THE_MENU, MAX);
    }


    

     
    

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
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.display();
    }

    private void startSaved() {
       System.out.println("The startSaved() Method goes here");
    }

    private void displayHelpView() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
        
    }

    private void saveGame() {
        System.out.println("The saveGame() Method goes here");
    }

    private void quit() {
           //quit Game method.
        System.out.println("Thanks for playing...Goodbye!");
        System.exit(0);
    }








}
            
        
    
    
    
    
    
    

   
    

