import business.CategoryManager;
import business.CourseManager;
import core.logging.DatabaseLogger;
import core.logging.EmailLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.hibernate.HibernateCategoryDao;
import dataAccess.hibernate.HibernateCourseDao;
import dataAccess.jdbc.JdbcCategoryDao;
import dataAccess.jdbc.JdbcCourseDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new DatabaseLogger(), new EmailLogger(), new FileLogger()};

        //Sistemde kayıtlı olan Category ve Course lar...
        Category category1 = new Category(1,"Back-End");
        Category category2 = new Category(2,"Front-End");
        Category[] categories = {category1,category2};
        Course course1 = new Course(1,"Java",500);
        Course course2 = new Course(2,"Python",350);
        Course[] courses = {course1,course2};

        //Sisteme yeni kayıt edilecek category ve course nesnesi
        Category category3 = new Category(3,"SQL");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers,categories);
        categoryManager.add(category3);

        System.out.println("===================================");

        Course course3 = new Course(3,"C",650);
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers,courses);
        courseManager.add(course3);

    }
}
