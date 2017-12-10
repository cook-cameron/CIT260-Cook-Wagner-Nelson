/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.view;

import byui.cit260.josephInEgypt.model.Crops;
import byui.cit260.josephInEgypt.model.Game;

/**
 *
 * @author cameroncook
 */
public class ResourceView {
    
    
    //us the display function
    public static void display(){
        
        //create an array : Remember positions
        //wheat= 0
        //Land = 1 
        //Population = 2
      
        String[] items = {"Wheat", "Land", "Population"};
        
        
        // call the crops object 
               Crops theCrops = Game.getCrop();
               
               //get wheat
        int wheat = theCrops.getWheatInStore();
        
                //get land (acres)
        int acres = theCrops.getAcres();
                
                //get population 
                
        int population = theCrops.getPopulation();
        
        //print results 
        
       System.out.println("\nInventory List:");
       //wheat 
       System.out.println("Wheat in Store:" + wheat + " bushels of " + items[0]);
       //acres
       System.out.println("Acres of Land owned:" + acres +  " acres of " +  items[1]);
       
       //population
       System.out.println("Current population:" + population + " people in the " + items[2]);
        
        
        
  }
    
    
    
    
    
    
}
