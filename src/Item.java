public class Item {
    private String nameOfItem;
    private Category category;
    private int quantity;
    public Item(String nameOfItem, Category category, int quantity) {
        this.nameOfItem = nameOfItem;
        this.category = category;
        this.quantity = quantity;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getquantity() {
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

}
