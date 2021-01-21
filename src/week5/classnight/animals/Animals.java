package week5.classnight.animals;

public class Animals {
  static interface Animal {
    void move();
    void speak();
    void eat();
    String favoriteFood();
  }
  abstract class Mammal implements Animal {
    @Override
    public void move() {
      System.out.println("I am walking on my 4 legs!");
    }
    @Override
    public void eat() {
      System.out.println("I am eating my favorite food: " + favoriteFood());
    }
  }
  class Bat extends Mammal {
    private String foodFromDb = "Fruit";
    
    public String getFood() {
      return foodFromDb;
    }
    
    @Override
    public void speak() {
      System.out.println("Squeak");
    }
    @Override
    public String favoriteFood() {
      return getFood();
    }
    @Override
    public void move() {
      System.out.println("I am flying");
    }
  }
  class Dog extends Mammal {
    private String name;
    private int age;
    private String food;
    
    public Dog(String name, int age, String food) {
      this.name = name;
      this.age = age;
      this.food = food;
    }
    @Override
    public void speak() {
      System.out.println("Woof!");
    }
    @Override
    public String favoriteFood() {
      return "Waffles";
    }
    public String name() {
      return name;
    }
    @Override
    public String toString() {
      return "Dog: name=" + name + ", age=" + age + ", food=" + food;
    }
    
  }
  
  void run() {
    Dog dog = new Dog("Bananas", 5, "Alex");
    System.out.println(dog.toString());
    
    Dog fussy = new Dog("Fussy", 3, "Peaches");
    System.out.println(fussy);
  }
  
  public static void main(String[] args) {
    new Animals().run();
  }
}
