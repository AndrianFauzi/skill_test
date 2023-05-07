package com.demo.controllers;

import com.demo.models.entities.Konsumen;
import com.demo.services.KonsumenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class KonsumenController {

    @Autowired
    private KonsumenService konsumenService;

    @GetMapping("/add")
    public String addKonsumen(Model model) {
        model.addAttribute("konsumen", new Konsumen());
        return "add-konsumen";
    }

    @PostMapping("/add")
    public RedirectView create(@ModelAttribute("konsumen") Konsumen konsumen, RedirectAttributes redirectAttributes) {
        final RedirectView redirectView = new RedirectView("/add", true);
        konsumenService.save(konsumen);
        redirectAttributes.addFlashAttribute("addKonsumenSuccess", true);
        return redirectView;
    }

    @GetMapping("/konsumen")
    public String findAll(ModelMap model){
        model.addAttribute("konsumen", konsumenService.findAll());
        System.out.println(konsumenService.findAll());
        return "index";
    }

}
