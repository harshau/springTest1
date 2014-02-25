package com.spring.hibernate.businessObjectImpl;

import com.spring.hibernate.DAO.ApplicationDAO;
import com.spring.hibernate.businessObject.PersonBO;
import com.spring.hibernate.model.Course;
import com.spring.hibernate.model.Person;
import com.spring.hibernate.model.Stock;
import com.spring.hibernate.model.Student;

/**
 * Created by harsh on 2/21/14.
 */
public class PersonImpl implements PersonBO {

    ApplicationDAO applicationDAO;

    public ApplicationDAO getApplicationDAO() {
        return applicationDAO;
    }

    public void setApplicationDAO(ApplicationDAO applicationDAO) {
        this.applicationDAO = applicationDAO;
    }

    @Override
    public void save(Person person) {
        applicationDAO.save(person);
    }

    @Override
    public void update(Person person) {
        applicationDAO.update(person);
    }

    @Override
    public void delete(Person person) {
        applicationDAO.delete(person);
    }

    @Override
    public Person findPerson(int id) {
        return applicationDAO.findPerson(id);
    }

    @Override
    public void saveStock(Stock stock) {
        applicationDAO.saveStock(stock);

    }

    @Override
    public void updateStock(Stock stock) {
        applicationDAO.updateStock(stock);

    }

    @Override
    public void deleteStock(Stock stock) {
        applicationDAO.deleteStock(stock);

    }

    @Override
    public Stock findByStockCode(String stockCode) {
        return applicationDAO.findByStockCode(stockCode);
    }

    @Override
    public void studentSave(Student student) {
        applicationDAO.studentSave(student);
    }

    @Override
    public void studentUpdate(Student student) {
          applicationDAO.studentUpdate(student);
    }

    @Override
    public void studentDelete(Student student) {
        applicationDAO.studentDelete(student);

    }

    @Override
    public Student findStudent(int id) {
        return applicationDAO.findStudent(id);
    }

    @Override
    public void courseSave(Course course) {
        applicationDAO.courseSave(course);

    }

    @Override
    public void courseUpdate(Course course) {
        applicationDAO.courseUpdate(course);

    }

    @Override
    public void courseDelete(Course course) {
        applicationDAO.courseDelete(course);

    }

    @Override
    public Course findCourse(int id) {
        return applicationDAO.findCourse(id);
    }
}
