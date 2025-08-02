package model;

import model.constants.Color;
import model.constants.Discount;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(Color.RED)) {
            return Discount.DISCOUNT_AMOUNT;
        } else if (colour.equals(Color.GREEN)) {
            return 0;
        }
        return 0;
    }


}
