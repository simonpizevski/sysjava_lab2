package Model;

import Game.Maze;

public class Monster implements Movable {
    int x, y;
    int healthPoints;
    int strength;

    public Monster(int x, int y) {
        this.x = x;
        this.y = y;
        this.healthPoints = 50;
        this.strength = 10;
    }

    @Override
    public void move(String direction, Maze maze) {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getStrength() {
        return strength;
    }
}
