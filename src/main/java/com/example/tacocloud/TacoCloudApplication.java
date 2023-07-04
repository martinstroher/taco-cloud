package com.example.tacocloud;

import com.example.tacocloud.converter.IngredientByIdConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TacoCloudApplication {

    public static void main(String[] args) {
        var app = SpringApplication.run(TacoCloudApplication.class, args);
    }

}
