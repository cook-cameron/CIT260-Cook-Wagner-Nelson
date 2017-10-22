/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephInEgypt.control;

import byui.cit260.josephInEgypt.model.Crops;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author cameroncook
 */
public class CropsControlTest {


    /**
     *
     */
public void BuyLand()
{
    System.out.println("testBuyLand");
System.out.println("** buyLand test case 1 **");
// we need a crops object with the following values filled in
Crops theCrops = new Crops();
theCrops.setWheatInStore(2800);
theCrops.setAcres(0);
int toBuy = 10;
int landCost = 20;
CropsControl instance = new CropsControl();
int expResult = 800;
int result = instance.buyLand(theCrops, toBuy, landCost);
assertEquals(expResult, result);
                
        
        
    }


    /**
     * Test of buyLand method, of class CropsControl.
     */
    @Test
    public void testBuyLand() 
    {
        System.out.println("buyLand");
        Crops theCrops = null;
        int ToBuy = 0;
        int landCost = 0;
        int expResult = 0;
        int result = CropsControl.buyLand(theCrops, ToBuy, landCost);
        assertEquals(expResult, result);

    }
    
    
    
    
    
    
            public void plantCrops()
        {
                System.out.println("testPlantCrops");
System.out.println("** plantCrops test case 1 **");
            Crops theCrops = new Crops();
theCrops.setWheatInStore(2800);
theCrops.setAcres(100);
int toPlant = 10;
int pricePerAcre = 2;
CropsControl instance = new CropsControl();
int expResult = 0;
int result = instance.plantCrops(theCrops, toPlant, pricePerAcre);
assertEquals(expResult, result);
            
            
            
        }
            
            @Test
            
            public void testPlantCrops() 
            {
        System.out.println("plantCrops");
        Crops theCrops = null;
        int toPlant = 0;
        int pricePerAcre = 0;
        int expResult = 0;
        int result = CropsControl.plantCrops(theCrops, toPlant, pricePerAcre);
        assertEquals(expResult, result);

                
                
}
}