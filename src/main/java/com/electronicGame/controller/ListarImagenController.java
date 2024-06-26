package com.electronicGame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.electronicGame.business.ServicioImagen;

@Controller
public class ListarImagenController extends HeaderController{


    @Autowired
    private ServicioImagen servicioImagen;



    @GetMapping("/imagenes")
    public String getAllImagenes(Model model) {
        model.addAttribute("imagenes", servicioImagen.getAllImagenes());
        return "t_imagenes";
    }
}
