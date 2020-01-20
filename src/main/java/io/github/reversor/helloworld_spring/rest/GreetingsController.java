package io.github.reversor.helloworld_spring.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class GreetingsController {

  @GetMapping("{name}")
  public ResponseEntity<String> greetings(@PathVariable("name") String name) {
    return ResponseEntity.ok(name);
  }

}
