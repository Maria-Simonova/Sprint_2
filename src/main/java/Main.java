import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, "red");
        Apple greenApple = new Apple(8, 60, "green");

        Food[] products = new Food[]{
                meat,
                redApple,
                greenApple
        };
        ShoppingCart cart = new ShoppingCart(products);
        System.out.println("Общая сумма товаров без скидки = " + cart.totalPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скиидкой = " + cart.totalPriceDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки = " + cart.totalPriceVegeterian());
    }
}

