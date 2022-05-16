package com.vanhi.appointger.repository;

import com.vanhi.appointger.enumeration.Specialty;
import com.vanhi.appointger.model.Appointment;
import com.vanhi.appointger.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Long> {
    Person findByName (String name);
}
