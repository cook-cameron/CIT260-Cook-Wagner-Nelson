/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import byui.cit260.josephInEgypt.model.Game;
import josephInEgypt.control.CropsView;

/**
 *
 * @author cameroncook
 */


//by extending to the abstract View class, we gain acces to those common methods
public class GameMenuView extends View {
    //create a new game instance "theGame" and reference the game class method
    private static Game theGame = Game.getTheGame();
    
        //the length of the menu is 5 and assigned to var MAX    
    private static final int MAX = 5;
    

    
    // the menu to be printed is assigned the variable THE_MENU
    private static final String THE_MENU = "\n******************************"
        + "\n1 - View Map                  *" 
        + "\n2 - View Resources            *"
        + "\n3 - Move Location             *"
        + "\n4 - Manage Crops              *"
        + "\n5 - Main Menu                 *"
        + "\n******************************"; 
    
    

    
        //use the 
        
        public GameMenuView(){
               super(THE_MENU, MAX);
    }




@Override
    public int doAction(int option) {     
        switch(option){
            case 1: viewMap();
                break;
            case 2: viewList();
                break;
            case 3: moveLocation();
                break;
            case 4: manageCropsView();
                break;
            case 5: MainMenuView();
                break;
        }
        return option;
        
    }

   
    private void viewMap() {
        System.out.println("The viewMap() Method goes here");
    }

    private void viewList() {
        ResourceView list = new ResourceView();
                ResourceView.display();
    }

    private void moveLocation() {
        System.out.println("The moveLocation() Method goes here");
    }

     private void manageCropsView() {
        CropsView theCropsView = new CropsView();
        theCropsView.DisplayCropsView();
    }
    
    private void MainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }  
        
        
        
        
        
        
        
        
        
        
        
}



    
    
    
    
    

