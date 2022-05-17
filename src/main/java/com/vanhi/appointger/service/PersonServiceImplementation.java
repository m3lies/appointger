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

    @Override
    public Person create(Person person) {
        return null;
    }

    @Override
    public Collection<Person> list(int limit) {
        return null;
    }

    @Override
    public Person get(Long id) {
        return null;
    }

    @Override
    public Person update(Person person) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}
