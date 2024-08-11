public class TicTacToeGame {
    char current_player = 'x';
    char[][] grid = {{'-','-','-'},
            {'-','-','-'},
            {'-','-','-'}
    };

    public void draw_grid(){
        for (int i = 0; i<3;++i){
            for (int j = 0; j<3;++j) System.out.print(grid[i][j]);
            System.out.println();
        }

    }
    public void chooseCell(int x, int y){
        if (current_player == 'x' && grid[x][y]=='-'){
            grid[x][y]='x';
            current_player = 'o';
        } else if (current_player =='o' && grid[x][y]=='-') {
            grid[x][y]='o';
            current_player = 'x';
        }

    }
    public boolean victory_check(char player_symbol){
        if (grid[0][0]==player_symbol) {
            if (grid[0][1]==player_symbol){
                if (grid[0][2]==player_symbol) return true; //top row
            } else if (grid[1][1]==player_symbol) {
                if (grid[2][2]==player_symbol) return true; //top left to bottom right dia
            } else if (grid[1][0]==player_symbol) {
                if (grid[2][0]==player_symbol) return true; //left column
            }
        } else if (grid[0][1]==player_symbol) {
            if (grid[1][1]==player_symbol){
                if (grid[2][1]==player_symbol) return true; //middle column
            }
        } else if (grid[0][2]==player_symbol) {
            if (grid[1][2]==player_symbol){
                if (grid[2][2]==player_symbol) return true; //right column
            } else if (grid[1][1]==player_symbol) {
                if (grid[2][0]==player_symbol) return true; //bottom left to top right dia
            }
        } else if (grid[1][0]==player_symbol) {
            if (grid[1][1]==player_symbol){
                if (grid[1][2]==player_symbol) return true; //middle row
            }
        } else if (grid[2][0]==player_symbol) {
            if (grid[2][1]==player_symbol){
                if (grid[2][2]==player_symbol) return true; //bottom row
            }
        }
        return false;
    }
}
