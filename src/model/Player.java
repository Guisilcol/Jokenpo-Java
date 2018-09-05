package model;

/**
 *
 * @author guilherme
 */
public class Player {

    public static int ROCK = 1;
    public static int PAPER = 2;
    public static int SCISSOR = 3;
    private int choose;
    
    /**
     * Instance the class with the player's choice
     * @param choose Integer value representing the player's choice
     */
    public Player(int choose){
        this.choose = choose;
    }
    
    /**
     * Getter of player choose
     * @return a integer representing player choose
     */
    public int getChoose(){
        return this.choose;
    }
    
    /**
     * Check the winning player
     * @param player1 A player1 object
     * @param player2 A player2 object
     * @return 1 if Plater1 wins, 2 if Player2 wins and 0 if draw
     */
    public static int verifyWinner(Player player1, Player player2){
        
        int choose1 = player1.getChoose();
        int choose2 = player2.getChoose();
        
        if(choose1 == Player.PAPER && choose2 == Player.ROCK){
            
            return 1;
        }else if(choose1 == Player.ROCK && choose2 == Player.PAPER){
            
            return 2;
        }else if(choose1 == Player.ROCK && choose2 == Player.SCISSOR){
            
            return 1;
        }else if(choose1 == Player.SCISSOR && choose2 == Player.ROCK){
            
            return 2;
        }else if(choose1 == Player.SCISSOR && choose2 == Player.PAPER){
            
            return 1;
        }else if(choose1 == Player.PAPER && choose2 == Player.SCISSOR){
            
            return 2;
        }else{
            
            return 0;
        }

    }

}
