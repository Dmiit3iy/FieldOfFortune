package com.dmiit3iy.fieldoffortune.repository;

import com.dmiit3iy.fieldoffortune.model.Riddle;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RiddleRepository {
    private ArrayList<Riddle> riddleArrayList = new ArrayList<>();

    public ArrayList<Riddle> getRiddleArrayList() {
        return riddleArrayList;
    }

    public RiddleRepository(String name) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        riddleArrayList = objectMapper.readValue(new File(name),
                new TypeReference<ArrayList<Riddle>>() {});
    }
}
