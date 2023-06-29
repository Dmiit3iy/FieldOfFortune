package com.dmiit3iy.fieldoffortune.controllers;

import com.dmiit3iy.fieldoffortune.model.Riddle;
import com.dmiit3iy.fieldoffortune.util.Utils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class MainController {
    static String question;
    static String answer;
    static String currentAnswer;

    @GetMapping("/start")
    public String start(Model model) {
        Riddle riddle = Utils.getRandomRiddle();

        question = riddle.getQuestion();
        answer = riddle.getAnswer();
        currentAnswer =stars(answer);

        model.addAttribute("question", question);
        //model.addAttribute("answer", answer);
        model.addAttribute("currentAnswer",currentAnswer );


        return "start";
    }

    @PostMapping("/getLatter")
    public String doPost(@RequestParam("latter") String latter, Model model) {
        model.addAttribute("question", question);
        model.addAttribute("currentAnswer",existsLatter(latter) );
        if (currentAnswer.equals(answer)){
            model.addAttribute("vin","ПОБЕДА!!");
        } else {
            model.addAttribute("vin","");
        }
        return "start";
    }


    public String existsLatter(String s) {
        String sToLowerCase = s.toLowerCase();
        String[] currentChars = currentAnswer.split("");
        String[] chars = answer.split("");
        int index;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i].equals(sToLowerCase)) {
               currentChars[i]=sToLowerCase;
            }
        }
        currentAnswer = String.join("",currentChars);
        return currentAnswer;
    }

    public String stars(String answer) {
        char[] chars = new char[answer.length()];
        Arrays.fill(chars, '*');
        return new String(chars);
    }
}