/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephInEgypt.model;

import java.io.Serializable;

/**
 *
 * @author Kat
 */
public class InventoryItem implements Serializable {
    
    private String description;
    private int quantity;
    

    public InventoryItem() {
}
        public String getDescription(){
        return description;
        }
        
        public void setDescription(String descritption){
        this.description = description;
        }
        
        public int getQuantity(){
        return quantity;
        }
        
        public void setQuantity(int quantity){
        this.quantity = quantity;
        }
        
    
}

