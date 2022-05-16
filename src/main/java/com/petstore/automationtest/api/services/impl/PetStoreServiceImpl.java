package com.petstore.automationtest.api.services.impl;


import com.google.gson.Gson;
import com.petstore.automationtest.api.model.petstore.response.GetPetByStatusResponse;
import com.petstore.automationtest.api.model.petstore.response.GetPetByStatusResponseItem;
import com.petstore.automationtest.api.services.PetStoreService;
import com.petstore.automationtest.core.properties.ApiProperties;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Stream;

import static io.restassured.RestAssured.*;
import static com.petstore.automationtest.api.util.ApiSpecUtils.buildRequest;
import static com.petstore.automationtest.api.util.ApiSpecUtils.performGet;


@Service
@Log4j2
public class PetStoreServiceImpl implements PetStoreService {

    @Autowired
    ApiProperties apiProperties;

    @Override
    public GetPetByStatusResponseItem[] getPetByStatus(String status) throws URISyntaxException {

        RequestSpecification requestSpecification = buildRequest(apiProperties.getBaseUrl());

        Response response = performGet(requestSpecification ,apiProperties.getFindByStatusURL()+ "?status=" + status );


        response.then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);

        GetPetByStatusResponseItem[] getPetByStatusResponseItems = new Gson().fromJson(response.asString() , GetPetByStatusResponseItem[].class );

     //   Stream.of(getPetByStatusResponseItems).filter( item -> item.getName().equals("doggy"))
        return getPetByStatusResponseItems;

    }
}
