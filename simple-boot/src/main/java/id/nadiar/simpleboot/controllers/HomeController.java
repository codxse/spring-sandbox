package id.nadiar.simpleboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value={"", "/", "/home"})
    public String displayHomePage(Model model) {
        model.addAttribute("username", "Smith JWT Token 12");
        return "home.html";
    }
}
