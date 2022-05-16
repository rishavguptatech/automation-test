package com.petstore.automationtest.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.NotNull;

@Data
@Validated
@ConfigurationProperties("config.petstore")
public class ApiProperties {

   @NotNull(message = "baseUrl cannot be null")
   private String baseUrl;

   private String findByStatusURL;

}
