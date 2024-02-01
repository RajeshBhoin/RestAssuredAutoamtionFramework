package UserDetails;

import JsonUtils.JsonUtils;
import RestUtils.Restutils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UserDetails extends UserApis{
    @Test
    public void createUser() throws IOException {
        Map<String, Object> payload = Payloads.getCreateUserPayloadFromMap("Raj","QA");
        Response response=createUserDetails(payload);
        Assert.assertEquals(response.statusCode(), 201);

    }
}
