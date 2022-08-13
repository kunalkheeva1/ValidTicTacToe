public class ValidTicTacToe {

    //check the all true sides of the given grid
    static boolean checkValidity(String []grid, char ch){
        if(grid[0].charAt(0)==ch && grid[0].charAt(1)==ch && grid[0].charAt(2)==ch){
            return true;
        }
        if(grid[1].charAt(0)==ch && grid[1].charAt(1)== ch && grid[1].charAt(2)==ch){
            return true;
        }
        if(grid[2].charAt(0)==ch && grid[2].charAt(1)== ch && grid[2].charAt(2)==ch){
            return true;
        }
        if(grid[0].charAt(0)==ch && grid[1].charAt(0)== ch && grid[2].charAt(0)==ch){
            return true;
        }

        if(grid[0].charAt(1)==ch && grid[1].charAt(1)== ch && grid[2].charAt(1)==ch){
            return true;
        }
        if(grid[0].charAt(2)==ch && grid[1].charAt(2)== ch && grid[2].charAt(2)==ch){
            return true;
        }
        if(grid[0].charAt(0)==ch && grid[1].charAt(1)== ch && grid[2].charAt(2)==ch){
            return true;
        }
        if(grid[0].charAt(2)==ch && grid[1].charAt(1)== ch && grid[2].charAt(0)==ch){
            return true;
        }

        return false;
    }
    public static boolean validTicTacToe(String [] board){

        // count the number of X and O in the grid
        int co =0;
        int cx= 0;

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[i].charAt(j)=='X'){
                    cx++;
                }
                if(board[i].charAt(j)=='O'){
                    co++;
                }
            }
        }
        // we are starting with X, so if co is more then its false
        // also we are moving one by one ,so if the difference between x and 0 is greater than 1,
        // then its false as well
        if(co>cx || cx-co>1){
            return false;
        }

        // get the winnings of both
        boolean winX = checkValidity(board, 'X');
        boolean winO = checkValidity(board, 'O');

        // if both are true(which cannot be possible as the game is stopping after one win, then return false

        if(winX== true && winO == true){
            return false;
        }
        // if x is true, but counts of both are also equal which means its not valid, return false
        if(winX == true && cx== co){
            return false;
        }
        // as if winO becomes true, then moves of x will not exceed O, as we start with x and then 0,
        // so if there is extra move after the winning of O then it means its not correct
        if(winO == true && cx>co){
            return false;
        }
        //else return true in all the cases
        return true;


    }



    public static void main(String[] args) {

    }
}
