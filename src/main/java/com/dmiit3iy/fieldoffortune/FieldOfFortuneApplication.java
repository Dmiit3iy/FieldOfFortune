package com.dmiit3iy.fieldoffortune;

import com.dmiit3iy.fieldoffortune.model.Riddle;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class FieldOfFortuneApplication {

    public static void main(String[] args) {

        SpringApplication.run(FieldOfFortuneApplication.class, args);

    }

}
