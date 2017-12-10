/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephInEgypt.control;

import byui.cit260.josephInEgypt.model.Crops;
import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.view.ResourceView;
import java.util.Scanner;

/**
 *
 * @author cameroncook
 */
public class CropsView {

    public CropsView() {
    }
    private static Game theGame = Game.getGame();
    private static Crops theCrops = Game.getCrop();
    
    // I am not sure if i even need this 
    
    private static Scanner keyboard = new Scanner(System.in);
    
    
    
    
    
    
    
        public void DisplayCropsView() {
        
        ResourceView.display();
        buyLandView();
        //sellLandView();
        //feedPeopleView();
        //calcStarved();
        //plantCropsView();
        //harvestView();
        //growPopulationView();
        //payPharaoh();
       
               
    }

            
            public static void buyLandView() {
                
                int toBuy = 0;
                int landPrice = CropsControl.calcLandCost();
     System.out.format("Land is selling for %d bushels per acre.%n", landPrice);
      
     int wheatInStore = theCrops.getWheatInStore();
     int population = theCrops.getPopulation();
     
     do {
         System.out.println("\nHow many acres of land do you wish to buy? ");
         
         toBuy = keyboard.nextInt();
         
         if(toBuy < 0) {
             
             System.out.println("I am sorry Master, I cannot do this.");
             System.out.println("You cannot buy a negative amount of land.");             
         }
         else if(toBuy * landPrice > wheatInStore) {
             
       System.out.println("I am sorry master, i cannot do this.");
       System.out.println("You do not have enough wheat to buy this much land");
         }
     }while(toBuy < 0 || toBuy * landPrice > wheatInStore);
     CropsControl.buyLand(theCrops, toBuy, landPrice);
      }


     

}