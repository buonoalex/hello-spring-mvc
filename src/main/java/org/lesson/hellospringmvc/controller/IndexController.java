package org.lesson.hellospringmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.Random;


@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String index(Model model){
        //Gemero un numero casuale
        Random numberRandom = new Random();
        int numberToInsert  = numberRandom.nextInt(1,7);
        model.addAttribute("numberRandom",numberToInsert );
        return "home";
    }

}
