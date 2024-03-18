package com.proyecto.grupo10.application.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {

        Contact contact = new Contact();
        contact.setName("Grupo 10");
        contact.setEmail("grupo10@gmail.com");

        Info information = new Info().title("Grupo 10 API Students and Courses")
                .version("1.0")
                .description("This our API to present to teacher Paul Nike")
                .contact(contact);


        return new OpenAPI()
                .info(information);
    }
}
