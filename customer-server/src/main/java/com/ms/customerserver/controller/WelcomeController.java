package com.ms.customerserver.controller;

import com.ms.commonutils.DateUtils;
import dto.CustomerDto;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class WelcomeController {

    @GetMapping(value = {"/", "/{name}"})
    public String welcome(@PathVariable Optional<String> name) {
        return name.orElse("Welcome Customer Service " + DateUtils.getCurrentDate());
    }

    @GetMapping(value = "/customer")
    public CustomerDto get() {
        return CustomerDto.builder().phone("03009215979").id(1).status(true)
                .name("Tahir Saleem").email("developer.tahirghori").build();
    }
}
