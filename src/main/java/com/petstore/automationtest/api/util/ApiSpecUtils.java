package com.petstore.automationtest.api.util;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.net.URI;
import java.net.URISyntaxException;

import static io.restassured.RestAssured.given;

public class ApiSpecUtils {

    public static RequestSpecification buildRequest(String baseUrl) throws URISyntaxException {

        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri(new URI(baseUrl))
                .build()
                .log()
                .all();
        return requestSpecification;
    }

    public static Response performGet(RequestSpecification requestSpecification , String url){

        Response response = given(requestSpecification).
                when().
                get(url);
        return response;
    }
}
