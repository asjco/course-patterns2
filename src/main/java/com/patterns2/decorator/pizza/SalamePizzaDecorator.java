package com.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalamePizzaDecorator extends AbstractPizzaDecorator {
    public SalamePizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+ " + salame";
    }
}
