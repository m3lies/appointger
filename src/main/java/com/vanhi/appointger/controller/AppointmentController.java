package com.vanhi.appointger.controller;

import com.vanhi.appointger.exception.ResourceNotFoundExcetion;
import com.vanhi.appointger.model.Appointment;
import com.vanhi.appointger.model.Response;
import com.vanhi.appointger.service.AppointServiceImplementation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AppointmentController {
    private final AppointServiceImplementation appointmentServiceImpl;

    @GetMapping("/appointments")
    public ResponseEntity<Response> getAppointments(){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("appointments", appointmentServiceImpl.list(30)))
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .message("Appointments retrieved")
                        .build()
        );
    }
    @PostMapping ("/appointments")
    public ResponseEntity<Response> saveAppointment(@RequestBody Appointment appointment){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("appointments", appointmentServiceImpl.create(appointment)))
                        .status(HttpStatus.CREATED)
                        .statusCode(HttpStatus.CREATED.value())
                        .message("Appointment created")
                        .build()
        );
    }

    @GetMapping ("/appointments/{id}")
    public ResponseEntity<Response> getAppointment(@PathVariable Long id){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("appointments", appointmentServiceImpl.get(id)))
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .message("Appointment retrieved")
                        .build()
        );
    }

    @DeleteMapping ("/appointments/{id}")
    public ResponseEntity<Response> deleteAppointment(@PathVariable("id") Long id){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("appointments", appointmentServiceImpl.delete(id)))
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .message("appointment deleted")
                        .build()
        );
    }

    @GetMapping("/persons/{personId}/appointments")
    public ResponseEntity<Response> getAppointmentsList(@PathVariable("personId") Long personId) throws ResourceNotFoundExcetion {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("appointments", appointmentServiceImpl.listByPersonId(personId)))
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .message("Appointments retrieved")
                        .build()
        );
    }

}
