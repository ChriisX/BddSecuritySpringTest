package fr.learning.bdd_security.controllers;

import fr.learning.bdd_security.models.User;
import fr.learning.bdd_security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model)
    {
        model.addAttribute(new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@Valid User user, BindingResult result, Model model){
        User userExists = userService.findByUsername(user.getUsername());
        if(userExists != null){
            result.rejectValue("username", "registration.error.userAlreadyExists");
            model.addAttribute("error", true);
        }
        if(result.hasErrors()){
            model.addAttribute("error", true);
            return "register";
        }

        userService.saveUser(user);
        return "redirect:profile";
    }
}
