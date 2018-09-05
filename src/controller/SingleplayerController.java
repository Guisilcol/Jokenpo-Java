package controller;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Player;
import utility.ImageUtility;

/**
 *
 * @author guilherme
 */
public class SingleplayerController {
    
    /**
     * Execute the game by changing the JLabels images and announcing the winner
     * 
     * @param player1 Player object representing a player choice
     * @param cpu Player object representing CPU choice
     * @param lblPlayerImg JLabel of the player to be modified
     * @param lblCPUImg JLabel of the CPU to be modified
     */
    public static void runMatch(Player player1, Player cpu, JLabel lblPlayerImg, JLabel lblCPUImg){
        
        changeLabelImage(lblPlayerImg, player1);
        changeLabelImage(lblCPUImg, cpu);
        
        advertiseWinner(player1, cpu);   
    }
   
    /**
     * Announce the winner of the match
     * @param player1 Object player1 for comparison
     * @param player2 Object player2 for comparison
     */
    public static void advertiseWinner(Player player1, Player player2){
        
        int result = Player.verifyWinner(player1, player2);
        
        switch(result){
            case 0:
                
                JOptionPane.showMessageDialog(null, "Draw!");
                break;
            case 1:
                
                JOptionPane.showMessageDialog(null, "Player1 Win!");
                break;
            
            case 2:
                
                JOptionPane.showMessageDialog(null, "Player2 Win!");
                break;
                
        }
    }
    
    /**
     * Changes the JLabel image according to the player's choice
     * @param label to JLabel that will be modified
     * @param player Player object representing choice
     */
    public static void changeLabelImage(JLabel label, Player player){
        
        int choose = player.getChoose();
        
        switch(choose){
            
            case 1: //Rock

                label.setIcon(ImageUtility.newJLabelWallpaper("src/view/image/game/rock.png", label));
                break;
                
            case 2: //Paper
                
                label.setIcon(ImageUtility.newJLabelWallpaper("src/view/image/game/paper.png", label));
                break;
                
            case 3: //Scissor
                
                label.setIcon(ImageUtility.newJLabelWallpaper("src/view/image/game/scissor.png", label));
                break;
        }
    }
}
