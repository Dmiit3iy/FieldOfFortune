package com.dmiit3iy.fieldoffortune.util;

import com.dmiit3iy.fieldoffortune.model.Riddle;
import com.dmiit3iy.fieldoffortune.repository.RiddleRepository;

import java.io.IOException;
import java.util.ArrayList;

public class Utils {
    public static Riddle getRandomRiddle() {
        ArrayList<Riddle> riddleArrayList = new ArrayList<>();
        try {
            RiddleRepository riddleRepository = new RiddleRepository("riddles.json");
            riddleArrayList = riddleRepository.getRiddleArrayList();
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        int random = (int) (Math.random()*riddleArrayList.size());
        return riddleArrayList.get(random);
    }
}
