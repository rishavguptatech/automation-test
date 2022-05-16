package com.petstore.automationtest.api.configuration;


import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.petstore.automationtest.core.context.ScenarioContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


import static com.github.tomakehurst.wiremock.client.WireMock.ok;

@Configuration
@Profile("wiremock")
public class ApiConfiguration {


    @Autowired
    ScenarioContext scenarioContext;

    @Bean
    public WireMockServer createWireMockServer(){
        WireMockServer wireMockServer = new WireMockServer(8089);
        scenarioContext.saveData("wireMockServer" , wireMockServer);
        wireMockServer.start();

        wireMockServer.stubFor(WireMock.get(WireMock.urlPathMatching("/v2/pet/findByStatus"))
                .willReturn(ok()
                        .withHeader("Content-Type" , "application/json")
                .withBodyFile("pets.json")));

        return wireMockServer;
    }


}
