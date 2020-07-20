package com.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaOrderWithSalameGetPrice(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new SalamePizzaDecorator(pizzaOrder);

        //When
        BigDecimal price = pizzaOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(19), price);
    }

    @Test
    public void testPizzaOrderWithSalameGetIngredients(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new SalamePizzaDecorator(pizzaOrder);

        //When
        String ingredients = pizzaOrder.getIngredients();

        //Then
        assertEquals("Ingredients: dough + tomato sauce + cheese + salame", ingredients);
    }

    @Test
    public void testPizzaOrderWithDobleCheeseAndMushroomsGetPrice(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new DoubleCheesePizzaDecorator(pizzaOrder);
        pizzaOrder = new FunghiPizzaDecorator(pizzaOrder);

        //When
        BigDecimal price = pizzaOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(24), price);
    }

    @Test
    public void testPizzaOrderWithDobleCheeseAndMushroomsGetIngredients(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new DoubleCheesePizzaDecorator(pizzaOrder);
        pizzaOrder = new FunghiPizzaDecorator(pizzaOrder);

        //When
        String ingredients = pizzaOrder.getIngredients();

        //Then
        assertEquals("Ingredients: dough + tomato sauce + cheese + extra cheese + mushrooms", ingredients);
    }
}
