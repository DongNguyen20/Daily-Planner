package com.kopw.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.kopw.ui.common.AppConstant.HOME;
import static com.kopw.ui.common.AppConstant.HOME_PATH;

@Controller
@RequestMapping(HOME_PATH)
public class HomeController {

    @GetMapping
    public String goHomePage() {
        return HOME;
    }
}
