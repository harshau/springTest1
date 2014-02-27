package com.spring.hibernate.DAOImpl;

import com.spring.hibernate.DAO.ApplicationDAO;
import com.spring.hibernate.model.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**Person Hibernate Dao
 * Created by harsh on 2/21/14.
 */

@EnableTransactionManagement
@ContextConfiguration(locations = "classpath:springConfig.xml")
public class PersionDaoImpl   implements ApplicationDAO {




    @Autowired
    @Qualifier("sessionFactory")
    SessionFactory sessionFactory;

    @Autowired
    HibernateTemplate hibernateTemplate;

    @Transactional
    public void saveObject(Object obj){
        hibernateTemplate.save(obj);
    }

    @Override
    @Transactional(readOnly = false)
    public void save(Person person) {
        hibernateTemplate.save(person);
    }

    @Override
    @Transactional
    public void update(Person person) {
        hibernateTemplate.update(person);
    }

    @Override
    @Transactional
    public void delete(Person person) {
        hibernateTemplate.delete(person);
    }

    public Campus findCampus(int id){
        List<Object> list =hibernateTemplate.find(" from Campus where id=?", id);
        return (Campus) list.get(0);
    }


    @Override
    public Person findPerson(int id) {
        List<Object> list =hibernateTemplate.find(" from Person where id=?", id);
        return (Person) list.get(0);
    }

    @Transactional
    public void studentSave(Student student) {
        hibernateTemplate.save(student);

    }

    public void studentUpdate(Student student) {
        hibernateTemplate.update(student);

    }

    public void studentDelete(Student student) {
        hibernateTemplate.delete(student);

    }

    @Transactional
    public Student findStudent(int id) {
        List<Object> list = hibernateTemplate.find(" from Student where student_Id=?", id);
        return (Student) list.get(0);
    }

    public void courseSave(Course course) {
        hibernateTemplate.save(course);
    }

    public void courseUpdate(Course course) {
        hibernateTemplate.update(course);

    }

    public void courseDelete(Course course) {
        hibernateTemplate.delete(course);

    }

    public Course findCourse(int id) {
        List<Object> list = hibernateTemplate.find(" from Course where course_id=?", id);
        return (Course) list.get(0);
    }

    @Override
    @Transactional
    public void saveStock(Stock stock) {
        System.out.println("sessionFactory: "+sessionFactory);
//        getSessionFactory().openSession();
//        getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
        //System.out.println("Get Current Session:"+getSessionFactory().openSession());
        hibernateTemplate.save(stock);
    }

    @Override
    public void updateStock(Stock stock) {
        hibernateTemplate.update(stock);
    }

    @Override
    public void deleteStock(Stock stock) {
        hibernateTemplate.delete(stock);
    }

    @Override
    public Stock findByStockCode(String stockCode) {
        List list = hibernateTemplate.find("from Stock where stockCode=?",stockCode);
        return (Stock)list.get(0);
    }


}
