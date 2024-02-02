package UserDetails;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Payloads {
public static String getCreateUserPayloadFromString(String name,String job) {
   String payload ="{\n" +
            "    \"name\": \""+name+"\",\n" +
            "    \"job\": \""+job+"\"\n" +
            "}";
   return payload;
   }
   public static Map<String, Object> getCreateUserPayloadFromMap(String name, String job) {
      Map<String,Object> payload = new HashMap<>();
         payload.put("name",name);
         payload.put("job",job);
         return payload;
}

   public static File getCreateUserPayloadFromJsonFile(String jsonFileName) {
      String Env = System.getProperty("env")==null ? "QA":System.getProperty("env");
      File payload = new File(System.getProperty("user.dir") + "/src/test/resource/userDetails/"+Env+"/JsonPayload/" + jsonFileName);
      return payload;
   }

}
