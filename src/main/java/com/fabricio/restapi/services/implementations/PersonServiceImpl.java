package com.fabricio.restapi.services.implementations;

import com.fabricio.restapi.dtos.PersonDTO;
import com.fabricio.restapi.models.Person;
import com.fabricio.restapi.repositories.PersonRepository;
import com.fabricio.restapi.services.PersonService;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class PersonServiceImpl implements PersonService {

    private final PersonRepository repository;

    public PersonServiceImpl(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<PersonDTO> getAll() {
        return repository.findAll().stream().map(this::toDto).collect(toList());
    }


    private PersonDTO toDto(Person person) {
        return PersonDTO.builder()
                .id(person.getId())
                .name(person.getName())
                .interests(person.getInterests())
                .birthday(person.getBirthday())
                .build();
    }

}
