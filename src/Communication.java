import java.util.ArrayList;
import java.util.List;

public interface Communication {

    default double costOfItem(Storage storage){
        return storage.getCost();
    }

    default void isItemsInStorage(Seller seller, List<Item> wishListOfConsumer) {
        for (Item item : wishListOfConsumer) {
            if (!seller.getItems().contains(item)) {
                System.out.println("У нас нет " + item.getNameOfItem());
            }
        }
    }

    //Дописать метод
    default double totalCost(ArrayList<Item> storage){
        double reCost =0;
        for (Item item:storage){
            reCost += costOfItem((Storage) item);
        }
        return reCost;
    }

    default void areYouPoor (Consumer consumer){
        if(totalCost(consumer.basketlist) > consumer.getMoney()){
            System.out.println("Ты нищеброд");
        } else {
            walkInStorage();
        }
    }


    //У Покупателя и Продавца реализовать свои вариации метода "пойти на склад"
    void walkInStorage();
}