package UserDetails;

import JsonUtils.JsonUtils;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;

public class Base {
    public static Map<String, Object> dataFromJsonFile;
   static {
       String Env = System.getProperty("env")==null ? "QA":System.getProperty("env");
       try {
           dataFromJsonFile = JsonUtils.getJsonDataAsMap("/userDetails/"+Env+"/userDetail.json");
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
}
