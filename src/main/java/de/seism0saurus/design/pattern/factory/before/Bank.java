package de.seism0saurus.design.pattern.factory.before;

public class Bank {

    StandardCreditCard issueStandardCreditCard() {
        return new StandardCreditCard();
    }

    GoldCreditCard issueGoldCreditCard() {
        return new GoldCreditCard();
    }

    PlatinumCreditCard issuePlatinumCreditCard() {
        return new PlatinumCreditCard();
    }
}
