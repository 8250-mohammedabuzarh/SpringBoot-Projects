package com.example4.threetier.service;

import com.example4.threetier.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PeopleService {
    List<Person> findAllPeople();
    Person findById(long id);
    Person insert(Person p);
    boolean delete(long id);
    boolean update(Person p);
}
