package Quests.Rewards;

/**
 * Created by Bruno on 22/03/2016.
 */
public class ExplExp implements Reward{
    private String type = "Exploration Experience";
    private int exp;

    public ExplExp(int exp) {
        this.exp = exp;
    }

    public String getType() {
        return type;
    }

    public String toString(){
        return "\n\t\tAddReward(ExplExp("+exp+"));";
    }
}
