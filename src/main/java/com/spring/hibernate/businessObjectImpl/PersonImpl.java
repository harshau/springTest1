package com.spring.hibernate.businessObjectImpl;

import com.spring.hibernate.DAO.PersonDAO;
import com.spring.hibernate.businessObject.PersonBO;
import com.spring.hibernate.model.Person;

/**
 * Created by harsh on 2/21/14.
 */
public class PersonImpl implements PersonBO {

    PersonDAO personDAO;

    public PersonDAO getPersonDAO() {
        return personDAO;
    }

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public void save(Person person) {
        personDAO.save(person);
    }

    @Override
    public void update(Person person) {
        personDAO.update(person);
    }

    @Override
    public void delete(Person person) {
        personDAO.delete(person);
    }

    @Override
    public Person findPerson(String id) {
        return personDAO.findPerson(id);
    }
}
