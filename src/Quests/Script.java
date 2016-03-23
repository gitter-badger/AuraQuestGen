package Quests;

import Quests.Quest;
import Utilities.UtilSOfTC;

import java.io.*;

/**
 * Created by Bruno on 23/03/2016.
 */
public class Script {
    public Quest quest;
    public int id;
    public String path, scriptName;

    public Script(){
        this.quest=new Quest();
        this.path= UtilSOfTC.getCurrentPath();
        this.id=0;
        this.scriptName="";
    }

    public Script(Quest quest, String scriptName, int id) {
        this.quest = quest;
        this.path = UtilSOfTC.getCurrentPath();
        this.scriptName = scriptName;
    }

    private void createScript(){
        //Create file
        File questFile = new File(path+UtilSOfTC.scriptName(id,scriptName));
        questFile.getParentFile().mkdirs();
        try {
            questFile.createNewFile();
            System.out.println("File created in: "+path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeScript(){
        //Write file
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path+scriptName), "utf-8"))){
            writer.write(quest.toString());
            writer.close();
            System.out.println("Quests.Script written to: "+path+scriptName);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void outputFile(){
        createScript();
        writeScript();
    }
}
