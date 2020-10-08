package com.launchacademy.petadoptions.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
  @GetMapping(value = "/**/{path:[\\.]*}")
  public String forward() {
    return "forward:/";
  }
}
