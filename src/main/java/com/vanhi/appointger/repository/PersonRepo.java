package com.vanhi.appointger.repository;

import com.vanhi.appointger.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person, Long> {

}
