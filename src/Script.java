import Quests.Quest;

import java.io.*;

/**
 * Created by Bruno on 23/03/2016.
 */
public class Script {
    private Quest quest;
    private String path, scriptName;

    public Script(Quest quest, String path, String scriptName) {
        this.quest = quest;
        this.path = path;
        this.scriptName = scriptName;
    }

    private void createScript(){
        //Create file
        File questFile = new File(path+scriptName);
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
            System.out.println("Script written to: "+path+scriptName);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void outputFile(){
        createScript();
        writeScript();
    }
}
