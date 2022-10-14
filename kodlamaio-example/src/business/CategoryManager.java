package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private Category[] categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, Category[] categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void add(Category category) throws Exception{
        //İş kurallarının bulunduğu kısımdır. Kullanıcıdan gelen veriler belirli..
        //..kurallardan geçirilir ve ilgili dataAccess package ına gönderilir.

        for (Category category0:categories)
            if (category.getCategoryName()==category0.getCategoryName()) {
                throw new Exception("HATA! Bu isimle kaydedilmiş bir kategori bulunmaktadır...");
            }
        categoryDao.add(category);

        for (Logger logger:loggers) {
            logger.log(category.getCategoryName());
        }
    }
}
