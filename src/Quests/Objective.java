package Quests;

import Quests.Objectives.QuestObjective;

/**
 * Created by Bruno on 22/03/2016.
 */
public class Objective {
    protected String ident, description;
    protected int regionId, xPos, yPos;
    protected QuestObjective objective;

    public Objective(String ident, String description, int regionId, int xPos, int yPos, QuestObjective objective) {
        this.ident = ident;
        this.description = description;
        this.regionId = regionId;
        this.xPos = xPos;
        this.yPos = yPos;
        this.objective = objective;
    }

    public String toString(){
        return "\n\t\tAddObjective(" +
                "\""+ident+"\"," +
                " \""+description+"\"," +
                " \""+regionId+"\"," +
                " \""+xPos+"\"," +
                " \""+yPos+"\"," +
                objective.toString()+");";
    }
}
