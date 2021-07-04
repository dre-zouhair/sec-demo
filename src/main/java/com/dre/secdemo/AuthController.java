package com.dre.secdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController{
    @GetMapping({"/isAuth"})
    public String isAuth(){
        return "Yes";
    }
}
