import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Consumer consumer = new Consumer("Иван", random.nextDouble(100), random.nextInt(10));
        Seller seller = new Seller("Марфа",random.nextDouble(100), random.nextInt(10));

        seller.getItems().add(new Storage("Манго",1,Category.Food,10));
        seller.getItems().add(new Storage("Апельсин",1.2,Category.Food,10));
        consumer.getWishList().add(new Item("Манго",Category.Food,1));
        consumer.getWishList().add(new Item("Апельсин",Category.Food,1));
        consumer.getWishList().add(new Item("Вода",Category.Water,1));

        System.out.println(consumer.getLoveIndex());
        System.out.println(seller.getLoveIndex());
        consumer.walkInStorage();
        seller.walkInStorage();
    }
}
