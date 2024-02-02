package UserDetails;

import JsonUtils.JsonUtils;
import PropertiesUtils.PropertiesUtils;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public class Base {
    public static Map<String, Object> dataFromJsonFile;
    public static Properties dataFromProp;
   static {
       String Env = System.getProperty("env")==null ? "QA":System.getProperty("env");
       try {
           dataFromJsonFile = JsonUtils.getJsonDataAsMap("/userDetails/"+Env+"/userDetail.json");
       } catch (IOException e) {
           e.printStackTrace();
       }
       try {
           dataFromProp = PropertiesUtils.readProperties("/userDetails/"+Env+"/userDetails.properties");
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
}
