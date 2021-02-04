package de.seism0saurus.design.pattern.factory.after;

public class Example {

    public static void main(String[] args) {
        Bank bank = new Bank();

        CreditCard standardCreditCard = bank.issueCreditCard(CardType.STANDARD);
        System.out.println(standardCreditCard);

        CreditCard goldCreditCard = bank.issueCreditCard(CardType.GOLD);
        System.out.println(goldCreditCard);

        CreditCard platinumCreditCard = bank.issueCreditCard(CardType.PLATINUM);
        System.out.println(platinumCreditCard);
    }
}
