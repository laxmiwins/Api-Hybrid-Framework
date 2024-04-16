package api.endpoints;

import static io.restassured.RestAssured.given;

import api.payload.user;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class userEndPoints {

	
public static Response createUser(user payload)
	{
		Response response = given()
		.accept(ContentType.JSON)
		.contentType(ContentType.JSON)
		.body(payload)
		
		
		.when()
		.post(Routers.post_url);
		
		return response;
	}
	
	
	public static Response GetUser(String userName)
	{
		Response response = given()
		.accept(ContentType.JSON)
		.pathParam("username", userName)
		
		.when()
		.get(Routers.get_url);
		
		return response;
	}
	
	
	public static Response UpdateUser(String userName, user payload)
	{
		Response response = given()
		.accept(ContentType.JSON)
		.contentType(ContentType.JSON)
		.pathParam("username", userName)
		.body(payload)
		
		
		.when()
		.put(Routers.put_url);
		
		return response;
	}
	
	
	public static Response DeleteUser(String userName)
	{
		Response response = given()
		.accept(ContentType.JSON)
		.pathParam("username", userName)
			
		
		.when()
		.delete(Routers.del_url);
		
		return response;
	}
	
}


