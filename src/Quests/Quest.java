package Quests;

import Quests.Prerequisites.Prerequisite;
import Quests.Rewards.Reward;

import java.util.ArrayList;

/**
 * Created by Bruno on 22/03/2016.
 */
public class Quest {
    protected int id;
    protected Reward[] rewards;
    protected String name, className, description;
    protected Objective[] objectives;
    protected Prerequisite[] prerequisites;

    public Quest(int id, String name, String className, String description, Objective[] objectives, Prerequisite[] prerequisites, Reward[] rewards) {
        this.id = id;
        this.rewards = rewards;
        this.name = name;
        this.className = className;
        this.description = description;
        this.objectives = objectives;
        this.prerequisites = prerequisites;
    }

    protected String openQuest(){
        //Implement something to deal with receive types, we don't always want the player to get the quest immediately
        //Also make it possible to not add a receive type, adding a QuestType instead >.> so much to do
        return "public class "+className+"QuestScript : QuestScript\t{" +
                "\n\tpublic override void Load()\t{" +
                "\n\t\tSetId("+id+");" +
                "\n\t\tSetName(\""+name+"\");" +
                "\n\t\tSetDescription("+description+");" +
                "\n" +
                "\n\t\tSetReceive(Receive.Automatically);";
    }

    protected String addObjectives(){
        String objectiveList = "\n\n\t\t//Objectives";
        if(objectives!=null){
            for (Objective objective :objectives){
                objectiveList+=objective.toString();
            }
        }
        return objectiveList;
    }

    protected String addPrerequisites(){
        String prerequisiteList = "\n\n\t\t//Prerequisites";
        if(prerequisites!=null){
            for (Prerequisite prerequisite :prerequisites){
                prerequisiteList+=prerequisite.toString();
            }
        }
        return prerequisiteList;
    }

    protected String addRewards(){
        String rewardList = "\n\n\t\t//Rewards";
        if(rewards!=null){
            for (Reward reward :rewards){
                rewardList+=reward.toString();
            }
        }
        return rewardList;
    }

    protected String closeQuest(){
        return "\n\t}\n}";
    }

    public String toString(){
        return openQuest()+addObjectives()+addPrerequisites()+addRewards()+closeQuest();
    }
}
