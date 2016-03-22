package Quests.Rewards;

/**
 * Created by Bruno on 22/03/2016.
 */
public class AP implements Reward{
    private String type = "Ability Points";
    int amount;

    public AP(int amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public String toString(){
        return "\n\t\tAddReward(AP("+amount+"));";
    }
}
