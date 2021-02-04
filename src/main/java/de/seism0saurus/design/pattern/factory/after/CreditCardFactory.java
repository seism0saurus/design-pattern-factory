package de.seism0saurus.design.pattern.factory.after;

public class CreditCardFactory {

    public CreditCard issueCreditCard(CardType type) {
        return switch (type) {
            case STANDARD -> new StandardCreditCard();
            case GOLD -> new GoldCreditCard();
            case PLATINUM -> new PlatinumCreditCard();
        };
    }
}
