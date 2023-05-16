package lld.designpatterns.decorator;

public class StrawberryScoop implements  IceCreamConeConstitutents{
    private IceCreamConeConstitutents iceCreamConeConstitutents;

    public StrawberryScoop(IceCreamConeConstitutents iceCreamConeConstitutents) {
        this.iceCreamConeConstitutents = iceCreamConeConstitutents;
    }

    @Override
    public int getCost() {
        return iceCreamConeConstitutents.getCost() + 15;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstitutents.getDescription() + " + Strawberry Scoop";
    }
}
