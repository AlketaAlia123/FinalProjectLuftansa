package utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.File;
public class ConfigurationReader {
    private static final Properties properties = new Properties();
    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties.properties");
            properties.load(file);
            file.close();
        } catch (IOException e){
            System.out.println("File not found in the ConfigurationReader class");
            e.printStackTrace();
        }
    }
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}