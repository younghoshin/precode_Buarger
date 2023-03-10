package app.discount.DiscountCondition;

public interface DiscountCondition {
    void checkDiscountCondition();
    int applyDiscount(int price);
    boolean isSatisfied();
}
