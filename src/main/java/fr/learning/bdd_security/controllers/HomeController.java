package fr.learning.bdd_security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/profile")
    public String profile(){ return "profile"; }

}
