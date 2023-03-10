package app;

import app.discount.Discount;
import app.discount.DiscountCondition.CozDiscountCondition;
import app.discount.DiscountCondition.DiscountCondition;
import app.discount.DiscountCondition.KidDiscountCondition;
import app.discount.discountPolicy.FixedAmountDiscountPolicy;
import app.discount.discountPolicy.FixedRateDiscountPolicy;
import app.product.ProductRepository;

public class AppConfigurer {
    private Cart cart = new Cart(productRepository(), menu());

    public ProductRepository productRepository() {
        return new ProductRepository();
    }

    public Menu menu() {
        return new Menu(productRepository().getAllProducts());
    }

    public Cart cart() {
        return cart;
    }

    public Discount discount() {
        return new Discount(
                new DiscountCondition[]{
                        new CozDiscountCondition(new FixedRateDiscountPolicy(10)),
                        new KidDiscountCondition(new FixedAmountDiscountPolicy(500))
                });
    }

    public Order order() {
        return new Order(cart(), discount());
    }
}