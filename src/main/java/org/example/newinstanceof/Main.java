package org.example.newinstanceof;

public class Main {

  public static void main(String[] args) {
    // upcasting, variable fruit is of type Fruit, but object it references is of type Apple
    Fruit fruit = new Apple("Granny Smith", "green");
    Fruit fruit1 = new Pear("Yellow Pear", "round");

    System.out.println(fruit.getName());
    Apple fruitAsApple = (Apple) fruit;
    fruitAsApple.color();

    // in the runtime, when we run application, we will get Apple and Pear types printed
    // dynamic polymorphism, in runtime fruit will be Apple, in compile time it is Fruit
    System.out.println(fruit.getClass());
    System.out.println(fruit1.getClass());

    // in compile time we can't say fruit.color() because fruit variable is of type Fruit
    // if we want to call method from Apple class, we need to cast fruit from Fruit to Apple
    // old way
    if (fruit instanceof Apple) {
      Apple apple = (Apple) fruit;
      apple.color();
    }
    if (fruit instanceof Pear) {
      Pear pear = (Pear) fruit;
      pear.shape();
    }

    // new way
    if (fruit1 instanceof Apple apple) {
      apple.color();
    }
    if (fruit1 instanceof Pear pear) {
      pear.shape();
    }
  }
}