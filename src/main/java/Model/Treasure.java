package Model;

public class Treasure extends Item {
    public Treasure(int x, int y, String name) {
        super(x,y, name);
    }

    @Override
    public void interact(Player player) {
        System.out.println(player.getName() + " , you found a treasure");
        //player.getInventory().add();
    }
}
