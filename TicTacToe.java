import java.util.*;
public class TicTacToe {
    public static int index;
    public static char[] board;
    public static Scanner sc = new Scanner(System.in);


    public static char[] createBorad() {
        char[] board = new char[10];
        for (index = 1; index < board.length; index++) {
            board[index] = ' ';
        }
        return board;
    }

 
    public static char userInput() {
        System.out.println("Enter the input X/O.");
        char userInput = sc.next().toUpperCase().charAt(0);
        int computer = (userInput == 'X') ? 'O' : 'X';
        return userInput;
    }

  
    public static char[] displayBoard() {
            index = 1;
            System.out.println(" | " + board[index] + " | " + board[index + 1] + " | " + board[index + 2] + " | ");
            System.out.println(" | " + board[index + 3] + " | " + board[index + 4] + " | " + board[index + 5] + " | ");
            System.out.println(" | " + board[index + 6] + " | " + board[index + 7] + " | " + board[index + 8] + " | ");
        return board;
    }

   
    private static int makeMove(char [] board) {
        Integer[] validCells = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        while (true) {
            System.out.println("What is the next move? (1-9): ");
            int userIndex = sc.nextInt();
            if (Arrays.asList(validCells).contains(userIndex) && isSpaceFree(board, userIndex)){
                board[userIndex] = userInput();
                displayBoard();
                takeToss();
            }
                return userIndex;
        }
    }


    private static boolean isSpaceFree(char[] board, int index){
            return board[index] == ' ';
        }

    private static boolean takeToss() {
        System.out.println("Enter the number\n1 for Head\n2 for Tail");
        int choice = sc.nextInt();
        int random = (int) Math.floor(Math.random() * 2 );
        boolean won = (random == choice) ? true : false;
        return won;
    }

   
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game.");
        board = createBorad();
        displayBoard();
        boolean wonOrLoss = takeToss();
        int userMove = makeMove(board);


    }
}
