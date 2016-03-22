import Quests.Objectives.Kill;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Scanner;

/**
 * Created by Bruno on 22/03/2016.
 */
public class AuraQuestGen {
    public static void main(String[] args){
        fileCreate();
    }

    private static void fileCreate(){
        //Vars
        Scanner infSeeker = new Scanner(System.in);
        int questID;
        String  questName, filePath = AuraQuestGen.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        String decodedPath="";

        //Magic a.k.a setup basic file path
        try{
            decodedPath = URLDecoder.decode(filePath, "UTF-8");
            decodedPath.substring(0, decodedPath.lastIndexOf(File.separator) + 1);
        }catch (IOException e){
            e.printStackTrace();
            //System.exit(-1);
        }

        //Seeking info about the file
        System.out.println("Quest ID: ");
        questID = infSeeker.nextInt();
        infSeeker.nextLine();
        System.out.println("Quest name: ");
        questName = infSeeker.nextLine();

        //Setting final file path
        decodedPath+=questID+"_"+questName+".cs";

        //Create file
        File questFile = new File(decodedPath);
        questFile.getParentFile().mkdirs();
        try {
            questFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            //System.exit(-1);
        }
        System.out.println("File created in: "+decodedPath);
    }
}
