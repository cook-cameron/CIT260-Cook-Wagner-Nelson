/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.control;

/**
 *
 * @author rbtwa
 */
public class sellLandControl {
    //The sellLand method.
    //Purpose: To sell land.
    //Parameters: Land owned (acres), land to buy, price of land, wheat in 
    //store, and a reference to the Crops Object.
    //Returns: Amount of wheat gained from sell as well as acres lost/sold.
    //Pre-conditions: Acres to sell must be 0 or greater, and land owned must
    //be greater than land to sell.
public int sellLand(Crops theCrops, int acres, int price, int wheat, 
        int wheatFromSell, int sellLand) {
    
    //define price for acres for testing purposes
    price=17;
    
    //define amount of acres owned for testing purposes
    acres=1000;
    
    //define amount of acres to sell for testing purposes
    sellLand=10;
    
    //The below notes are copied from algorithm in last week's assignment:
    //if sellLand > acresOwned, or less than zero return error
    //wheatFromSell = sellLand * acrePrice 
    //wheatInStore = wheatInStore + wheatFromSell
    //acresOwned = acresOwned - sellLand
    if(sellLand>acres || sellLand<0) {
    return -1;
    }
    else {
    acres=theCrops.getacresOwned-sellLand;
    wheatFromSell=sellLand*price;
    wheat=theCrops.getwheatInStore+wheatFromSell;
    return wheat;
    }
    }

    //Print data to test results 
    System.out.println(acresOwned);
    System.out.println(wheatFromSell);
    System.out.println(wheatInStore);
}   
