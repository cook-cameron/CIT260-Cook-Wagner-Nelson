/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephInEgypt.control;

import byui.cit260.joseph.in.egypt.JosephInEgypt;
import byui.cit260.josephInEgypt.model.Crops;

import byui.cit260.josephInEgypt.model.Game;
import byui.cit260.josephInEgypt.model.Player;


/**
 *
 * @author cameroncook
 */
public class GameControl {

    /**
     *
     * @param name
     * @return
     */
    public static Player createPlayer(String name) {

        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setName(name);
        
        JosephInEgypt.setPlayer(player);
        

        return player;

    }

    public static void createNewGame(Player player) {
        System.out.println("The createNewGame() Method goes here");
    }

    public static void createCrops() {

        Crops theCrops = new Crops();

        theCrops.setYear(0);
        theCrops.setPopulation(95);
        theCrops.setNewPeople(5);
        theCrops.setCropYield(3);
        theCrops.setFed(0);
        theCrops.setNumberWhoDied(0);
        theCrops.setPharaohsShare(200);
        theCrops.setWheatInStore(2800);
        theCrops.setAcres(1000);
        theCrops.setHarvest(0);
        theCrops.setPlanted(1000);

        Game.setCrop(theCrops);

    }

}
