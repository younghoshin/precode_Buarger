package app.discount.discountPolicy;

public class FixedRateDiscountPolicy implements DiscountPolicy {

    // 할인 비율
    private int discountRate;

    // 생성자
    public FixedRateDiscountPolicy(int discountRate) {
        this.discountRate = discountRate;
    }

    // 할인 적용 금액을 계산하는 메서드
    public int calculateDiscountedPrice(int price) {
        return price - (price * discountRate / 100);
    }
}

