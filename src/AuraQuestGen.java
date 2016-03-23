import Quests.Objective;
import Quests.Objectives.Kill;
import Quests.Prerequisites.Prerequisite;
import Quests.Quest;
import Quests.Rewards.*;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Scanner;

/**
 * Created by Bruno on 22/03/2016.
 */
public class AuraQuestGen {
    public static void main(String[] args){
        test();
    }

    private static void fileCreate(Script script){
        script.outputFile();
    }

    private static String getCurrentPath(){
        //Magic a.k.a setup basic file path
        String decodedPath="",filePath = AuraQuestGen.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        try{
            decodedPath = URLDecoder.decode(filePath, "UTF-8");
        }catch (IOException e){
            e.printStackTrace();
        }
        return decodedPath+"Quest Scripts"+File.separator;
    }

    private static String scriptName(int id, String name){
        return id+"_"+name+".cs";
    }

    //Nothing to see here xD just a simple test for the writing system
    private static void test(){
        //Seeking info about the file
        int questID = 101;
        String questName = "testFile", path=getCurrentPath(), name=scriptName(questID,questName);
        Quest testQuest = new Quest(
                questID,
                questName,
                "TestFile",
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
        Script testScript = new Script(testQuest,path,name);
        testScript.outputFile();
    }
}
