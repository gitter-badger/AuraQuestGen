package Utilities;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;

/**
 * Created by Bruno on 23/03/2016.
 */
public class UtilSOfTC {
    public static boolean isInteger( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }

    public static String scriptName(int id, String name){
        return id+"_"+name+".cs";
    }

    public static String getCurrentPath(){
        //Magic a.k.a setup basic file path
        String decodedPath="",filePath = UtilSOfTC.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        try{
            decodedPath = URLDecoder.decode(filePath, "UTF-8");
        }catch (IOException e){
            e.printStackTrace();
        }
        return decodedPath+"Quest Scripts"+ File.separator;
    }
}
