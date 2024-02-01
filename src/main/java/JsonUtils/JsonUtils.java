package JsonUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class JsonUtils {
    private static  ObjectMapper mapper = new ObjectMapper();

    public static Map<String, Object> getJsonDataAsMap(String jsonFileName) throws IOException {
        String completeJsonPath = System.getProperty("user.dir") + "/src/test/resource" + jsonFileName;
        Map<String, Object> data=mapper.readValue(new File(completeJsonPath), new TypeReference<Map<String, Object>>() {});
        return  data;
    }
}
