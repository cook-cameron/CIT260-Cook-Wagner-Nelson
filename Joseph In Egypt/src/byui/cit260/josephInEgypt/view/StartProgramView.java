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
public final class StartProgramView {
    
    /**
     *
     */
    public final String promptMessage;
      
      
    public StartProgramView() {
        
        this.promptMessage = "\nPlease enter your name:";
        
        this.displayBanner();
        
        
       
        
        
    }

    public void displayBanner() {
        
             System.out.println(
          "\n**************************************************************"
        + "\n* Welcome to Pharaoh’s court. You have been summoned         *" 
        + "\n* here to assume your new role as Agricultural Overseer.     *"
        + "\n* You report directly to Joseph, Pharaoh’s Vizier. Your      *"
        + "\n* responsibility is to gather the grain from the harvest,    *"
        + "\n* provide enough food to the people so they do not go hungry,*"
        + "\n* and reserve the rest in Pharaoh’s granary in preparation   *"
        + "\n* for the prophesied famine that is to come in seven years.  *" 
        + "\n* You need to know how to plant crops, develop land, feed the*"
        + "\n*people and store the excess. If you fail to provide enough  *"
        + "\n* food for the people, the people will starve. Some people   *"
        + "\n* will die. Your workforce will be diminished, and you will  *"
        + "\n* not have enough workers to plant and harvest crops. Pharaoh*"
        + "\n* will not be pleased with those who fail him. Those who fail*"
        + "\n* are thrown in prison. He's not very nice to prisoners--just*"
        + "\n* ask the Royal Baker. Oh, you can't because he's not around *"
        + "\n* anymore,RIP.                                               *"
        + "\n*            Be wise and you will be successful.             *"
        + "\n**************************************************************"   
       );
    }

    /**
     *
     */
    public void displayStartProgramView() {
       System.out.println("\n*** displayStartProgram() function called ***"); //To change body of generated methods, choose Tools | Templates.
    }


    
}
