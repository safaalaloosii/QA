package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties p1 = new Properties();

    static{

        try {

            FileInputStream f1 = new FileInputStream("Configuration.properties");
            p1.load(f1);
            f1.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getProperties(String keyWord){

        return p1.getProperty(keyWord);



    }
}
