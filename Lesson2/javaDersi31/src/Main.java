public class Main {
    public static void main(String[] args){
        Product product = new Product();
        product.name = "Laptop";
        product.id = 12345;
        product.description = "Asus Laptop";
        product.price = 5000;
        product.stockAmount = 100;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.name);
    }
}
