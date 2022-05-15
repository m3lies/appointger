package com.vanhi.appointger.service;

import com.vanhi.appointger.model.Appointment;
import com.vanhi.appointger.repository.AppointmentRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;


@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class AppointServiceImplementation implements AppointmentService {

    private final AppointmentRepo appointmentRepo;

    @Override
    public Appointment create(Appointment appointment) {
        log.info("Saving new appointment {}", appointment.getSpecialty());
        return appointmentRepo.save(appointment);
    }

    @Override
    public Collection<Appointment> list(int limit) {
        return null;
    }

    @Override
    public Appointment get(Long id) {
        return null;
    }

    @Override
    public Appointment update(Appointment appointment) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}
