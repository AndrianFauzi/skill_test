package com.demo.controllers;

import com.demo.models.entities.Konsumen;
import com.demo.services.KonsumenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.lang.constant.Constable;

@Controller
public class KonsumenController {

    @Autowired
    private KonsumenService konsumenService;

//    public KonsumenController(KonsumenService konsumenService) {
//        this.konsumenService = konsumenService;
//    }
    @PostMapping
    public Konsumen create(@RequestBody Konsumen konsumen) {
        return konsumenService.save(konsumen);
    }

    @GetMapping("/test")
    public String findAll(ModelMap model){
        model.addAttribute("konsumen", konsumenService.findAll());
        System.out.println(konsumenService.findAll());
        return "view-konsumen";
    }

    @GetMapping("/{id}")
    public Konsumen findOne(@PathVariable("id") Long id) {
        return konsumenService.findOne(id);
    }

    @PutMapping
    public Konsumen update(@RequestBody Konsumen konsumen) {
        return konsumenService.save(konsumen);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id) {
         konsumenService.removeOne(id);
    }

}
