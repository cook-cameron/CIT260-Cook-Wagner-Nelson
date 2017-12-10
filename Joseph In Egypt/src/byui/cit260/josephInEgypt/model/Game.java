/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.model;

import java.io.Serializable;
import josephInEgypt.control.GameControl;

/**
 *
 * @author cameroncook
 */

    public class Game implements Serializable{


        
        //variables
        private static Crops  theCrops = null;
        
        private static Game theGame =null;
        
        
        

    public static Game getTheGame() {
        return theGame;
    }

    public static void setTheGame(Game theGame) {
        Game.theGame = theGame;
    }
        
 

    public static Crops getCrop() {
        return theCrops;
    }

    /**
     *
     * @param _cropRef
     */
    public static void setCrop(Crops _cropRef) {
        theCrops = _cropRef;
    }

    public static Game getGame(){
        return theGame;
    }
    
    public static void setGame(Game _gameRef){
        theGame = _gameRef;
    }
        

    }