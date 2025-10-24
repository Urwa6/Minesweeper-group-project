package se.team.minesweeper;

public class Main {
  public static void main(String[] args){
       //Creating a new game : 8x8-board with 10 mines
        Game game = new Game(8, 8, 10);

        //Start the game
        game.start();
    
  }
}
