package com.spring.hibernate.DAO;

import com.spring.hibernate.model.Person;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by harsh on 2/21/14.
 */
public interface PersonDAO {

    @Transactional
    void save(Person person);

    void update(Person person);

    void delete(Person person);

    Person findPerson(String id);

}
