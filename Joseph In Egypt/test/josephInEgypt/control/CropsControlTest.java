/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephInEgypt.control;

import josephInEgypt.control.CropsControl;
import byui.cit260.josephInEgypt.model.Crops;
import static josephInEgypt.control.CropsControl.calcLandCost;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cameroncook
 */
public class CropsControlTest {
    
    public CropsControlTest() {
    }

    /**
     * Test of calcLandCost method, of class CropsControl.
     */
    @Test
    public void testCalcLandCost() {
        System.out.println("calcLandCost");
        System.out.println("calcLandCost");
        int expResult = 0;
        int result = CropsControl.calcLandCost();
        
        if ((result >= 17) && (result <= 27))
            System.out.println("sucess");
        
        else 
            System.out.println("error");
    }

    /**
     * Test of buyLand method, of class CropsControl.
     */
    @Test
    public void testBuyLand() {
        System.out.println("buyLand");
        Crops theCrops = new Crops();
        theCrops.setWheatInStore(2800);
        theCrops.setAcres(100);
        
        int toBuy = 10;
        int landPrice = 20;
        int expResult = 2600;
        int result = CropsControl.buyLand(theCrops, toBuy, landPrice);
        assertEquals(expResult, result);

    }

    /**
     * Test of sellLand method, of class CropsControl.
     */
    @Test
    public void testSellLand() {
        System.out.println("sellLand");
        Crops theCrops = new Crops();
        theCrops.setAcres(100);
        theCrops.setWheatInStore(2800);
        
        
        int toSell = 10;
        CropsControl instance = new CropsControl();
        int expResult = 90;
        int result = instance.sellLand(theCrops, toSell);
        assertEquals(expResult, result);
        System.out.println(calcLandCost());
    }

    /**
     * Test of plantCrops method, of class CropsControl.
     */
    @Test
    public void testPlantCrops() {
        System.out.println("plantCrops");
        Crops theCrops = new Crops();
        theCrops.setWheatInStore(2800);
        theCrops.setAcres(100);
        
        
        int toPlant = 100;
        CropsControl instance = new CropsControl();
        int expResult = 2600;
        int result = instance.plantCrops(theCrops, toPlant);
        assertEquals(expResult, result);
        System.out.print(theCrops);
      
    }
    
}
