package com.github.hotire.springcore.property;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/event")
@RestController
public class EventController {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
       webDataBinder.registerCustomEditor(com.github.hotire.springcore.property.Event.class, new EventEditor());
    }

    @GetMapping("/{event}")
    public ResponseEntity getEvent(@PathVariable Event event) {
        return ResponseEntity.ok().body(event);
    }
}
