package com.patterns2.decorator.pizza;

import java.math.BigDecimal;

public interface PizzaOrder {
    public BigDecimal getPrice();
    public String getIngredients();
}
