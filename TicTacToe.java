import java.util.Scanner;
public class TicTacToe{
	static void createBoard() {
		char[] board=new char[10];
		for(int i=1;i<board.length;i++) {
			board[i]=' ';
		}
		
	}
	static char userInput() {
		char computer ='O';
		System.out.println("Enter the inputs [X]/[O]");
		Scanner sc=new Scanner(System.in);
		char usrInput=sc.next().charAt(0);
		if(usrInput==computer) {
			computer='O';
			System.out.println("player choose:"+computer);
			}
		else if(usrInput != computer){
			computer='X';
			System.out.println("player choose:"+computer);
		}
		else {
			System.out.println("Enter valid input...");
		}
		return usrInput;
	
	}
	public static void main(String args[]) {
		System.out.println("Welcome to the TIC_TAC_TOE game");
		createBoard();
		userInput();
	}
}
