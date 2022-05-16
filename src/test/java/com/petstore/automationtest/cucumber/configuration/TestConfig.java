package com.petstore.automationtest.cucumber.configuration;


import com.petstore.automationtest.api.configuration.ApiConfiguration;
import com.petstore.automationtest.core.properties.ApiProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {ApiConfiguration.class})
@EnableConfigurationProperties({ApiProperties.class})
public class TestConfig {


}
