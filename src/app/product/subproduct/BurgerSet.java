package app.product.subproduct;

public class BurgerSet extends app.product.Product {
    private Hamburger hamburger;
    private Side side;
    private Drink drink;

    public BurgerSet(String name, int price, int kcal, Hamburger hamburger, Side side, Drink drink) {
        super(name, price, kcal);
        this.hamburger = hamburger;
        this.side = side;
        this.drink = drink;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public Side getSide() {
        return side;
    }

    public Drink getDrink() {
        return drink;
    }
}
