package com.example.demo.controller;

import com.example.demo.service.wordladder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WordLadderController {
    @RequestMapping(value="/wordladder")
    @ResponseBody
    public String makeLadder(@RequestParam String w1,@RequestParam String w2) {

        return wordladder.runMain(w1,w2);
    }
}
