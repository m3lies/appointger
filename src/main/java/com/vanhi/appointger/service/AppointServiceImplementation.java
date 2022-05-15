package com.vanhi.appointger.service;

import com.vanhi.appointger.model.Appointment;
import com.vanhi.appointger.repository.AppointmentRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
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
        log.info("Fetching all the existing appointments");
        return appointmentRepo.findAll(PageRequest.of(0,limit)).toList();
    }

    @Override
    public Appointment get(Long id) {

        log.info("Fetching appointment by id");
        return appointmentRepo.findById(id).get();
    }

    @Override
    public Appointment update(Appointment appointment) {
        log.info("Update appointment {}", appointment.getSpecialty());
        return appointmentRepo.save(appointment);
    }
    @Override
    public Boolean delete(Long id) {
        log.info("Delete appointment {}", id);
        appointmentRepo.deleteById(id);
        return Boolean.TRUE;
    }
}
