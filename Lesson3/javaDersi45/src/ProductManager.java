public class ProductManager {
    public void add(Product product){
        //ProductValidator validator = new ProductValidator();
        if (ProductValidator.isValid(product)) {
            System.out.println("Veritabanına eklendi.");
        }else
            System.out.println("Ürün bilgileri geçersizdir.");
        }
}
