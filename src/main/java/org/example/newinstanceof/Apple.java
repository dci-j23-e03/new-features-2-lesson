package org.example.newinstanceof;

public class Apple extends Fruit {
  private String color;

  public Apple(String name, String color) {
    super(name);
    this.color = color;
  }

  public void color() {
    System.out.println("Apple color: " + color);
  }
}
