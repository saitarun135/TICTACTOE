public class TicTacToe{
	static void createBoard() {
		char[] board=new char[10];
		for(int i=1;i<board.length;i++) {
			board[i]=' ';
		}
	}
	public static void main(String args[]) {
		System.out.println("Welcome to the TIC_TAC_TOE game");
		createBoard();
	}
}
