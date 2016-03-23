package Core;

import Interface.GUI;
import Quests.Objective;
import Quests.Objectives.Kill;
import Quests.Prerequisites.Prerequisite;
import Quests.Quest;
import Quests.Rewards.*;
import Quests.Script;
import Utilities.UtilSOfTC;


/**
 * Created by Bruno on 22/03/2016.
 */
public class AuraQuestGen {
    public static Script script;
    public static void main(String[] args){
        GUI.createGUI();
    }

    private static void fileCreate(Script script){
        script.outputFile();
    }

    //Nothing to see here xD just a simple test for the writing system
    private static void test(){
        //Seeking info about the file
        int questID = 101;
        String questName = "testFile", path= UtilSOfTC.getCurrentPath();
        Quest testQuest = new Quest(
                questID,
                questName,
                "This is just a dummy quest used as a test for a Quest Generator",
                new Objective[]{
                        new Objective(
                                "kill_testRace",
                                "Kill 5 testRace monsters",
                                0,
                                0,
                                0,
                                new Kill(5,"testRace")
                        )
                },
                new Prerequisite[]{},
                new Reward[]{
                        new Gold(777),
                        new Exp(666),
                        new AP(69),
                        new Item(10101,1),
                        new ExplExp(666),
                        new Enchant(10101)
                }
        );
        Script testScript = new Script(testQuest, questName, questID);
        testScript.outputFile();
    }
}
