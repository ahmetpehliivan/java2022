public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.price = 1000;
        product.name = "";
        product.id = 1;
        productManager.add(product);

        DatabaseHelper.Connection.createConnection();
        DatabaseHelper.Crud.delete();
    }
}
