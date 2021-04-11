package ca.sheridancollege.vellone.assignment4.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping(value={"/", "/Index"})
    public String index(){
        return "Index";
    }

    @Secured("ROLE_TEACHER")
    @GetMapping(value={"/teacher"})
    public String teacher(){
        return "teacher";
    }

    @Secured("ROLE_STUDENT")
    @GetMapping(value={"/student"})
    public String student(){
        return "student";
    }
}
