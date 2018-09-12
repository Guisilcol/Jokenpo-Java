package model;

/**
 * @author guilherme
 */
public class Player {

    public enum Result {
        PLAYER1_WIN,
        PLAYER2_WIN,
        DRAW
    }
    
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSOR = 3;
    
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
    
    public boolean defeated(Player opponent){
        int choose = opponent.getChoose();
        return ((this.choose == Player.PAPER   && choose == Player.ROCK)    ||
                (this.choose == Player.ROCK    && choose == Player.SCISSOR) ||
                (this.choose == Player.SCISSOR && choose == Player.PAPER));
    }
    /**
     * Check the winning player
     * @param player1 A player1 object
     * @param player2 A player2 object
     * @return 1 if Plater1 wins, 2 if Player2 wins and 0 if draw
     */
    public static Result verifyWinner(Player player1, Player player2){     
        if (player1.defeated(player2))
            return Result.PLAYER1_WIN;
        
        if (player2.defeated(player1))
            return Result.PLAYER2_WIN;
        
        return Result.DRAW;
    }
}
