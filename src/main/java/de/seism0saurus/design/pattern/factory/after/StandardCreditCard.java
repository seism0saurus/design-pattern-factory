package de.seism0saurus.design.pattern.factory.after;

import java.math.BigDecimal;

public class StandardCreditCard implements CreditCard {
    BigDecimal limit = BigDecimal.valueOf(1000L);

    @Override
    public String toString() {
        return "Standard credit card with limit " + limit.toString();
    }
}
