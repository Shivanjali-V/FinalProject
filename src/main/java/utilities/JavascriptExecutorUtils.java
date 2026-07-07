package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavascriptExecutorUtils {

    private static final Properties prop;

    static {
        prop = new Properties();
        try{
            String filePath = "src/main/resources/propertyFiles/script.properties";
            FileInputStream file = new FileInputStream(filePath);
            prop.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getClickScript(){
        return prop.getProperty("click");
    }

    public static String getScrollIntoCenterScript(){
        return prop.getProperty("scrollIntoCenterScript");
    }

    public static String getScrollIntoViewTrue(){
        return prop.getProperty("scrollIntoViewTrue");
    }

    public static String getScrollBy(int x, int y){
        String script = prop.getProperty("scrollBy");
        return script+"("+x+", "+y+");";
    }

    public static String getScrollToBottom(){
        return prop.getProperty("scrollToBottom");
    }
}
