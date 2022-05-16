package com.petstore.automationtest.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue ={
                "com.petstore.automationtest.cucumber.steps",
                "com.petstore.automationtest.cucumber.configuration"

        },
        plugin = {
                "pretty",
                "html:target/cucumber",
                "json:target/cucumber.json"},
        tags = "@Run"

)
public class RunCucumberTests {
}
