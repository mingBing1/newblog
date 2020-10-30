package com.ming.blog.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String indexName(){
//        int i=9/0;
        return "index";
    }
}
