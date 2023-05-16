package lld.designpatterns.decorator;

public class Client {

    public static void main(String[] args) {
        IceCreamConeConstitutents iceCreamConeConstitutents =
                new ChocoChips(
                        new VanillaScoop(
                                new StrawberryScoop(
                                        new ChocoChips(
                                                new ChocolateCone(
                                                        new ChocolateCone(
                                                                new OrangeCone()
                                                        )
                                                )
                                        )
                                )
                        )
                );

        System.out.println(iceCreamConeConstitutents.getDescription());
        System.out.println(iceCreamConeConstitutents.getCost());
    }
}
