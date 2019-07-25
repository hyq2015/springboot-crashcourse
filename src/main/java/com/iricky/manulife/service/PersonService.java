package com.iricky.manulife.service;

import com.iricky.manulife.dao.PersonDao;
import com.iricky.manulife.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonDao personDao;

    @Autowired
    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
    public List<Person> getAllPerson() {
        return personDao.selectAllPerson();
    }
}
