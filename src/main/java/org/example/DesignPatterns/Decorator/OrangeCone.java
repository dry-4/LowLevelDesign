package org.example.DesignPatterns.Decorator;

public class OrangeCone implements IceCreamConeConstitutents{

    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
