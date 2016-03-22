package Quests.Rewards;

/**
 * Created by Bruno on 22/03/2016.
 */
public class Enchant implements Reward{
    int id;

    public Enchant(int id) {
        this.id = id;
    }

    public String toString(){
        return "\n\t\tAddReward(Enchant("+id+"));";
    }
}
