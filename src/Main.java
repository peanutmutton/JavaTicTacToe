import java.util.Scanner;
import java.util.Timer;

public class Main {


    public static void main(String[] args) {
        boolean game_over = false;

        TicTacToeGame myGame = new TicTacToeGame();

        Scanner myInput = new Scanner(System.in);




        while(!game_over){
            System.out.println("choose a cell");
            int xInput = myInput.nextInt();
            int yInput = myInput.nextInt();
            myGame.chooseCell(xInput,yInput);
            myGame.draw_grid();
            if(myGame.victory_check('x')) {
                System.out.println("Game over X won");
                break;
            }
            if(myGame.victory_check('o')) {
                System.out.println("Game over O won");
                break;
            }

        }


    }


}