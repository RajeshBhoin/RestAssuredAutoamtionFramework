package UserDetails;

import RestUtils.Restutils;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class UserApis {
    public static Response createUserDetails(Map<String, Object> createUserDetailsPayload) {
        String endPoint = (String) Base.dataFromJsonFile.get("createUserEndpoint");
        return Restutils.performPost(endPoint, createUserDetailsPayload, new HashMap<>());
    }
}
