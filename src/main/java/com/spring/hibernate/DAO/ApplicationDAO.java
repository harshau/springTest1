package com.spring.hibernate.DAO;

import com.spring.hibernate.model.Course;
import com.spring.hibernate.model.Person;
import com.spring.hibernate.model.Stock;
import com.spring.hibernate.model.Student;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by harsh on 2/21/14.
 */
public interface ApplicationDAO {

    @Transactional
    void save(Person person);

    void update(Person person);

    void delete(Person person);

    Person findPerson(int id);

    //student Dao
    @Transactional
    void studentSave(Student student);

    @Transactional
    void studentUpdate(Student student);

    @Transactional
    void studentDelete(Student student );

    Student findStudent(int id);

    //Course Dao
    @Transactional
    void courseSave(Course course);

    @Transactional
    void courseUpdate(Course course);

    @Transactional
    void courseDelete(Course course);

    Course findCourse(int id);



    //stock test
    void saveStock(Stock stock);
    void updateStock(Stock stock);
    void deleteStock(Stock stock);
    Stock findByStockCode(String stockCode);

}
