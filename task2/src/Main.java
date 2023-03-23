

class Main {
    public static void main(String[] args) {
        Car car = new Car("Highlander", "Toyota","white", 2008, 20000, 10);
        System.out.println(car.toString());

        car.sell(7);
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        car.setColor("White,Black");
        car.setPrice(75200);
        car.setQuantity(71);

        System.out.println(car.toString());
    }
}
class Car {
    public String model, brand, color;
    public int year, price, quantity;

    public Car(String model, String brand, String color,  int year,  int price,  int quantity) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void delivery(int amountOfDelivery){
        this.quantity = quantity + amountOfDelivery;
    }
    public void sell(int numberOfSoldCars){
        this.quantity = quantity - numberOfSoldCars;
    }

    @Override
    public String toString() {
        return "Car: model:" + model + ", brand:" + brand + ", year:" + year + ", price:" + price + ", color:" + color + ", quantity: " + quantity;
    }

}