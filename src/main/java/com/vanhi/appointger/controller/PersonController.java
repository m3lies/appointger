package com.vanhi.appointger.controller;

import com.vanhi.appointger.model.Person;
import com.vanhi.appointger.repository.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepo personRepo;

    @GetMapping("/persons")
    public List<Person> getPersons() {
        return (List<Person>) personRepo.findAll();
    }

    @PostMapping("/persons")
    public void savePerson(@RequestBody Person person) {
        personRepo.save(person);
    }

    @GetMapping("/persons/{id}")
    public Optional<Person> getPerson(@PathVariable("id") Long id) {
        return personRepo.findById(id);

    }

    @DeleteMapping("/persons/{id}")
    public void deletePerson(@PathVariable("id") Long id) {
        personRepo.deleteById(id);
    }
}
