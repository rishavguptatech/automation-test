package com.petstore.automationtest.cucumber.steps;


import com.petstore.automationtest.api.model.petstore.response.GetPetByStatusResponseItem;
import com.petstore.automationtest.api.services.PetStoreService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URISyntaxException;

@Log4j2
public class PetStoreApiSteps {

    @Autowired
    private PetStoreService petStoreService;
    @Given("I run tests")
    public void runSampleStep(){
        log.info("This is a Sample Step");

    }

    @When("All the pets with {string} will be returned")
    public void getPetsByStatus(String status) throws URISyntaxException {
        GetPetByStatusResponseItem[] petByStatus = petStoreService.getPetByStatus(status);
        Assert.assertTrue(petByStatus.length > 0 );
    }

}
