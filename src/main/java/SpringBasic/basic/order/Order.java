package SpringBasic.basic.order;

public class Order {

    private Long id;
    private String name;
    private int itemPrice;
    private int discountPrice;

    public Order(Long id, String name, int itemPrice,int discountPrice) {
        this.id = id;
        this.name = name;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;

    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int CalculatePrice(){
        return itemPrice-discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "discountPrice=" + discountPrice +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
