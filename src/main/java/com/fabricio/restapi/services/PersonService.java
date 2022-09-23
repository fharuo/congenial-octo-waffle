package com.fabricio.restapi.services;

import com.fabricio.restapi.dtos.PersonDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {
    List<PersonDTO> getAll();
}
