import java.util.ArrayList;
import java.util.List;

public class Seller extends Human{
    private List<Storage> items = new ArrayList<>();

    public Seller(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
    }

    public List<Storage> getItems() {
        return items;
    }

    @Override
    public void walkInStorage() {
        if (getLoveIndex()<5){
            System.out.println("Я тебя сейчас вышвырну из магазина!!!!");
        } else if (getLoveIndex()==5) {
            System.out.println("Можете зайти глянуть");
        } else {
            System.out.println("Сейчас схожу на склад проверю");
        }
    }
}
