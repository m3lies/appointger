package com.vanhi.appointger.service;

import com.vanhi.appointger.model.Appointment;

import java.util.Collection;

public interface AppointmentService {
    Appointment create (Appointment appointment);
    Collection<Appointment> list (int limit);
    Appointment get(Long id);
}
