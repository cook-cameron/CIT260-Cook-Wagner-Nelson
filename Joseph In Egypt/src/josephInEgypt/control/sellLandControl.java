/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author rbtwa
 */

package byui.cit260.josephInEgypt.control;

import byui.cit260.josephInEgypt.model.Crops;

public class sellLandControl 
{
    //Default Constructor
    public sellLandControl() {}
        //The sellLand method.
        //Purpose: To sell land.
        //Parameters: Land owned (acres), land to buy, price of land, wheat in 
        //store, and a reference to the Crops Object.
        //Returns: Amount of wheat gained from sell as well as acres lost/sold.
        //Pre-conditions: Acres to sell must be 0 or greater, and land owned must
        //be greater than land to sell.
    public static int sellLand(Crops theCrops, int acresOwned, int landPrice, 
    int wheatInStore, int wheatFromSell, int sellLand) 
    {
        wheatInStore=theCrops.getWheatInStore();
        acresOwned=theCrops.getAcresOwned();
        landPrice=theCrops.getLandPrice();
        wheatFromSell=theCrops.getWheatFromSell();
        sellLand=theCrops.getSellLand();
        //define price for acres for testing purposes
        landPrice=17;

        //define amount of acres owned for testing purposes
        acresOwned=1000;

        //define amount of acres to sell for testing purposes
        sellLand=10;

        //The below notes are copied from algorithm in last week's assignment:
        //if sellLand > acresOwned, or less than zero return error
        //wheatFromSell = sellLand * acrePrice 
        //wheatInStore = wheatInStore + wheatFromSell
        //acresOwned = acresOwned - sellLand
        if(sellLand>acresOwned || sellLand<0) 
        {
            //error, either not enough land, or invalid input
            return -1;
        }
    
        else
        {
            acresOwned-=sellLand;
            wheatFromSell=sellLand*landPrice;
            wheatInStore+=wheatFromSell;
            return wheatInStore;
        }
}
   /*Print data to test results 
    runTest(Crops theCrops, int acresOwned, int wheatFromSell, int wheatInStore)
    {
    System.out.println(acresOwned);
    System.out.println(wheatFromSell);
    System.out.println(wheatInStore);
    return ;
    */
}
   
    

