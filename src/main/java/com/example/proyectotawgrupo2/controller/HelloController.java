package com.example.proyectotawgrupo2.controller;

import com.example.proyectotawgrupo2.entity.Gender;
import com.example.proyectotawgrupo2.entity.Movie;
import com.example.proyectotawgrupo2.entity.Status;
import com.example.proyectotawgrupo2.repository.GenderRepository;
import com.example.proyectotawgrupo2.repository.MovieRepository;
import com.example.proyectotawgrupo2.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @Autowired
    private GenderRepository genderRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private StatusRepository statusRepository;


    @GetMapping("/")
    public String hello(Model model) {
        return "movie_upload";
    }

    @GetMapping("/upload")
    public String upload(@RequestParam("value") String value, Model model) {
        Gender gender = new Gender();
        gender.setValue(value);
        genderRepository.save(gender);
        model.addAttribute("value", value);
        return "upload";
    }
    @GetMapping("/upload_movie")
    public String upload_movie(@RequestParam("value") String value, Model model) {
        Movie movie = new Movie();
        Status status = new Status();
        status.setValue("Horneada");
        statusRepository.save(status);
        movie.setStatus(status);
        movie.setId(1);
        movieRepository.save(movie);
        model.addAttribute("value", value);
        return "upload";
    }
}
