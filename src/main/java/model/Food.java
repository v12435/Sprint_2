package model;

public abstract class Food {
    protected int amount; // количество продукта в килограммах (целое число)
    protected double price; // цена за единицу (вещественное число)
    protected boolean isVegetarian; // флаг, который показывает, вегетарианский ли продукт

    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getTotalPrice() {
        return amount * price;
    }
}
