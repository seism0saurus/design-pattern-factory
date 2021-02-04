package de.seism0saurus.design.pattern.factory.before;

public class Example {

    public static void main(String[] args) {
        Bank bank = new Bank();

        StandardCreditCard standardCreditCard = bank.issueStandardCreditCard();
        System.out.println(standardCreditCard);

        GoldCreditCard goldCreditCard = bank.issueGoldCreditCard();
        System.out.println(goldCreditCard);

        PlatinumCreditCard platinumCreditCard = bank.issuePlatinumCreditCard();
        System.out.println(platinumCreditCard);
    }
}
