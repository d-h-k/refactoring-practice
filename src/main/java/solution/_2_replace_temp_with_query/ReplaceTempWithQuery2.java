package solution._2_replace_temp_with_query;


public class ReplaceTempWithQuery2 {
    private final int quantity;
    private final int itemPrice;

    public ReplaceTempWithQuery2(int quantity, int itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    //TODO : 임시변수에 값이 여러번 대입되는 케이스
    // 메소드설명 : 임시변수에 값이 두 번 할당되는 케이스를 만든 것
    public double getPrice() {
        return finalBasePrice();
    }

    private double finalBasePrice() {
        return getBasePrice() * getDiscountFactor() * 2;
    }

    private double getDiscountFactor() {
        //double discountFactor;
        return (getBasePrice() > 1000) ? 0.98 : 0.95;
    }

    private int getBasePrice() {
        return quantity * itemPrice;
    }
}
