/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephInEgypt.control;

/**
 *
 * @author Kat
 */
//The feedPeople method
//Purpose: To feed the people of the land.
//Parameters: The numbers of bushels in storage, the population, 
//number of bushels to be fed to the people
//Returns: Population left alive and Amount of wheat in storage
public class FeedPeopleControl {
    public static int feedPeople(int wheatInStore, int wheatForFood){
        
        if(wheatInStore-wheatForFood >= wheatForFood){
            return wheatInStore;}
        else {System.err.println("You cannot feed the people that which "
                + "you don't have");    
        }
  return wheatInStore;
    }
    
   
}
