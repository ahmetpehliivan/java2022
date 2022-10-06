package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product){
        //sadece ve sadece db(database) erişim kodları buraya yazılır.. SQL
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}
