package sec02.exam01;

public class Product {
    private String productId;
    private String productName;
    private String productArea;
    private int price;
    private double tax;

    Product(){}

    Product(String productId, String productName, String productArea, int price, double tax){
        this.productId = productId;
        this.productName = productName;
        this.productArea = productArea;
        this.price = price;
        this.tax = tax;
    }

    public String informarion() {
        return productId + " " + productName + " " + productArea + " " + price + " " + tax;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public void setTax(double tax){
        this.tax = tax;
    }

    public String getProductName(){
        return productName;
    }
    public int getBugassePoham(){
        return (int) ((price * tax) + price);
    }
}