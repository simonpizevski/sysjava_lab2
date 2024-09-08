package Model;

import java.awt.*;

public abstract class Item {
    protected int x, y;
    protected String name;

    public Item(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
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

    public abstract void interact(Player player);
}
