/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephInEgypt.control;

import byui.cit260.josephInEgypt.model.Crops;

import java.util.Random;
/**
 *
 * @author cameroncook
 */
public class CropsControl { 

    public CropsControl() {
    }
    

    private static Random random = new Random();
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 10;
    

    
    public static int calcLandCost() {
        int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
        return landPrice;
        
    }
    
    /**
     *
     * @param theCrops
     * @param toBuy
     * @param landPrice
     * @return
     */
       
    public static int buyLand(Crops theCrops, int toBuy, int landPrice){
    
        
       
 // see if we have enough wheat
        if(toBuy * landPrice > theCrops.getWheatInStore())
        
            // error, not enough wheat
            return -1;
        
        
        // subtract wheat we spent from wheat in store
        int wheatInStore = theCrops.getWheatInStore();
        wheatInStore = wheatInStore - (toBuy * landPrice);
        
        // add land to land owned
        int acresOwned = theCrops.getAcres();
        acresOwned = toBuy + acresOwned;
        
        // save the updated values of the data back in the model layer
        theCrops.setWheatInStore(wheatInStore);
      
        theCrops.setAcres(acresOwned);
        
        return wheatInStore; // return acres
        
    }
   
        public int sellLand(Crops theCrops, int toSell){
    
        int acres = theCrops.getAcres();
        int wheatInStore = theCrops.getWheatInStore();
        
        if ((toSell > acres) && (toSell < 0))
            return -1;
        
        acres = acres - toSell;
        theCrops.setAcres(acres);
        
        int landPrice = calcLandCost();
        
        wheatInStore = wheatInStore - (toSell - landPrice);
        theCrops.setWheatInStore(wheatInStore);
        
        return acres;
    
    }
    
        
        public int plantCrops(Crops theCrops, int toPlant){
       	
        int wheatNeeded = toPlant * 2;
        int wheat = theCrops.getWheatInStore();
        int acres = theCrops.getAcres();
        
        
        
        // to plant has to be greater than zero
        //toPlant cannot be more than acres owned (acres)
        // WheatNeeded cannot be greater than Wheat
        if((toPlant < 0) && (toPlant > acres) && (wheatNeeded > wheat))
            return -1;        
       
        
        wheat = wheat - wheatNeeded;
        
        
        //set wheatInStore and Planted using setters
        theCrops.setWheatInStore(wheat);
        theCrops.setPlanted(toPlant);
        
        //return wheat to test
        return wheat;
        

    }
        
        
      
        
        
    
}
    
    
    