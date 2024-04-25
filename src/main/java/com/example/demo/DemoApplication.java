package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
//public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public int multiply(int firstNumber ,int secondNumber){
        return firstNumber * secondNumber;
    }

    public int substract(int firstNumber ,int secondNumber){
        return firstNumber - secondNumber;
    }

    @RequestMapping("/")
  public String home() {
    return "Hello World!";
  }
}
