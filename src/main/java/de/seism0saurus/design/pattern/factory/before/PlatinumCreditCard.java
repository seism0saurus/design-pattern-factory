package de.seism0saurus.design.pattern.factory.before;

import java.math.BigDecimal;

public class PlatinumCreditCard {
    BigDecimal limit = BigDecimal.valueOf(10000L);

    @Override
    public String toString() {
        return "Platinum credit card with limit " + limit.toString();
    }
}
