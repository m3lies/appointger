package com.vanhi.appointger.service;

import com.vanhi.appointger.exception.ResourceNotFoundExcetion;
import com.vanhi.appointger.model.Appointment;

import java.util.Collection;

public interface AppointmentService {
    Appointment create (Appointment appointment);
    Collection<Appointment> list (int limit);
    Appointment get(Long id);
    Appointment update (Appointment appointment);
    Boolean delete (Long id);
    Collection<Appointment> listByPersonId(Long id) throws ResourceNotFoundExcetion;
}
