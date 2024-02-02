package UserDetails;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class UserDetailsTest extends UserApis{
    @Test
    public void createUser() throws IOException {
        File payload = Payloads.getCreateUserPayloadFromJsonFile("UserDetailsPayload.json");
        Response response=createUserDetailsFromJsonPayload(payload);
        Assert.assertEquals(response.statusCode(), 201);

    }
}
