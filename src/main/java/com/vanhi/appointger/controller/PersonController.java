package com.vanhi.appointger.controller;

import com.vanhi.appointger.model.Person;
import com.vanhi.appointger.model.Response;
import com.vanhi.appointger.service.PersonServiceImplementation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {
    private final PersonServiceImplementation personServiceImpl;

    @GetMapping("/")
    public ResponseEntity<Response> getPersons(){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("appointments", personServiceImpl.list(30)))
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .message("Persons retrieved")
                        .build()
        );
    }
    @PostMapping("/")
    public ResponseEntity<Response> savePerson(@RequestBody Person person){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("persons", personServiceImpl.create(person)))
                        .status(HttpStatus.CREATED)
                        .statusCode(HttpStatus.CREATED.value())
                        .message("Person created")
                        .build()
        );
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Response> getPerson(@PathVariable Long id){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("persons", personServiceImpl.get(id)))
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .message("Person retrieved")
                        .build()
        );
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Response> deleteAppointment(@PathVariable("id") Long id){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("persons", personServiceImpl.delete(id)))
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .message("Person deleted")
                        .build()
        );
    }
}
