package Quests.Objectives;

/**
 * Created by Bruno on 22/03/2016.
 */
public class Kill implements QuestObjective{
    int amount;
    String raceType, type = "Kill";

    public Kill(int amount, String raceType) {
        this.amount = amount;
        this.raceType = raceType;
    }

    public String toString(){
        return "Kill("+amount+", "+"\"/"+raceType+"/\")";
    }

    public String getType() {
        return type;
    }


}
