package model;


public class Meat extends Food implements Discountable {

    public Meat(int amount, double price) {
        super(amount, price, false); // устанавливает для флага isVegetarian правильное значение (не вегетарианское)
    }

    @Override
    public double getDiscount() {
        return 0; // скидка 0, т.к. не указано обратное
    }
}