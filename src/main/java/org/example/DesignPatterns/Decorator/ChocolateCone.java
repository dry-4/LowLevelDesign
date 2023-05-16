package org.example.DesignPatterns.Decorator;

public class ChocolateCone implements IceCreamConeConstitutents{

    private IceCreamConeConstitutents iceCreamConeConstitutents;

    public ChocolateCone() {}

    public ChocolateCone(IceCreamConeConstitutents iceCreamConeConstitutents) {
        this.iceCreamConeConstitutents = iceCreamConeConstitutents;
    }

    @Override
    public int getCost() {
        if (iceCreamConeConstitutents != null) {
            return iceCreamConeConstitutents.getCost() + 30;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        if (iceCreamConeConstitutents != null) {
            return iceCreamConeConstitutents.getDescription() + " + Chocolate Cone";
        }

        return "Chocolate Cone";
    }
}
