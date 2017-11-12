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
        "\n****************************************************************"
      + "\n*                                                              *"
      + "\n* Welcome to the game of Joseph in Egypt. In this game, you    *"
      + "\n* will assume the role of an overseer for your village. Tread  *"
      + "\n* carefully, if your people are not fed well, you may lose     *"
      + "\n* your head.                                                   *"
      + "\n                                                               *"
      + "\n****************************************************************"   
       );
    }

    public void displayStartProgramView() {
        System.out.println("\n*** displayStartProgram() function called ***");
    }
    
}
