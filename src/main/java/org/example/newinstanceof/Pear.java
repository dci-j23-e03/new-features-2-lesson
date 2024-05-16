package org.example.newinstanceof;

public class Pear extends Fruit {
  private String shape;

  public Pear(String name, String shape) {
    super(name);
    this.shape = shape;
  }

  public void shape() {
    System.out.println("Pear shape: " + shape);
  }
}
