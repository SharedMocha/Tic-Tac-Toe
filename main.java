import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Scanner to read inputs from users
        Scanner scan = new Scanner(System.in);
        
        //Object game to run methods on the board like print,move,check for winner 
        TicTacToe game = new TicTacToe();
        
        //initlaize the board with default values '-'.Since there are 2 players we use 'x' for player1 and 'o' for player 2 
        game.initializeBoard();
        System.out.println("<-- Tic-Tac-Toe Game  -- > ");
        //We use  do while loop to go through turns from both players. The loop will break out when the game is over. 
        do
        {
            System.out.println(" Current board layout is --->");
            game.printBoard();
            int row;
            int col;
            do
            {
                System.out.println("Player " + game.getCurrentPlayerMark() + ", enter an empty row and column to place your mark!");
                row = scan.nextInt()-1;
                col = scan.nextInt()-1;
            }
            while (!game.placeAMarkOnBoard(row, col));
            game.changePlayerModeMode();
        }
        //While loop to check of there is a winnder
        while(!game.checkForWin() && !game.isBoardFull());
        if (game.isBoardFull() && !game.checkForWin())
        {
            System.out.println("The game was a tie!");
        }
        else
        {
            System.out.println("Current board layout:");
            game.printBoard();
            game.changePlayerModeMode();
            System.out.println(Character.toUpperCase(game.getCurrentPlayerMark()) + " Wins!");
        }
    }
}
//Class to handle core componenets of the game like initialize,put a mark,make a move,find a winner
class TicTacToe {

    //3*3 Array for board
	private char[][] board;
	//Get current player mark -x or o
    private char currentPlayerMark;

	//Default Constructor to initialize 3*3 Matrix and set current player mark as 'X' 
    //Calling 	initializeBoard to reset the board
    public TicTacToe() {
        board = new char[3][3];
        currentPlayerMark = 'x';
        initializeBoard();
    }

    //Gives us access to currentPlayerMark
    public char getCurrentPlayerMark()
    {
        return currentPlayerMark;
    }


    // Set or Reset the board
    public void initializeBoard() {

        // Loop through rows
        for (int i = 0; i < 3; i++) {

            // Loop through columns
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }


    // Print the current board
    public void printBoard() {
        System.out.println("-------------");

        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }


    // Loop through all cells of the board and check if its full or empty.
    public boolean isBoardFull() {
        boolean isFull = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    isFull = false;
                }
            }
        }

        return isFull;
    }


    // Check if there is a win.This calls our other win check functions to check the entire board.
	//Here we check rows /columns / diagonals -All possible ways
    public boolean checkForWin() {
        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }


    // Check all rows for winner
    private boolean checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
            }
        }
        return false;
    }


    // Check columns for winner
    private boolean checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
                return true;
            }
        }
        return false;
    }


    // Check both diagonals for winnder
    private boolean checkDiagonalsForWin() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
    }


    // Check to see if all three values are the same (and not empty) indicating a win.
    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }


    // Change where player is .
    public void changePlayerModeMode() {
        if (currentPlayerMark == 'x') {
            currentPlayerMark = 'o';
        }
        else {
            currentPlayerMark = 'x';
        }
    }

    // Places a mark on the baord wither o or x.
    public boolean placeAMarkOnBoard(int row, int col) {

        // Make sure that row and column are in bounds of the board.
        if ((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col < 3)) {
                if (board[row][col] == '-') {
                    board[row][col] = currentPlayerMark;
                    return true;
                }
            }
        }

        return false;
    }
}
