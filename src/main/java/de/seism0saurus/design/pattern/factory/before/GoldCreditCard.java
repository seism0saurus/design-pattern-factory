package de.seism0saurus.design.pattern.factory.before;

import java.math.BigDecimal;

public class GoldCreditCard {

    BigDecimal limit = BigDecimal.valueOf(2500L);

    @Override
    public String toString() {
        return "Gold credit card with limit " + limit.toString();
    }
}
