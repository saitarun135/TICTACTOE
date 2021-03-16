import java.util.*;
public class TicTacToe {

    public static int i;
    public static char [] board;
    	public static char[] createBoard() {
    		char [] board = new char[10];
    		for (i = 1; i < board.length; i++) {
    			board[i] = ' ';
    		}
    			return board;
    		}

    public static char userSymbol() {
        char computer = 'O';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input X/O.");
        char userInput = sc.next().charAt(0);
        if (userInput == computer) {
            computer = 'X';
            System.out.println("player choose:"+computer);
        	}
        else if (userInput != computer)
        {
            computer = 'O';
            System.out.println("player choose:"+computer);
        }
        else
        {
            System.out.println("Invalid input.");
        }
        return userInput;
    }

  
    public static char[] displayBoard() 
    {
        int initialize = 1;
        for (i = initialize; i <= board.length - initialize; i++) {
            System.out.println(board[i] + " | " + board[i + 1] + " | " + board[i + 2]);
            initialize = initialize + 3;
        }
        return board;
    }
        public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game.");
       
         board = createBoard();
         char input = userSymbol();
        displayBoard();
    }
}
