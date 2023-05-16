package lld.designpatterns.decorator;

public class ChocoChips implements IceCreamConeConstitutents{
    private IceCreamConeConstitutents iceCreamConeConstitutents;

    public ChocoChips(IceCreamConeConstitutents iceCreamConeConstitutents) {
        this.iceCreamConeConstitutents = iceCreamConeConstitutents;
    }

    @Override
    public int getCost() {
        return iceCreamConeConstitutents.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstitutents.getDescription() + " + Choco Chips";
    }
}
