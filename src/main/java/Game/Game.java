package Game;

import Model.Monster;
import Model.Player;
import Model.Treasure;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Maze maze = new Maze();
        Player player = new Player("Champion", 1,1);
        Monster monster = new Monster(2,5 );
        Treasure treasure = new Treasure(7,5, "T");

        int treasureX = treasure.getX();
        int treasureY = treasure.getY();
        int monsterX = monster.getX();
        int monsterY = monster.getY();

        boolean playing = true;
        while (playing) {
            maze.printMaze();
            System.out.println("Up(W), Down(S), Left(A) or Right(D) ?");
            String direction = scanner.nextLine();
            player.move(direction, maze);

            int playerX = player.getX();
            int playerY = player.getY();
            char position = maze.getPosition(playerX, playerY);


            System.out.println("Player position: (" + playerX + ", " + playerY + ")");
            System.out.println("Position at player: " + position);

            if (playerX == treasureX && playerY == treasureY) {
                System.out.println("You win!");
                playing = false;
            } else if (playerX == monsterX && playerY == monsterY)  {
                playing = false;
                System.out.println("You lose!");
            }

        }
        scanner.close();
    }
}
