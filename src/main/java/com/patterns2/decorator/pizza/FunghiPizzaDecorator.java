package com.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class FunghiPizzaDecorator extends AbstractPizzaDecorator {
    public FunghiPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(3));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+ " + mushrooms";
    }
}
