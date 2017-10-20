/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.model;

/**
 *
 * @author cameroncook
 */
public class Crops implements serializable {
    
    
        //declaring (or defining) variables for Crops class.
    
    private int year;
    private int population;
    private int acres;
    private int cropYield;
    private int whatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int pharoahsShare;
    private int fed;
    private int planted;
    
    //declare getters and setters for the above

    private void setYear(int year) {
        this.year = year;
        }
    private int getYear() {
        return year;
        }
    
    private void setPopulation(int population) {
                if (population <= 0) {
        System.out.println("everybody died,");
        }
        else {
        this.population = population;
        }
    }
    
    private int getPopulation() {
        return population;
    }
    
    private void setAcres(int acres) {
        this.acres = acres;
        }
    private int getAcres() {
        return acres;
        }
    
    private void setCropYield(int cropYield) {
        if (cropYield <= 100) {
        System.out.println("Oh snap! Not a great year. No more going to the drive-thru at Burger Pharoah");
        this.cropYield = cropYield;
        }
        else {
        this.cropYield = cropYield;
        }
        }
    private int getCropYield() {
        return cropYield;
        }
    
    private void setWhatInStore(int whatInStore) {
        this.whatInStore = whatInStore;
        }
    private int getWhatInStore() {
        return whatInStore;
        }
    
    private void setNumberWhoDied(int numberWhoDied) {
        if (numberWhoDied >= 5) {
        System.out.println("You're new at this aren't you?");
        this.numberWhoDied = numberWhoDied;
        }
        else {
        this.numberWhoDied = numberWhoDied;
        }
        }
    private int getNumberWhoDied() {
        return numberWhoDied;
        }
    
    private void setNewPeople(int newPeople) {
        this.newPeople = newPeople;
        }
    
    private int getNewPeople() {
        return newPeople;
        }
    
    private void setHarvest(int harvest) {
        this.harvest = harvest;
        }
    private int getHarvest() {
        return harvest;
        }
    
    private void setPharoahsShare(int pharoahsShare) {
        this.pharoahsShare = pharoahsShare;
        System.out.println("You sure that was enough? Remember what happened to the Baker???");
        }
    private int getPharoahsShare() {
        return pharoahsShare;
        }
    
    private void setFed(int fed) {
        this.fed = fed;
        }
    private int getFed() {
        return fed;
        }

    private void setPlanted(int planted) {
        this.planted = planted;
        }
    private int setPlanted() {
        return planted;
        }
}
    

