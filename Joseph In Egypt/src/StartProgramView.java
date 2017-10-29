/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

/**
 *
 * @author rbtwa
 */
//Note:
//Ran out of time on this one, I started on it Wednesday, and have put over 8
//hours of coding into it, which has helped tremendously in expanding my Java
//knowledge, however, since I need to get it turned in now, and I wasn't able to 
//get all of the info I wanted to, I'm turning in what I have for now, and will
//work on completing this next week if I have time to do it.
//Also note: We're down a team member since Kathlyne has withdrawn from this course.
//The reading took about 4-6 hours, and the other assignments about 1-2, so coding
//isn't the only thing I've been working on this week, but the syntax feels like
//it's starting to come together now.
public class StartProgramView {

    public static void displayStartProgramView() {
    
    boolean done = false; // set flag to not done
    do {
        //prompt for and get PlayersName
        String playersName = this.getPlayersName();
        
        if(playersName.toUpperCase().equals("Q")) //user wants to quit
            return; //exit the game
        
        //do requested action and display next view
        done = this.doAction(playersName);
    } while (!done);
    }
    
    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while(!valid) {//loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) {//if value is blank...
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break; //end the loop
            }
        return value; //return the value entered
        }
        /*
        WHILE valid value has not been entered
            DISPLAY promptMessage
            GET the value entered from keyboard
            Trim front and trailing blanks off of the name
        
            IF the length of the value is blank THEN
                DISPLAY "invalid value: The value cannot be blank"
                CONTINUE
            ENDIF
        
            BREAK
        
        ENDWHILE
        RETURN name
        */
    }

    private boolean doAction(String playersName) {
        System.out.println("n/ *** doAction() function called ***");
        return true;
    }
    
    private String promptMessage;
    
    public void startProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
        //display the banner when view is created
    }
        //clicked on lightbult in number line as instructed,
        //and then the tip, which created function below.
    private void displayBanner() {
        //Although I read the alternative game intro view in the PPT slides,
        //I like haviing the "*-box" to introduce the game, but I also prefer 
        //the to-the-point message from your slides, so I commbined the two
        //below.
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

