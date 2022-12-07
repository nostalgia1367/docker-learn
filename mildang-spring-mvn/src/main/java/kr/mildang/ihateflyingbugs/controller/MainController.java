package kr.mildang.ihateflyingbugs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
  @RestController
  public class HelloController {

      @GetMapping("/")
      public String home() {
          return "hello world";
      }
      
      @GetMapping("/hello")
      public String hello() {
          return "hello world";
      }
  }
}
