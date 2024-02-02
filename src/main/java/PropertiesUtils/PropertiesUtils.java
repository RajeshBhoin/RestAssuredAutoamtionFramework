package PropertiesUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {
    public static Properties readProperties(String propertiesFileName) throws IOException {
        Properties prop = new Properties();
        String completePropertiesFilePath = System.getProperty("user.dir") + "/src/test/resource" + propertiesFileName;
        prop.load(new FileReader(completePropertiesFilePath));
        return  prop;
    }
}
