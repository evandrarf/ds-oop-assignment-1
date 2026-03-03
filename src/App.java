public class App {
    public static void main(String[] args) throws Exception {
        Car byd = new Car("BYD", "BYD Seal", "Red", 100);
        Car car = new Car();

        System.out.println(car.getBrand());
        
        car.setBrand("Mustang");
        
        System.out.println(car.getBrand());

        System.out.println(byd.getBrand());
    }
}

class Car {
  private  String brand;
  private  String type;
  private  String color;
  private  int speed;

  public Car() {
    this.brand = "DEFAULT CARD";
  }
  
  public Car(String brand, String type, String color, int speed) {
    this.brand = brand;
    this.type = type;
    this.color = color;
    this.speed = speed;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }
}