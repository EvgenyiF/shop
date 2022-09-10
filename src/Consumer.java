import java.util.ArrayList;

public class Consumer extends Human{
    ArrayList<Item> wishList = new ArrayList<>();
    ArrayList<Item> basketlist = new ArrayList<>();

    public ArrayList<Item> getWishList() {
        return wishList;
    }

    public void setWishList(ArrayList<Item> wishList) {
        this.wishList = wishList;
    }

    public ArrayList<Item> getBasketlist() {
        return basketlist;
    }

    public void setBasketlist(ArrayList<Item> basketlist) {
        this.basketlist = basketlist;
    }



    public Consumer(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
    }

    @Override
    public void walkInStorage() {

        if (getLoveIndex()<5){
            System.out.println("Пусти меня на склад я сам все проверю!!!!");
        } else if (getLoveIndex()==5) {
            System.out.println("Могу ли зайти на склад сам посмотреть");
        } else {
            System.out.println("Сходите пожалуйста на склад проверить наличие");
        }
    }
}
