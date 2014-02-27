package com.spring.hibernate.businessObject;

import com.spring.hibernate.model.*;

/**Person Business Object
 * Created by harsh on 2/21/14.
 */
public interface PersonBO {

    void save(Person person);
    void update(Person person);
    void delete(Person person);
    Person findPerson(int id);
    void saveObject(Campus obj);
    void saveStock(Stock stock);

    void updateStock(Stock stock);

    void deleteStock(Stock stock);

    Stock findByStockCode(String stockCode);

    //student Dao
    void studentSave(Student student);
    void studentUpdate(Student student);
    void studentDelete(Student student );
    Student findStudent(int id);

    //Course Dao
    void courseSave(Course course);
    void courseUpdate(Course course);
    void courseDelete(Course course);
    Course findCourse(int id);
    Campus findCampus(int id);




}
