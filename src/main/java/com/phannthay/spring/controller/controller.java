package com.phannthay.spring.controller;

import com.phannthay.spring.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Phann Thay on 6/17/2017.
 */
@Controller
public class controller {
    @RequestMapping({"/","home"})
    public String homePage(ModelMap model){
       model.addAttribute("MESSAGE","<b>HELLO Thay</b>");
       model.addAttribute("STUDENT",new Student(1,"Dara","O"));
        return "dashboard";
    }
}
