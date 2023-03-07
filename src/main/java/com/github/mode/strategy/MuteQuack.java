package com.github.mode.strategy;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
