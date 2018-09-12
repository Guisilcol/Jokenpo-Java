package controller;

import javax.swing.JLabel;
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
     * @param lblPlayerScore JLabel representing the player score
     * @param lblCpuScore JLabel representing the CPU score
     * @param lblDraw JLabel representing the draw of the match
     * @param lblPlayerWin JLabel adverting the victory of the player
     * @param lblCpuWin JLabel adverting the victory of the CPU
     * 
     */
    public static void runMatch(Player player1, Player cpu, JLabel lblPlayerImg, JLabel lblCPUImg, JLabel lblPlayerScore, JLabel lblCpuScore,
            JLabel lblDraw, JLabel lblPlayerWin, JLabel lblCpuWin){
        
        changeLabelImage(lblPlayerImg, player1);
        changeLabelImage(lblCPUImg, cpu);
        
        lblDraw.setVisible(false);
        lblPlayerWin.setVisible(false);
        lblCpuWin.setVisible(false);      
        
        switch(Player.verifyWinner(player1, cpu)){
            case PLAYER1_WIN:
                changeScore(lblPlayerScore);
                lblPlayerWin.setVisible(true);
                break;
            case PLAYER2_WIN:
                changeScore(lblCpuScore);
                lblCpuWin.setVisible(true);
                break;
            default:
                lblDraw.setVisible(true);
                break;
        } 
    }
 
    /**
     * Add +1 in JLabel representing the score of the player or CPU
     * @param label JLabel will change
     */
    public static void changeScore(JLabel label){
        int value = Integer.parseInt(label.getText());
        label.setText(++value + "");
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
