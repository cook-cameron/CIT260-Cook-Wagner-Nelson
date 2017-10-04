/*
CIT 260 
 */
package byui.cit260.josephInEgypt.model;

import java.io.Serializable;

/**
 *Game Class
 * @author cameroncook
 */
public class Game implements Serializable {
    
    
    private Player Player;

    public Game() {
    }
    
    

    public Player getPlayer() {
        return Player;
    }

    public void setPlayer(Player player) {
        this.Player = player;
    }
    
    
}
