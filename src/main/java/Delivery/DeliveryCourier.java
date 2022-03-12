package Delivery;

import Category.Category;

//Single-responsibility principle
//Open-Close principle
public class DeliveryCourier implements Delivery {

    private String nameDelivery = "Courier delivery on foot";
    protected String nameCourier;
    protected int speed;

    public DeliveryCourier(String nameCourier, int speed) {
        this.nameCourier = nameCourier;
        this.speed = speed;
    }

    @Override
    public String getNameDelivery() {
        return nameDelivery;
    }

    public String getNameCourier() {
        return nameCourier;
    }

    @Override
    public String delivery() {
        return "Hi! I like to walk, so it will take a little longer to deliver your order. Thanks for understanding.";
    }

    @Override
    public boolean getDeliveryPossibility(int roadDistance, int waitingTime, Category category) {
        boolean possibility = false;
        if (!category.equals(Category.LARGE_HOME_APPLIANCES) && !category.equals(Category.TELEVISIONS)) {
            if (waitingTime >= roadDistance / speed) {
                possibility = true;
            }
        }
        return possibility;
    }
}
