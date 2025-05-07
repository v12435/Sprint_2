import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Создание продуктов
        Food meat = new Meat(5, 100);                  // Мясо в количестве 5 кг по цене 100 рублей за кг
        Food redApple = new Apple(10, 50, "red");      // Яблоки красные в количестве 10 кг по цене 50 рублей
        Food greenApple = new Apple(8, 60, "green");   // Яблоки зелёные в количестве 8 кг по цене 60 рублей

        // Создаём массив продуктов из этих элементов и инициализируем корзину с помощью созданного массива
        Food[] products = { meat, redApple, greenApple };
        ShoppingCart cart = new ShoppingCart(products);

        // Выводим на экран
        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getTotalVegetarianPriceWithoutDiscount());
    }
}