package dataAccess.jdbc;

import dataAccess.CategoryDao;
import entities.Category;

public class JdbcCategoryDao implements CategoryDao {
    public void add(Category category){
        //Buraya manager classındaki kurallardan geçen nesne gelebilir.
        //Bu kısımda sadece ve sadece db(database) kodları bulunur.
        System.out.println(category.getCategoryName()+" JDBC ile veritabanına eklendi.");
    }
}
