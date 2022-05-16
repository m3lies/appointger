package com.vanhi.appointger.service;

import com.vanhi.appointger.model.Appointment;
import com.vanhi.appointger.model.Person;
import com.vanhi.appointger.model.Person;

import java.util.Collection;

public interface PersonService {
    Person create (Person person);
    Collection<Person> list (int limit);
    Collection<Appointment> appointmentList(int limit);
    Person get(Long id);
    Person update (Person person);
    Boolean delete (Long id);

}
