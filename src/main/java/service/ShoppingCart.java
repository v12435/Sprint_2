package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    // получить общую сумму товаров в корзине без скидки
    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    // получить общую сумму товаров в корзине со скидкой
    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double price = item.getTotalPrice();
            double discount = 0;
            if (item instanceof Discountable) {
                discount = ((Discountable) item).getDiscount();
            }
            total += price * (1 - discount / 100);
        }
        return total;
    }

    // получить общую сумму всех вегетарианских продуктов в корзине без скидки
    public double getTotalVegetarianPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getTotalPrice();
            }
        }
        return total;
    }
}