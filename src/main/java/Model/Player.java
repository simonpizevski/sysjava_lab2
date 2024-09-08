package Model;

import Game.Maze;

import java.util.ArrayList;
import java.util.List;

public class Player implements Movable {
    private String name;
    private int x, y;
    private int healthPoints;
    private int strength;
    private List<Item> inventory;

    public Player(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.healthPoints = 100;
        this.strength = 10;
        this.inventory = new ArrayList<>();
    }

    @Override
    public void move(String direction, Maze maze) {
        int oldX = x;
        int oldY = y;

        switch (direction.toLowerCase()) {
            case "w":
                if (maze.movePossible(x-1, y)) {
                    x--;
                }
                break;
            case "s":
                if (maze.movePossible(x + 1, y)) {
                    x++;
                }
                break;
            case "a":
                if (maze.movePossible(x, y-1)) {
                    y--;
                }
                break;
            case "d":
                if (maze.movePossible(x, y+1)) {
                    y++;
                }
                break;

            default:
                System.out.println("Use W, S, A or D");
        }
        maze.updatePlayerPosition(oldX, oldY, x, y);
    }

    public void addItem(Item item) {
        inventory.add(item);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }
}
