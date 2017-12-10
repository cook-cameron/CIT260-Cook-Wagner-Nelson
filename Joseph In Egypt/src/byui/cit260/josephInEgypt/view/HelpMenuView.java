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
public class HelpMenuView extends View{
    
        private static final int MAX = 6;
    
            private static final String THE_MENU = "\n********************************************************"
        + "\n1 - What are the goals of the game?                    *" 
        + "\n2 - Who is Joseph of Egypt?                            *"
        + "\n3 - How do i view the map?                             *"
        + "\n4 - How do i move to another location?                 *"
        + "\n5 - How do i display whats in the Pharaoh's storehouse?*"
        + "\n6 - Back to the Main Menu                              *"        
        + "\n********************************************************"; 
       


    public HelpMenuView() {
        
        super(THE_MENU, MAX);
        
    }

     




    
        @Override
    public int doAction(int option) {
        
        switch(option){
            case 1: 
                System.out.println("The goals of game are simple, maintain enough food....");
                break;
            case 2: 
                System.out.println("The Story of Joseph in Egypt can be found in the bible in Genesis 37");
                break;
            case 3: 
                System.out.println("To view the map of Egypt, press 1 on the Game Menu Page");
                break;
            case 4: 
                System.out.println("To move to another location, press 3 on the game menu page");
                break;
            case 5: 
                System.out.println("To see a list of resources press 2 on the game menu page");
                break;
            case 6: 
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
                break;
        }
        return option;
        
    

    }





    
}
