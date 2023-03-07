package com.github.mode.strategy;

// 策略模式
public abstract class Duck {
  QuackBehavior quackBehavior;
  FlyBehavior flyBehavior;

  public Duck() {
  }

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
}
