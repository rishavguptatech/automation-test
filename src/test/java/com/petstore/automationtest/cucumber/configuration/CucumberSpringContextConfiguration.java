package com.petstore.automationtest.cucumber.configuration;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.petstore.automationtest.AutomationTestApplication;
import com.petstore.automationtest.core.context.ScenarioContext;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.spring.CucumberContextConfiguration;
import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationTestApplication.class , loader = SpringBootContextLoader.class)
@Log4j2
public class CucumberSpringContextConfiguration {

    @Autowired
    ScenarioContext scenarioContext;

    @BeforeAll
    public static void setUp(){
        log.info("##########################  Starting up WireMock Server ####################");

    }


}
