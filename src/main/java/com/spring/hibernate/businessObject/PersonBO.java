package com.spring.hibernate.businessObject;

import com.spring.hibernate.model.Person;

/**Person Business Object
 * Created by harsh on 2/21/14.
 */
public interface PersonBO {

    void save(Person person);
    void update(Person person);
    void delete(Person person);
    Person findPerson(String id);

}
