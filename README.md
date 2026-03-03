# Assignment 1

Subject: **Data Structure and Object Oriented Programming**

| Name  | Evandra Raditya Fauzan |
| ----- | ---------------------- |
| NRP   | 5027251001             |
| Class | A                      |

## Class & Object

---

#### 1. Class

A class is a blueprint or template.

It defines:

- Attributes (variables) → what it has
- Methods (functions) → what it can do

Think of a class like a **car design plan**.
The design itself is not a real car yet, it's just the definition.

Example:

[`App.java:16-40`](./src/App.java#L16-L40)

```java
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
```

#### 2. Object

An object is a real instance created from a class.

If class = blueprint<br/>Then object = actual thing built from that blueprint.

[`App.java:3-4`](./src/App.java#L3-L4)

```java
Car byd = new Car("BYD", "BYD Seal", "Red", 100);
Car car = new Car();
```

## Constructor & Destructor

---

#### 1. Constructor

A constructor is a special method that runs when an object is created.

Its job:

- Initialize (set up) the object
- Give starting values to attributes

Important Rules:

- Name must be **same as class name**
- No return type (not even `void`)
- Automatically called when using `new`

Example:

[`App.java:21-31`](./src/App.java#L22-L31)

```java
// Empty parameter
public Car() {
  this.brand = "DEFAULT CARD";
}

// With Parameter
public Car(String brand, String type, String color, int speed) {
  this.brand = brand;
  this.type = type;
  this.color = color;
  this.speed = speed;
}
```

#### 2. Destructor

Now important part, Java **does NOT have a real destructor like C++**.

In languages like C++, destructors free memory manually.

But in Java:

- Memory is handled automatically
- It uses something called Garbage Collector (GC)

So when an object is no longer used, Java automatically removes it from memory.

## 4 Pillars of OOP

---

#### 1. Encapsulation

Encapsulation means **hiding internal data** and controlling access using methods.

In `Car` class:

```java
protected String brand;
protected int speed;

public int getSpeed() {
    return speed;
}

public void setSpeed(int newSpeed) {
    speed = newSpeed;
}
```

[`Oop.java:13-16`](./src/Oop.java#L13-L16)

Instead of accessing `speed` directly, we use:

- `getSpeed()` → to read value
- `setSpeed()` → to modify value

This protects the object from invalid or uncontrolled changes.

#### 2. Abstraction

Abstraction means **hiding implementation details** and showing only essential behavior.

Example:

[`Oop.java:25`](./src/Oop.java#L25)

```java
abstract class Car {
    abstract void startEngine();
}
```

- `Car` is an abstract class.
- It declares `startEngine()` but does not define how it works.

Each child class provides its own implementation:

[`Oop.java:49-51`](./src/Oop.java#L49-L51)

```java
public void startEngine() {
    System.out.println("ELECTRIC ENGINE START");
}
```

[`Oop.java:59-61`](./src/Oop.java#L59-L61)

```java
public void startEngine() {
    System.out.println("GAS ENGINE START");
}
```

The user of the class does not need to know how the engine works internally.

#### 3. Inheritance

Inheritance allows one class to **reuse and extend** another class.

```java
class ElectricCar extends Car
class GasCar extends Car
```

Both `ElectricCar` and `GasCar` inherit:

- `brand`
- `type`
- `color`
- `speed`
- getters and setters

They reuse constructor via:

[`Oop.java:46`](./src/Oop.java#L46)

```java
super(brand, type, color, speed);
```

This avoids code duplication.

#### 4. Polymorphism

Polymorphism means **one type, many forms**.

In `main` method:

[`Oop.java:3-5`](./src/Oop.java#L3-L5)

```java
Car electricCar = new ElectricCar(...);
Car gasCar = new GasCar(...);
```

Notice:

- The reference type is `Car`
- The actual object type is different

If you call:

```java
electricCar.startEngine();
gasCar.startEngine();
```

Java will automatically call the correct version of `startEngine()` depending on the actual object.

This is called **runtime polymorphism (method overriding)**.
