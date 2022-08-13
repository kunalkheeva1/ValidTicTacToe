public class ValidTicTacToe {

    boolean checkValidity(String []grid, char ch){
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

    }



    public static void main(String[] args) {

    }
}
