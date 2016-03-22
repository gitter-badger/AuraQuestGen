package Quests.Rewards;

/**
 * Created by Bruno on 22/03/2016.
 */
public class QuestScroll implements Reward{
    private String type = "Quest Scroll";
    int questId;

    public QuestScroll(int questId) {
        this.questId = questId;
    }

    public String getType() {
        return type;
    }

    public String toString(){
        return "\n\t\tAddReward(QuestScroll("+questId+"));";
    }
}
