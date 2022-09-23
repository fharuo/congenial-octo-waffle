package com.fabricio.restapi.dtos;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
public class PersonDTO {
    private Integer id;
    private String name;
    private List<String> interests;
    private LocalDate birthday;
}
