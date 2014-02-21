package com.spring.hibernate.DAOImpl;

import com.spring.hibernate.DAO.PersonDAO;
import com.spring.hibernate.model.Person;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.List;

/**Person Hibernate Dao
 * Created by harsh on 2/21/14.
 */
public class PersionDaoImpl extends HibernateDaoSupport implements PersonDAO {


    @Override
    @Transactional
    public void save(Person person) {
        TransactionSynchronizationManager.setCurrentTransactionReadOnly(false);
        getHibernateTemplate().save(person);

    }

    @Override
    public void update(Person person) {
        getHibernateTemplate().update(person);
    }

    @Override
    public void delete(Person person) {
        getHibernateTemplate().delete(person);
    }

    @Override
    public Person findPerson(String id) {
        List<Object> list = getHibernateTemplate().find(" from Person where id=?", id);
        return (Person) list.get(0);
    }
}
