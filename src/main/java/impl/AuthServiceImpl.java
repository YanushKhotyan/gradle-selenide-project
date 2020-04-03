package impl;

import io.restassured.http.ContentType;
import model.api.User;
import io.restassured.response.Response;
import service.AuthService;

import static io.restassured.RestAssured.given;

public class AuthServiceImpl implements AuthService {
    private  final String SERVICE = "auth/";

    @Override
    public User createUser(User user) {
        String url = URI + SERVICE + "create/";
        Response response = given()
                .contentType(ContentType.JSON)
                .body("user")
                .post(url);
        if (response.statusCode() == 200) {
            return response.as(User.class);
        }
        return null;
    }

    @Override
    public User login(User user) {
        return null;
    }
}
