package service;

import model.Food;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double totalPriceWithoutDiscount() {
        double totalPrice = 0.0;
        for (Food product : products) {
            totalPrice += product.getAmount() * product.getPrice();
        }
        return totalPrice;
    }

    public double totalPriceDiscount() {
        double totalPrice = 0.0;
        for (Food product : products) {
            double discount = product.getDiscount();
            totalPrice += product.getAmount() * product.getPrice() * (1 - discount / 100);
        }
        return totalPrice;
    }

    public double totalPriceVegeterian() {
        double totalPrice = 0.0;
        for (Food product : products) {
            if (product.isVegetarian()) {
                totalPrice += product.getAmount() * product.getPrice();
            }
        }
        return totalPrice;
    }
}
