package Delivery;

import Category.Category;

//Single-responsibility principle
//Open-Close principle
public class DeliveryByCar implements Delivery {

    private String nameDelivery = "Delivery by car";
    protected String modelCarName;
    protected int speed;

    public DeliveryByCar(String modelCarName, int speed) {
        this.modelCarName = modelCarName;
        this.speed = speed;
    }

    @Override
    public String getNameDelivery() {
        return nameDelivery;
    }

    @Override
    public String delivery() {
        String driverSay = "Hi! I will deliver your order very quickly, but you should think of CO2 emissions";
        return driverSay;
    }

    @Override
    public boolean getDeliveryPossibility(int roadDistance, int waitingTime, Category category) {
        boolean possibility = waitingTime >= roadDistance / speed;
        return possibility;
    }
}
