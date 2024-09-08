package Game;

import Model.Player;

import java.util.Arrays;

public class Maze {
    private char[][] mazeBoard;

    public Maze() {
        mazeBoard = new char[][]{
                {'#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', 'P', ' ', ' ', ' ', ' ', ' ', '#'},
                {'#', '#', '#', '#', '#', 'M', ' ', '#'},
                {'#', ' ', ' ', '#', '#', ' ', ' ', '#'},
                {'#', ' ', ' ', ' ', ' ', ' ', '#', '#'},
                {'#', ' ', '#', '#', '#', '#', '#', '#'},
                {'#', ' ', ' ', ' ', ' ', '#', '#', '#'},
                {'#', '#', '#', '#', 'T', '#', '#', '#'},

        };

    }

    public boolean movePossible(int row, int col) {
        return mazeBoard[row][col] == ' ' || mazeBoard[row][col] == 'T' || mazeBoard[row][col] == 'M';
    }

    public void updatePlayerPosition(int oldX, int oldY, int newX, int newY) {

        if (mazeBoard[newX][newY] != 'T' || mazeBoard[oldX][oldY] != 'M') {
            mazeBoard[oldX][oldY] = ' ';
        }
        mazeBoard[newX][newY] = 'P';
    }

    public void printMaze() {
        for (int i = 0; i < mazeBoard.length; i++) {
            for (int j = 0; j < mazeBoard[i].length; j++) {
                System.out.print(mazeBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public char getPosition(int row, int col) {
        return (mazeBoard[row][col]);
    }
}
