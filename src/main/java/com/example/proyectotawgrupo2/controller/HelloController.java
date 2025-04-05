package com.example.proyectotawgrupo2.controller;

import com.example.proyectotawgrupo2.entity.Gender;
import com.example.proyectotawgrupo2.repository.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @Autowired
    private GenderRepository genderRepository;


    @GetMapping("/")
    public String hello(Model model) {
        return "hello";
    }

    @GetMapping("/upload")
    public String upload(@RequestParam("value") String value, Model model) {
        Gender gender = new Gender();
        gender.setValue(value);
        genderRepository.save(gender);
        model.addAttribute("value", value);
        return "upload";
    }
}
