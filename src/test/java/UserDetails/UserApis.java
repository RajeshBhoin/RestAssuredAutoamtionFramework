package UserDetails;

import RestUtils.Restutils;
import io.restassured.response.Response;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class UserApis {
    public static Response createUserDetails(Map<String, Object> createUserDetailsPayload) {
        String endPoint = Base.dataFromProp.getProperty("createUserEndpoint");
        return Restutils.performPost(endPoint, createUserDetailsPayload, new HashMap<>());
    }

    public static Response createUserDetailsFromJsonPayload(File createUserDetailsPayload) {
        String endPoint = Base.dataFromProp.getProperty("createUserEndpoint");
        return Restutils.performPost(endPoint, createUserDetailsPayload, new HashMap<>());
    }
}
