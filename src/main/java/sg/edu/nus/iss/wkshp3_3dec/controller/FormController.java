package sg.edu.nus.iss.wkshp3_3dec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import sg.edu.nus.iss.wkshp3_3dec.model.Data;



@Controller
public class FormController {
    @GetMapping("/")
    public String getForm() {
        return "index";
    }

    @PostMapping("/contact")
    public String postMethodName(@Valid Data data,BindingResult binding,  Model model ) {
        if (binding.hasErrors()){
            System.out.println("Validation errors: " + binding.getAllErrors());
            return "index";
        }
        model.addAttribute("data", data);
        return "contact";
    }
    
    
}
