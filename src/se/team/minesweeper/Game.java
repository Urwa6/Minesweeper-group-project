package se.team.minesweeper;

public class Game {   
  //The game board
    private final Board board;
    //Player
    private final Player player;
    //True if game ends
    private boolean gameOver;

    //Creates a new game with the specified dimensions & number of mines
    public Game(int rows, int cols, int mines) {
        board = new Board(rows, cols, mines);
        player = new Player();
        gameOver = false;
    }
}
