package de.seism0saurus.design.pattern.factory.before;

import java.math.BigDecimal;

public class StandardCreditCard {
    BigDecimal limit = BigDecimal.valueOf(1000L);

    @Override
    public String toString() {
        return "Standard credit card with limit " + limit.toString();
    }
}
