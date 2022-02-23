package Delivery;

import Category.Category;

//Single-responsibility principle
//Open-Close principle
public class DeliveryByDrone implements Delivery {

    private String nameDelivery = "Delivery by drone";
    protected String modelName;
    protected int speed;

    public DeliveryByDrone(String modelName, int speed) {
        this.modelName = modelName;
        this.speed = speed;
    }

    @Override
    public String getNameDelivery() {
        return nameDelivery;
    }

    @Override
    public String delivery() {
        String droneSay = "Hello, human! Your order will be delivered by a smart robot.";
        return droneSay;
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

