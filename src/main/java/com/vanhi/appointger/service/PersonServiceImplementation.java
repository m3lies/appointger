package com.vanhi.appointger.service;

import com.vanhi.appointger.model.Appointment;
import com.vanhi.appointger.model.Person;
import com.vanhi.appointger.repository.PersonRepo;
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
public class PersonServiceImplementation implements PersonService {
    private final PersonRepo personRepo;
    @Override
    public Person create(Person person) {
        log.info("Saving new person {}", person.getName());
        return personRepo.save(person);
    }

    @Override
    public Collection<Person> list(int limit) {
        log.info("Fetching all the existing persons");
        return personRepo.findAll(PageRequest.of(0,limit)).toList();
    }

    @Override
    public Collection<Appointment> appointmentList(int limit) {
        return null;
    }

    @Override
    public Person get(Long id) {

        log.info("Fetching person by id");
        return personRepo.findById(id).get();
    }

    @Override
    public Person update(Person person) {
        log.info("Update person {}", person.getName());
        return personRepo.save(person);
    }
    @Override
    public Boolean delete(Long id) {
        log.info("Delete person {}", id);
        personRepo.deleteById(id);
        return Boolean.TRUE;
    }
}
