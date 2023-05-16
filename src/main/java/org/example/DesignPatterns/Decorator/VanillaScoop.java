package org.example.DesignPatterns.Decorator;

public class VanillaScoop implements  IceCreamConeConstitutents{
    private IceCreamConeConstitutents iceCreamConeConstitutents;

    public VanillaScoop(IceCreamConeConstitutents iceCreamConeConstitutents) {
        this.iceCreamConeConstitutents = iceCreamConeConstitutents;
    }

    @Override
    public int getCost() {
        return iceCreamConeConstitutents.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstitutents.getDescription() + " + Vanilla Scoop";
    }
}
