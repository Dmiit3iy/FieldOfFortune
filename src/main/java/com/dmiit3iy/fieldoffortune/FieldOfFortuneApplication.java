package com.dmiit3iy.fieldoffortune;

import com.dmiit3iy.fieldoffortune.model.Riddle;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class FieldOfFortuneApplication {

    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.configure(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, true);

        try {
            List<Riddle> list = objectMapper.readValue(new File("riddles.json"),
                    new TypeReference<List<Riddle>>(){});
            System.out.println(list);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
