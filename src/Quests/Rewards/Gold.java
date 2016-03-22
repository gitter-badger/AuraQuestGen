package Quests.Rewards;

/**
 * Created by Bruno on 22/03/2016.
 */
public class Gold implements Reward {
    private int gold;

    public Gold(int gold) {
        this.gold = gold;
    }

    public String toString(){
        return "\n\t\tAddReward(Gold("+gold+"));";
    }
}
