import com.google.gson.JsonObject;
import jdk.internal.joptsimple.OptionSet;

import java.io.File;

public class GetChurnRates {
    public static void main(String[] args) {
        new GetChurnRates().getRates(args[0]);
    }
    
    public void getRates(String cachePath) {
        for (File file : (File[])readObjectFromFile(cachePath)) {
            String url = getSVNUrl(file);
            if (url != null && !url.isEmpty())
                System.out.println(getChurnRateForProject(url));
        }
    }

    private Object readObjectFromFile(String cachePath) {
        return null;
    }

    private <SVNURL> double getChurnRateForProject(String url) {
        double rate = 0;
        SVNURL svnUrl;
        // Connect to SVN and compute churn rate 
        
        return rate; 
    }
    
    private String getSVNUrl(File file) {
        String jsonTxt = "";
        // Read the file contents into jsonTxt
        JsonObject json = null, jsonObject = null; 
        // Parse the text, get the project data 

        OptionSet jsonProj = null;
        if (!jsonProj.has("Programming-Language")) return "";
        if (!jsonProj.has("SVNRepository")) return "";
        boolean hasJava = false;
        // Is the project a java project.
        
        if (!hasJava) return "";
        JsonObject svnRep = jsonProj("SVNRepository");
        if (!svnRep.has("location")) return "";
        return svnRep("location");
    }

    private String svnRep(String location) {
        return location;
    }

    private JsonObject jsonProj(String svnRepository) {
        return null;
    }
}
