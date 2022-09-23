package com.fabricio.restapi.controllers;

import com.fabricio.restapi.dtos.PersonDTO;
import com.fabricio.restapi.services.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/persons")
    public ResponseEntity<List<PersonDTO>> getAll() {
        List<PersonDTO> persons = service.getAll();
        return ResponseEntity.ok(persons);
    }
}
