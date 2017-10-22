/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephInEgypt.control;

import byui.cit260.josephInEgypt.model.Crops;
import static java.lang.System.in;
import static jdk.internal.org.objectweb.asm.commons.GeneratorAdapter.AND;

/**
 *
 * @author cameroncook
 */
public class CropsControl {



    // empty (default) constructor
    public CropsControl() {}
    
    // the buyLand method
    // Purpose: Process data input by user to buy land
    // Parameters: Crops object, amount of land to Purchase, and land price
    // Returns: none

    /**
     *
     * @param theCrops
     * @param ToBuy
     * @param landCost
     * @return
     */
    public static int buyLand(Crops theCrops, int ToBuy, int landCost)
    {
       
      
        
// see if we have enough wheat
        if(ToBuy * landCost > theCrops.getWheatInStore())
        {
            // error, not enough wheat
            return -1;
        }
        
        // subtract wheat we spent from wheat in store
        int wheatInStore = theCrops.getWheatInStore();
        wheatInStore = wheatInStore - (ToBuy * landCost);
        
        // add land to land owned
        int acres = theCrops.getAcres();
        acres = acres + ToBuy;
        
        // save the updated values of the data back in the model layer
        theCrops.setWheatInStore(wheatInStore);
        theCrops.setAcres(acres);
        
        return acres; // return landOwned so we can unit test this method
        
    }
    
    /**
     *
     * @param theCrops
     * @param toPlant
     * @param pricePerAcre
     * @return
     */
    public static int plantCrops(Crops theCrops, int pricePerAcre){
        int wheatInStore = theCrops.wheatInStore;
        int acres= theCrops.getAcres();
      
        
        
        
        	if (planted<= acres) && (.planted x 2 <= wheatInStore){
                wheatInStore= wheatInStore-pricePerAcre;
                    return wheatInStore;
                        }   
                if else()
                {
                       System.err.printIn(“error”);
                      
                
                 
                        }
               
                
              
                
                
                
                
                
                
      
        
        
        
        
    }
    
    
    
    
    
    
    
        
    
    
    
    
    
    
        
    
    
    
    
    
    
        
    
    
    
    
    
    
    
    
    
}