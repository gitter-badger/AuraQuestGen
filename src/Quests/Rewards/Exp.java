package Quests.Rewards;

/**
 * Created by Bruno on 22/03/2016.
 */
public class Exp implements Reward{
    private int exp;

    public Exp(int exp) {
        this.exp = exp;
    }

    public String toString(){
        return "\n\t\tAddReward(Exp("+exp+"));";
    }
}
