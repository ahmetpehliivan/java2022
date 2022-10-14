package dataAccess.jdbc;

import dataAccess.CourseDao;
import entities.Course;

public class JdbcCourseDao implements CourseDao {
    public void add(Course course){
        //Buraya manager classındaki kurallardan geçen nesne gelebilir.
        //Bu kısımda sadece ve sadece db(database) kodları bulunur.
        System.out.println(course.getCourseName()+" JDBC ile veritabanına eklendi.");
    }
}
