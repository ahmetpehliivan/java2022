package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    private Course[] courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, Course[] courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course) throws Exception {
        //İş kurallarının bulunduğu kısımdır. Kullanıcıdan gelen veriler belirli..
        //..kurallardan geçirilir ve ilgili dataAccess package ına gönderilir.
        for (Course course0:courses) {
            if (course.getCourseName()==course0.getCourseName()) {
                throw new Exception("HATA! Bu isimle kaydedilmiş bir ders bulunmaktadır...");
            }
        }
        if (course.getPrice()<0){
            throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
        }
        courseDao.add(course);

        for (Logger logger:loggers) {
            logger.log(course.getCourseName());
        }
    }
}
