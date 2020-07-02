package com.myproject.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    private String hello_string="Hello, world";
    @RequestMapping(value = "/helloGet", //
            method = RequestMethod.GET)
    @ResponseBody
    public String helloGet() {

        return hello_string;
    }

    @PostMapping(value = "/helloPost")
    @ResponseBody
    public String updateHello(@RequestParam(value = "hello_value")String hello_value) {
        hello_string=hello_value;
        System.out.println("Update String" + hello_string);
        return hello_string;
    }

    @PostMapping(value = "/helloBodyPost", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String postResponseJsonContent(
            @RequestBody HelloResponse helloResponse) {
        hello_string=helloResponse.getHello();
        return  hello_string;
    }
}
