package de.seism0saurus.design.pattern.factory.after;

public class Bank {

    CreditCardFactory factory = new CreditCardFactory();

    CreditCard issueCreditCard(CardType type) {
        return factory.issueCreditCard(type);
    }
}
