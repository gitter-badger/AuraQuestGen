package Quests.Rewards;

/**
 * Created by Bruno on 22/03/2016.
 */
public class Item implements Reward{
    private String type = "Item";
    private int id, amount;

    public Item(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public String toString(){
        return "\n\t\tAddReward(Item("+id+", "+amount+"));";
    }
}
