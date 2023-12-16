package com.example.themedemo.demos.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ThemeResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ThemeController {

    @Autowired
    private ThemeResolver themeResolver;

    @RequestMapping(path = "/01/{theme}", method = RequestMethod.GET)
    public String theme1(@PathVariable("theme") String themeStr, HttpServletRequest request, HttpServletResponse response) {
        themeResolver.setThemeName(request, response, themeStr);
        return "redirect:/01";
    }

    @GetMapping(path = "/index")
    public String getPage() {
        System.out.println("aaa");
        return "theme";
    }
}
