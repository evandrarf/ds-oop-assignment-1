public class Oop {
  public static void main(String[] args) {
      Car electricCar = new ElectricCar("BYD", "Atto 3", "Black", 120);

      Car gasCar = new GasCar("TOYOTA", "INNOVA", "White", 80);

      System.out.println("Electric car brand " + electricCar.brand);
      System.out.println("Gas car brand " + gasCar.brand);
  } 
}

abstract class Car {
  protected  String brand;
  protected  String type;
  protected  String color;
  protected  int speed;

  public Car(String brand, String type, String color, int speed) {
    this.brand = brand;
    this.type = type;
    this.color = color;
    this.speed = speed;
  }

  abstract void startEngine();

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int newSpeed) {
    speed = newSpeed;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String newBrand) {
    brand= newBrand;
  }
}

class ElectricCar extends Car {
  public ElectricCar(String brand, String type, String color, int speed) {
    super(brand, type, color, speed);
  }

  public void startEngine() {
    System.out.println("ELECTRIC ENGINE START");
  }
}

class GasCar extends Car {
public GasCar(String brand, String type, String color, int speed) {
    super(brand, type, color, speed);
  }

  public void startEngine() {
        System.out.println("GAS ENGINE START");
  }
}