/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephInEgypt.control;

/**
 *
 * @author cameroncook
 */
public class CropsControl {
    
    
    public static int buyLand(int landPrice, int acresToBuy, Crops theCropsObj){
        
        if(toBuy<0)
            return-1;
        
        
        int wheat = theCrops.getWheatInStore();
        if(wheat< toBuy*landCost)
            return -1;
        
        int acres =theCrops.getAcres();
        acres+=toBuy;
        theCrops.setAcres(acres);
        
        wheat-=(toBuy*landCost);
        TheCrops.setWheatInStore(wheat);
        return wheat;
        
        
        
        
        
        
    }
        
}
