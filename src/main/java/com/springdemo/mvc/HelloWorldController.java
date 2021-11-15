package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.applet.Applet;
import java.text.AttributedString;


@Controller
public class HelloWorldController {

    Model model;

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }
    @RequestMapping("/processForm")
    public String processForm(){
       return "helloworld";
    }
    @RequestMapping("/processFormVersionTwo")
    public String letsShout(HttpServletRequest request, Model model){
        String name=request.getParameter("studentName");
        name=name.toUpperCase();
        String result="hey "+name;
        model.addAttribute("message",result);
        return "helloworld";}
        @RequestMapping("/processFormVersionThree")
        public String processFormVersionThree(@RequestParam("studentName") String name, Model model) {

            name = name.toUpperCase();
            String result = "hey from v3" + name;
            model.addAttribute("message", result);
            return "helloworld";
        }





}
