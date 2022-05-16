package com.petstore.automationtest.api.services;

import com.petstore.automationtest.api.model.petstore.response.GetPetByStatusResponse;
import com.petstore.automationtest.api.model.petstore.response.GetPetByStatusResponseItem;

import java.net.URISyntaxException;

public interface PetStoreService {

    public GetPetByStatusResponseItem[] getPetByStatus(String status) throws URISyntaxException;

}
