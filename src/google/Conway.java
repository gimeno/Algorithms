package google;


import java.util.Arrays;
import java.util.Hashtable;

/**
 * @author Roberto on 11/10/2018
 * Generate the next generation from a given grid of the Conway's Game of Life
 */
public class Conway {


    public static void main(String[] args) {
        String[][] board = new String[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = ".";
            }
        }
        Hashtable<String, Integer> hashtable = new Hashtable<>();


        board[1][3] = "*";
        board[1][4] = "*";
        board[2][2] = "*";
        board[2][3] = "*";
        board[3][5] = "*";
        board[4][4] = "*";

        System.out.println("Input");
        printBoard(board);
        System.out.println("Output");
        generateNextGeneration(board);
    }

    private static void generateNextGeneration(String[][] board) {
        int length = board.length;
        int liveNeighbours;
        String[][] nextGeneration = new String[length][length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                liveNeighbours = liveNeighbours(board, i, j, length);
                if (board[i][j].equals("*")) {
                    if (liveNeighbours < 2 || liveNeighbours > 3) {
                        nextGeneration[i][j] = ".";
                    } else {
                        nextGeneration[i][j] = "*";
                    }
                } else {
                    if (liveNeighbours == 3) {
                        nextGeneration[i][j] = "*";
                    } else {
                        nextGeneration[i][j] = ".";
                    }
                }
            }
        }

        printBoard(nextGeneration);
    }

    private static int liveNeighbours(String[][] board, int i, int j, int lenght) {
        int counter = 0;

        // Cell top left
        if (i != 0 && j != 0) {
            counter += isCellAlive(board[i - 1][j - 1]);
        }

        // Cell left
        if (j != 0) {
            counter += isCellAlive(board[i][j - 1]);
        }

        // Cell bottom left
        if (i != lenght - 1 && j != 0) {
            counter += isCellAlive(board[i + 1][j - 1]);
        }

        // Cell top
        if (i != 0) {
            counter += isCellAlive(board[i -1 ][j]);
        }

        // Cell bottom
        if (i != lenght - 1) {
            counter += isCellAlive(board[i + 1][j]);
        }

        // Cell top right
        if (i != 0 && j != lenght - 1) {
            counter += isCellAlive(board[i - 1][j + 1]);
        }

        // Cell right
        if (j != lenght - 1) {
            counter += isCellAlive(board[i][j + 1]);
        }

        // Cell bottom right
        if (i != lenght-1 && j != lenght-1) {
            counter += isCellAlive(board[i + 1][j + 1]);
        }

        return counter;
    }

    private static int isCellAlive(String value) {
        if (value.equals("*")) {
            return 1;
        }
        return 0;
    }


    private static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
